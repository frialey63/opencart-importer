package org.pjp.opencart.db.service;

import java.util.Date;
import java.util.Optional;

import org.pjp.opencart.db.model.OcCategoryDescription;
import org.pjp.opencart.db.model.OcGoogleshoppingProduct;
import org.pjp.opencart.db.model.OcManufacturer;
import org.pjp.opencart.db.model.OcProduct;
import org.pjp.opencart.db.model.OcProductDescription;
import org.pjp.opencart.db.model.OcProductDescriptionPK;
import org.pjp.opencart.db.model.OcProductToCategory;
import org.pjp.opencart.db.model.OcProductToCategoryPK;
import org.pjp.opencart.db.model.OcProductToLayout;
import org.pjp.opencart.db.model.OcProductToLayoutPK;
import org.pjp.opencart.db.model.OcProductToStore;
import org.pjp.opencart.db.model.OcProductToStorePK;
import org.pjp.opencart.db.repository.OcCategoryDescriptionRepository;
import org.pjp.opencart.db.repository.OcGoogleshoppingProductRepository;
import org.pjp.opencart.db.repository.OcManufacturerRepository;
import org.pjp.opencart.db.repository.OcProductAttributeRepository;
import org.pjp.opencart.db.repository.OcProductDescriptionRepository;
import org.pjp.opencart.db.repository.OcProductRepository;
import org.pjp.opencart.db.repository.OcProductToCategoryRepository;
import org.pjp.opencart.db.repository.OcProductToLayoutRepository;
import org.pjp.opencart.db.repository.OcProductToStoreRepository;
import org.pjp.opencartimporter.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

