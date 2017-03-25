# Spring 4 with Active MQ integration

## Features Demonstrated
Spring JMS Template Sender Reciever
Spring MDP
Active MQ Broker In Memory
Active MQ Broker DB Persistence
Broker FailOver


## Prerequisites
- JDK 1.8 or later
- Maven 3 or later

## Stack
- Spring  4.2.0.RELEASE
- ActiveMQ 5.14.1
- JUnit 4.12

## Run
- start activemq broker 
`mvn install`

## Known Issues with ActiveMQ
- The broker doesn't save the name in the DB while locking
- The demos won't run properly
