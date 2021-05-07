package com.example.demo.main;

import java.util.function.Function;

import org.apache.http.client.HttpClient;
import org.springframework.web.client.RestTemplate;

import java.util.function.*;

import com.amazonaws.services.iotsitewise.AWSIoTSiteWise;
import com.amazonaws.services.iotsitewise.model.GetAssetPropertyValueRequest;
import com.amazonaws.services.iotsitewise.model.GetAssetPropertyValueResult;

public class Test4 {
	
	public static void main(String args[]) {
		Test1 value = new Test1();
//		GetAssetPropertyValueRequest getAssetPropertyValue = new GetAssetPropertyValueRequest();
//        Function <Test1, Test2> inc = e -> e.createTest2(getAssetPropertyValueRequest());
        
        Consumer<Test1> c = e -> e.createTest2(getAssetPropertyValueRequest());
        System.out.println("153");
        
//        doSum(value, inc);
        doSum(value, c);
    }
	
	private static Test3 getAssetPropertyValueRequest() {
//		GetAssetPropertyValueRequest getAssetPropertyValue = new GetAssetPropertyValueRequest();
//		return new GetAssetPropertyValueRequest();
		return new Test3();
	}
	
	
 
    public static void doSum(Test1 value, Function<Test1, Test2> inc) {
        System.out.println(inc.apply(value));
        Test2 Test2 = inc.apply(value);
        System.out.println(Test2.name);
        RestTemplate rest ;
        rest.setClientHttpRequestInitializers(clientHttpRequestInitializers);
        java.net.http.HttpClient cli;
        cli.authenticator();
        
    }
    
    public static void doSum(Test1 value,   Consumer<Test1> c) {
//        System.out.println(inc.apply(value));
//        Test2 Test2 = inc.apply(value);
//        System.out.println(Test2.name);
    	c.accept(value);
    	c.andThen(value);
    }

}
