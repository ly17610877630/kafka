package com.liyi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConsumerRece {
	//�����������ߡ���Ϊֻ����������������kafka��������Ϣ���ܽ��յ�
		public static void main(String[] args) {
			//���������ߵ������ļ�
			new ClassPathXmlApplicationContext("classpath:consumer.xml");
		}
}
