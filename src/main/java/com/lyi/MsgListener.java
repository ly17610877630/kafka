package com.lyi;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

//��Ϣ�����࣬���������Ҫʵ��һ���ӿڣ���ʱ�����;߱��˼�����Ϣ�Ĺ���1
public class MsgListener implements MessageListener<String, String> {
	//���������������Ϣ�ķ���
		public void onMessage(ConsumerRecord<String, String> data) {
			String msg=data.value();
			System.out.println(msg);
			
		}
}
