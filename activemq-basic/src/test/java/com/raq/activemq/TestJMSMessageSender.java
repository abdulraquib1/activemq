package com.raq.activemq;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//http://docs.spring.io/spring-batch/reference/html/testing.html
//https://github.com/junit-team/junit4/wiki/Test-runners
//https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:jms-context.xml" })
public class TestJMSMessageSender {
	
	@Autowired
	private JMSMessageSender jmsMessageSender;

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
