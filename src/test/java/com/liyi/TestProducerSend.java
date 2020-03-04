package com.liyi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//spring整合juit单元测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:producer.xml")
public class TestProducerSend {
	@Autowired
	KafkaTemplate kafkaTemplate;

	@Test
	public void testSend() {
		//指定主题   指定内容
		kafkaTemplate.send("liyi", "这个事java代码发过来的消息8888");
	}
}
