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

## Create new project
- Create a new repository using microservice-template project
- Create a new module in new repository
- Add new module in main pom.xml

## Build and Run

### Build image only
```  
  # Local build
  make dockerBuild
  
  # Gitpod build
  make gdockerBuild
```

### Build image and push it to registry
```  
  # Local build
  make build
  
  # Gitpod build
  make gbuild
```

### Run docker containers defined in docker-compose.yml
```
  make up

  OR

  docker compose up -d
```

### Stop docker containers defined in docker-compose.yml
```
  make down

  OR

  docker compose down
```

## Continuous Integration

### Github Actions
#### Environment Variables

```
# Github Repository Secrets
DOCKERHUB_TOKEN : DockerHub Token
DOCKERHUB_USERNAME : DockerHub Username
PROJECT_ID : GCP Project Id
SERVICE_ACCOUNT_KEY : Service Account Key

# GIT Tag 
GIT_TAG_TYPE: ["patch", "minor", "major"]
GIT_TAG: Git tag version
```

#### Workflow

##### Continuous Integration
```
Trigger: 
- Push to develop branch
- Pull request to develop and main branches
```

##### Build and Push Image to Registry
```
Trigger:
- Push to main branch

Note: 
Commit message should contain one of the following strings 
  - to push artifact to Google Artifact Registry
      "bump", "gcp", "release"
  - to add git tags
    major.version - major release
    minor.version - minor release
    patch - empty or patch
```