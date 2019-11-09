package com.dbsh2htable2;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.dbsh2htable2" })
@EntityScan("com.dbsh2htable2.entity")
@EnableJpaRepositories("com.dbsh2htable2.repository")

public class DbsH2hTable2Application {

	private static final Logger logger = LoggerFactory.getLogger(DbsH2hTable2Application.class);

	public static void main(String[] args) {

		try {
			SpringApplication app = new SpringApplication(DbsH2hTable2Application.class);
			app.setDefaultProperties(Collections.singletonMap("server.port", Integer.parseInt(args[1])));
			app.run(args);
			logger.info("APP STARTED. PORT: " + args[1]);
		} catch (Exception e) {
			logger.error("ERROR: " + e.getMessage());
			ConfigurableApplicationContext ctx = SpringApplication.run(DbsH2hTable2Application.class, args);
			ctx.close();
		}

	}

}
