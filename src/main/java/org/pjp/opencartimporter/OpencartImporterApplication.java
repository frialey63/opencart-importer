package org.pjp.opencartimporter;

import org.pjp.opencart.db.service.OpencartDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;

@ComponentScan(basePackages = { "org.pjp.opencart.db.service" })
@SpringBootApplication
@Theme(value = "ocimport")
@PWA(name = "OpenCart Importer", shortName = "OpenCart Importer", offlineResources = {})
@NpmPackage(value = "line-awesome", version = "1.3.0")
public class OpencartImporterApplication extends SpringBootServletInitializer implements AppShellConfigurator, ApplicationRunner {

	private static final long serialVersionUID = -1301730919703635434L;
	
	@Autowired
	private OpencartDbService service;
	
    public static void main(String[] args) {
		SpringApplication.run(OpencartImporterApplication.class, args);
	}

    @Override
    public void run(ApplicationArguments args) throws Exception {
    	service.doIt();
    }

}
