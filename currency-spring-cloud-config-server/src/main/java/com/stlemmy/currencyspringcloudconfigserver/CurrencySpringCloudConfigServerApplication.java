package com.stlemmy.currencyspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CurrencySpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencySpringCloudConfigServerApplication.class, args);
	}

}
