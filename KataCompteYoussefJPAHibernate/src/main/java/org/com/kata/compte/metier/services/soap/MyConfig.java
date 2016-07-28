package org.com.kata.compte.metier.services.soap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class MyConfig {
	
	@Bean
	public SimpleJaxWsServiceExporter getWS() {
		SimpleJaxWsServiceExporter simpleJaxWsServiceExporter = new SimpleJaxWsServiceExporter();
		simpleJaxWsServiceExporter.setBaseAddress("http://localhost:8090/BanqueSi");
		return simpleJaxWsServiceExporter;
	}
}
