package org.pjp.opencartimporter.views.importcsv;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.pjp.opencart.db.service.OpencartDbService;
import org.pjp.opencartimporter.bean.Product;
import org.pjp.opencartimporter.views.MainLayout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MultiFileMemoryBuffer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Import CSV")
@Route(value = "importcsv", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class ImportCsvView extends VerticalLayout {

    private static final long serialVersionUID = 3386437553156944523L;
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ImportCsvView.class);

	private MultiFileMemoryBuffer buffer = new MultiFileMemoryBuffer();
	
	@Autowired
	private OpencartDbService service;

    public ImportCsvView() {
        Label label = new Label("First set base product ID then select the CSV file containing the eposNow product dataset for import into OpenCart.");
        
        Upload upload = new Upload(buffer);
    	
    	IntegerField idField = new IntegerField();
    	idField.setLabel("Product ID");
    	idField.setHasControls(true);
    	idField.setMin(5000);
    	idField.setValue(5000);
    	idField.addValueChangeListener(l -> {
    		upload.setMaxFiles(l.getValue() != null ? 1 : 0);
    	});
    	
        upload.addSucceededListener(event -> {
        	Integer productId = idField.getValue();
        	
        	if (productId != null) {
                String fileName = event.getFileName();
                InputStream inputStream = buffer.getInputStream(fileName);

                Reader in = new InputStreamReader(inputStream);

                try {
    				@SuppressWarnings("deprecation")
    				Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
     
    				int count = 0;
     
    				for (CSVRecord record : records) {
    				    String eposNowID = record.get("eposNowID");
    				    String model = record.get("model");
    				    int quantity = Integer.parseInt(record.get("quantity"));
    				    String image = record.get("image");
    				    String manufacturerName = record.get("manufacturerName");
    				    float price = Float.parseFloat(record.get("price"));
    				    String attributes = record.get("attributes");
    				    String name = record.get("name");
    				    String description = record.get("description");
    				    String categoryName = record.get("categoryName");
    				    
    				    Product product = new Product(eposNowID, model, quantity, image, manufacturerName, price, attributes, name, description, categoryName);
    				    LOGGER.info(product.toString());
    				    
    				    service.saveProduct(productId++, product);
    				     
    				    count++;
    				}

    				LOGGER.info("finished loading {} products from CSV into database", count);
    			} catch (NumberFormatException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
        	}
        });

        setMargin(true);
        setHorizontalComponentAlignment(Alignment.START, label, idField, upload);

        add(label, idField, upload);
    }

}
