package com.testyantra.jenkin.docker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinDockerApplicationTests {
	public static final Logger LOGGER = LoggerFactory.getLogger(SpringBootJenkinDockerApplicationTests.class);
	@Test
	void contextLoads() {
		LOGGER.info("Application Test Cases Started....");
		boolean expected=true;
		boolean actual=true;
		assertEquals(expected, actual);
	}

}
