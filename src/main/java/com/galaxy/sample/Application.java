package com.galaxy.sample;

import com.galaxy.sample.config.MessageSourceProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({MessageSourceProperties.class})
public class Application implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(Application.class);

	@Autowired
	private MessageSourceProperties messageSourceProperties;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
//		app.addInitializers(CustomMessageSourceInitializer.class);
		app.run(args);

	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Props : {}", messageSourceProperties.getGuidelines());
	}
}