@EntityScan("org.pjp.opencart.db.model")
@EnableJpaRepositories("org.pjp.opencart.db.repository")
@Service
public class OpencartDbService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OpencartDbService.class);

    private static final int STORE_ID = 0;
	
    private static final int LAYOUT_ID = 0;
	
	@Autowired
	private OcGoogleshoppingProductRepository googleProdRepo;
	
	@Autowired
	private OcProductToStoreRepository prodToStoreRepo;
	
	@Autowired
	private OcProductToLayoutRepository prodToLayoutRepo;
	
	@Autowired
	private OcProductToCategoryRepository prodToCategoryRepo;
	
	@Autowired
	private OcProductDescriptionRepository prodDescRepo;
	
	@Autowired
	private OcProductAttributeRepository prodAttrRepo;
	
	@Autowired
	private OcProductRepository prodRepo;
	
	@Autowired
	private OcManufacturerRepository manufacRepo;
	
	@Autowired
	private OcCategoryDescriptionRepository categoryDescRepo;
	
	public void doIt() {
//    	OcGoogleshoppingProduct product = new OcGoogleshoppingProduct(5000, 0, 0, 0, 0, "pending", 0, (byte) 0, 51, 0);
//    	
//    	LOGGER.info("saving google-product {}", product);
//    	googleProdRepo.save(product);
    	
//    	OcProductToStore prodToStore = new OcProductToStore(new OcProductToStorePK(5000, 0));
//    	
//    	LOGGER.info("saving product-to-store {}", prodToStore);
//    	prodToStoreRepo.save(prodToStore);
    	
//    	OcProductToLayout prodToLayout = new OcProductToLayout(new OcProductToLayoutPK(5000, 0), 0);
//    	
//    	LOGGER.info("saving product-to-layout {}", prodToLayout);
//    	prodToLayoutRepo.save(prodToLayout);
    	
//    	OcProductToCategory prodToCategory = new OcProductToCategory(new OcProductToCategoryPK(5000, 0));
//    	
//    	LOGGER.info("saving product-to-category {}", prodToCategory);
//    	prodToCategoryRepo.save(prodToCategory);
    	
//    	OcProductDescription prodDesc = new OcProductDescription(new OcProductDescriptionPK(5000, 1), "description", "metaDescription", "metaKeyword", "metaTitle", "name", "tag");
//    	
//    	LOGGER.info("saving product-description {}", prodDesc);
//    	prodDescRepo.save(prodDesc);
    	
//    	OcProductAttribute prodAttr = new OcProductAttribute(new OcProductAttributePK(5000, 18, 1), "text");
//    	
//    	LOGGER.info("saving product-attribute {}", prodAttr);
//    	prodAttrRepo.save(prodAttr);
    	
//		Date today = new Date();
//		
//		OcProduct prod = new OcProduct(5000, today, today, today, "ean", 0.0, "isbn", "jan", 0.0, 0, "location", 12, 0, "model", "mpn", 0, 0.0, 1, (byte) 0, "sku", 0, (byte) 0, 0, (byte) 0, 0, "upc", 0, 0.0, 0, 0.0);
//    	
//    	LOGGER.info("saving product {}", prod);
//    	prodRepo.save(prod);
    	
//		manufacRepo.findFirstByName("Airfix").ifPresent(m -> System.out.println(m));
//		categoryDescRepo.findFirstByName("Corgi").ifPresent(cd -> System.out.println(cd));
		
//		Product product = new Product("0", "AA28801", 10, "catalog/Corgi/aa28801_1_bristol-f2b-fighter-scenic.jpg", "Corgi", 84.99f, "", "AA28801 Bristol F2B Fighter D-8063", "Considered to be one of the finest...", "Corgi");
//		saveProduct(5000, product);
	}
	
	public void saveProduct(int productId, Product product) {
		Date today = new Date();
		
		Optional<OcCategoryDescription> optCategoryDesc = categoryDescRepo.findFirstByName(product.getCategoryName());
		
		if (optCategoryDesc.isPresent()) {
			OcCategoryDescription categoryDesc = optCategoryDesc.get();
			
			Optional<OcManufacturer> optManufacturer = manufacRepo.findFirstByName(product.getManufacturerName());

			if (optManufacturer.isPresent()) {
				OcManufacturer manufacturer = optManufacturer.get();
				
				OcProduct prod = new OcProduct(productId, product.getModel(), manufacturer.getManufacturerId(), "", today, "", product.getPrice(), product.getQuantity(), 0, 0.0, 0.0, 0.0, 0.0, product.getImage());
		    	LOGGER.info("saving product {}", prod);
		    	prodRepo.save(prod);
		    	
		    	OcProductDescription prodDesc = new OcProductDescription(new OcProductDescriptionPK(productId, 1), product.getDescription(), product.getName(), "");
		    	LOGGER.info("saving product-description {}", prodDesc);
		    	prodDescRepo.save(prodDesc);
		    	
		    	// TODO save the product attributes
		    	
		    	OcProductToCategory prodToCategory = new OcProductToCategory(new OcProductToCategoryPK(productId, categoryDesc.getId().getCategoryId()));
		    	LOGGER.info("saving product-to-category {}", prodToCategory);
		    	prodToCategoryRepo.save(prodToCategory);
		    	
		    	OcProductToLayout prodToLayout = new OcProductToLayout(new OcProductToLayoutPK(productId, STORE_ID), LAYOUT_ID);
		    	LOGGER.info("saving product-to-layout {}", prodToLayout);
		    	prodToLayoutRepo.save(prodToLayout);
		    	
		    	OcProductToStore prodToStore = new OcProductToStore(new OcProductToStorePK(productId, STORE_ID));
		    	LOGGER.info("saving product-to-store {}", prodToStore);
		    	prodToStoreRepo.save(prodToStore);
		    	
		    	OcGoogleshoppingProduct googleProduct = new OcGoogleshoppingProduct(productId, 0.0, 0, 0.0, "pending", 0, (byte) 0, productId, STORE_ID);
		    	
		    	LOGGER.info("saving google-product {}", googleProduct);
		    	googleProdRepo.save(googleProduct);
		
			} else {
				LOGGER.warn("failed to lookup category-description for product {}", product);
			}
		} else {
			LOGGER.warn("failed to lookup manufacturer for product {}", product);
		}
	}
	
}
