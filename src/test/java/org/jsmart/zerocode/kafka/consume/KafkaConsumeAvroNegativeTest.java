package org.jsmart.zerocode.kafka.consume;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("kafka_servers/kafka_test_server_avro.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class KafkaConsumeAvroNegativeTest {

    @Test
    @JsonTestCase("kafka/consume/negative/test_kafka_consume_avro_msg_wrong_value.json")
    public void testKafkaConsume_avroWrongValue() throws Exception {
    }

}
