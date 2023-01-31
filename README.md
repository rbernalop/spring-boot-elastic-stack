# Elastic Stack on Spring Boot

This project is a sample application that shows how to use the Elastic Stack 
(Elasticsearch, Logstash, Kibana and Beats) to monitor a Spring Boot application.
Moreover, it's oriented to be used for a microservices architecture.

## Spring Boot Application

This application is a simple Spring Boot application that exposes a simple 
controller with some log messages. All the logging configuration is done in the
[logback-spring.xml](src/main/resources/logback-spring.xml) file, basically
it's configured to log in the console and in a file with the application name.
- Also you can define the environment variable `LOGS_DIR` to change the default
directory where the logs are stored.

## Logstash

Logstash is used to parse the logs and send them to Elasticsearch. It's configured
with Docker in the [docker-compose.yml](docker-compose.yml) file. The configuration
from Logstash is in the [logstash.conf](configuration/logstash/pipeline/logstash.conf) 
file, it's configured to create an index in Elasticsearch for each log file in 
the logs directory.

## Elasticsearch

Elasticsearch is used to store and index the logs. It's configured with Docker in
the [docker-compose.yml](docker-compose.yml) file.

## Kibana

Kibana is used to visualize the logs. It's configured with Docker in the
[docker-compose.yml](docker-compose.yml) file.

## Beats

TODO 😃