package com.jtc.spring.rest.api;

import org.springframework.web.client.RestTemplate;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("Test4- Main()");
		RestTemplate restTemp= new RestTemplate();
		String URL="http://localhost:12345/mywithdraw";
		TxInfo txInfo= new TxInfo(8, 10000);
		restTemp.put(URL, txInfo);
		System.out.println("Done!!!");
	}

}
