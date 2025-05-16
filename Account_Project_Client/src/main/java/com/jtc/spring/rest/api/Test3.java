package com.jtc.spring.rest.api;

import org.springframework.web.client.RestTemplate;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("Test3- Main");
		RestTemplate restTemp= new RestTemplate();
		String URL="http://localhost:12345/mydeposit";
		TxInfo txInfo= new TxInfo(8, 5000);
		restTemp.put(URL, txInfo);
		System.out.println("Done!!!");
	}

}
