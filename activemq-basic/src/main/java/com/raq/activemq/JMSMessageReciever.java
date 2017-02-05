package com.raq.activemq;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class JMSMessageReciever {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	
	public String recieveText() {

		TextMessage message = (TextMessage) this.jmsTemplate.receive();
		try {
			return message.getText();
		} catch (JMSException e) {
			e.printStackTrace();
			return null;
		}

	}

	
}
