package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.impl.ServiceImpl;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
		    	  new ClassPathXmlApplicationContext(new String[] {"spring-context.xml"});
		ServiceImpl service=(ServiceImpl) context.getBean("serviceImpl");
		service.get();
		
		int[] arr= {9,1,4,6,6,5,2,3,7,8,0};
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				int temp=arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;
				i=0;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
