package com.raq.activemq;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.TextMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Able to test this only by running maven pom test, not directly through JUNIT class
 * @author araquib
 * 
 */
public class SpringMessageProcessor implements MessageListener{

	 public void onMessage(Message txtMessage) {
		 TextMessage message = (TextMessage) txtMessage;
		  try {
		      String msg = message.getText();
		      System.out.println("Text Message Recieved from Spring MDP : " + msg);
		      } catch (JMSException e) {
		    	  e.printStackTrace();
		      }
		  }

	
	 public void _onMessage(Message message) {
		  MapMessage mapMessage = (MapMessage) message;
		  try {
		      String strEmail = mapMessage.getString("mailId");
		      System.out.println("Mail #"+strEmail+" received.");
		      } catch (JMSException e) {
		    	  e.printStackTrace();
		      }
		  }
}
