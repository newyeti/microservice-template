# microservice-template
This is a template repository for creating microservice using Spring Boot.This project consists the configuration for tools for managing microservices.

## Configuration
- Discover Server
- Config Server
- API Gateway
- Observability
- Distributed Tracing

### Discover Server
Discover Server is a service registry used to discover the microservices running in the container. It uses Eureka Server/Client package.

### Config Server
Config Server allows to put common configuration at one place when working with multiple microservices. It allows to avoid redundency and helps to maintain the common application configurations.

### API Gateway
API Gateway is the reverse proxy for microservices. It is the gateway to access all the microservices in the container. The following are the services provided by API Gateway.
- Reverse Proxy to APIs
- Authentication
- Fallback method
- Rate Limit

### Observability
Observability is provided by Micrometer.

### Distributed Tracing 
Tracing is provided with Zipkin.


## Provided Containers
- Zookeeper
- Kafka Broker
- Schema Registry
- Schema Registry UI
- Control Central for Kafka Broker
- KeyCloak
- MongoDB
- Redis
- Zipkin
- ELK services
- Discovery Server
- Config Server
- API Gateway
