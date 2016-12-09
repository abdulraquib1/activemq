package com.raq.activemq;

import static org.junit.Assert.*;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//http://docs.spring.io/spring-batch/reference/html/testing.html
//https://github.com/junit-team/junit4/wiki/Test-runners
//https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html

/**
 * Note: Prior to running this test
 * cd ACTIVEMQ_INSTALL_FOLDER\bin
 * Run activemq start
 * 
 * To validate the messages posted check
 * http://127.0.0.1:8161/admin/queues.jsp
 *  
 * @author araquib
 *
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-jms-context.xml" })
public class TestJMSMessageSender {
	
	@Autowired
	private JMSMessageSender jmsMessageSender;

	 // send to default destination
	@Test
	public void testSendDefaultDest() {
	    jmsMessageSender.send("hello JMS");
	}

	@Test
	public void testSendAnotherDest() {
		
		  // send to a code specified destination
	    Queue queue = new ActiveMQQueue("AnotherDest");
	    jmsMessageSender.send(queue, "hello Another Message");
	   
	}

	@Test
	public void testSendDefaultDestTest() {
	    jmsMessageSender.sendText("hello JMS Text");
	}


	@Test
	public void testRecieveMessageTest() {
	    assertNotNull(jmsMessageSender.recieveText());
	    System.out.println("receieved text"  + jmsMessageSender.recieveText());
	}

	
}
