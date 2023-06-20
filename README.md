# Elastic Stack on Spring Boot

This project is a sample application that shows how to use the Elastic Stack 
(Elasticsearch, Logstash, Kibana and Beats) to monitor a Spring Boot application.
Moreover, it's oriented to be used for a microservices architecture.
- All docker images needed are configured in the
[Docker compose file](docker-compose.yml).

## Spring Boot Application 🍃

This application is a simple Spring Boot application that exposes a simple 
controller with some log messages. All the logging configuration is done in the
[logback-spring.xml](src/main/resources/logback-spring.xml) file, basically
it's configured to send the logs via TCP to Logstash.
- To send the logs via TCP with Spring Boot, it has been added the
`logstash-logback-encoder` dependency to the project.

## Logstash 💾

Logstash is used to parse the logs and send them to Elasticsearch. The configuration
from Logstash is in the [logstash.conf](configuration/logstash/pipeline/logstash.conf) 
file, it's configured to create an index in Elasticsearch for each application
that sends logs to Logstash.

## Elasticsearch 🔎

Elasticsearch is used to store and index the logs.

## Kibana 👁️

Kibana is used to visualize the logs. Follow the next steps to configure
Kibana (with the 3 ELK services running):
- Go to the [Kibana web interface](http://localhost:5601) to check that it's running correctly.
- Start the Spring Boot application to generate some logs.
- [Create a data view](http://localhost:5601/app/management/kibana/dataViews) with the following configuration:
    - Name: `application-*`.
    - Time field: `@timestamp`.
- Now you can see the logs in the [Discover section](http://localhost:5601/app/discover#/).