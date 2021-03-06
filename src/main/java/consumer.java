import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Arrays;
import java.util.Properties;

public class consumer {
    public static void main(String[] args) {
        Properties props = new Properties();

        String topicname = "kafkademo";
        String consumergroup = "kafkagroup";
        props.put("bootstrap.servers","localhost:9092");
        props.put("group.id",consumergroup);
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");


        KafkaConsumer<String,String> consumer= new KafkaConsumer<String,String>(props);
        //Subscribing
        consumer.subscribe(Arrays.asList(topicname));
        //polling
        while(true){
            ConsumerRecords<String,String> records=consumer.poll(1000);
            for(ConsumerRecord<String,String> record: records){
                System.out.println(record.value().toString());
                FileWriter();

            }

        }
    }

    private static void FileWriter() {
    }
}