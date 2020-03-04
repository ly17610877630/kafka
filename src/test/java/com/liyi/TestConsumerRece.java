package com.liyi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConsumerRece {
	//先启动消费者。因为只有消费者先启动，kafka发来的消息才能接收到
		public static void main(String[] args) {
			//加载消费者的配置文件
			new ClassPathXmlApplicationContext("classpath:consumer.xml");
		}
}
