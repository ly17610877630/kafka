package com.liyi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//spring����juit��Ԫ����
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:producer.xml")
public class TestProducerSend {
	@Autowired
	KafkaTemplate kafkaTemplate;

	@Test
	public void testSend() {
		//ָ������   ָ������
		kafkaTemplate.send("liyi", "�����java���뷢��������Ϣ8888");
	}
}
