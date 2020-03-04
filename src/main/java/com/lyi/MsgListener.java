package com.lyi;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

//消息监听类，在这个类中要实现一个接口，此时这个类就具备了监听消息的功能1
public class MsgListener implements MessageListener<String, String> {
	//这个方法就是收消息的方法
		public void onMessage(ConsumerRecord<String, String> data) {
			String msg=data.value();
			System.out.println(msg);
			
		}
}
