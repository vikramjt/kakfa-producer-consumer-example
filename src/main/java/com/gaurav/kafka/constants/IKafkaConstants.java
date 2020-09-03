package com.gaurav.kafka.constants;

public interface IKafkaConstants {
	//String KAFKA_BROKERS = "vikram-latitude-5400:9094";
	String KAFKA_BROKERS = "localhost:9092";

	Integer MESSAGE_COUNT=1000;
	
	String CLIENT_ID="client1";
	
	//String TOPIC_NAME="demo";
	String TOPIC_NAME="test";

	String GROUP_ID_CONFIG="consumerGroup12";
	//String GROUP_ID_CONFIG = "test-consumer-group";
	
	Integer MAX_NO_MESSAGE_FOUND_COUNT=100;
	
	String OFFSET_RESET_LATEST="latest";
	
	String OFFSET_RESET_EARLIER="earliest";
	
	Integer MAX_POLL_RECORDS=1;
}
