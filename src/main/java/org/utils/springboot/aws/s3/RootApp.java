package org.utils.springboot.aws.s3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main implementation class which serves two purpose in a spring boot application: Configuration and bootstrapping.
 */
@SpringBootApplication
public class RootApp {

	private static final Logger LOGGER = LoggerFactory.getLogger(RootApp.class);

	public static void main(String[] args) {
		SpringApplication.run(RootApp.class, args);
		LOGGER.info("SpringbootToAWSS3 application started successfully.");
	}
}
