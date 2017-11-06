# Spring-Cloud-Stream-DLQ-Error-Handling

## Starting a Kafka docker container and setup a Kafka console producer

(assuming you're using a Docker VM)

### Creating the container
docker run -d -p 2181:2181 -p 9092:9092 --env ADVERTISED_HOST=192.168.99.100 --env ADVERTISED_PORT=9092 --name kafkaf spotify/kafka

### Obtain a shell access to the container
docker exec -it kafkaf /bin/bash

### Start the Kafka console producer
/opt/kafka_2.11-0.10.1.0/bin/kafka-console-producer.sh --topic input --broker-list 127.0.0.1:9092
