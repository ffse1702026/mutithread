package com.example.demo.main;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.iotsitewise.*;
import com.amazonaws.services.iotsitewise.model.GetAssetPropertyAggregatesRequest;
import com.amazonaws.services.iotsitewise.model.GetAssetPropertyValueRequest;
import com.amazonaws.services.iotsitewise.model.GetAssetPropertyValueResult;

import java.util.function.*;

public class Demo {

//    public static void main(String[] args) throws Exception{
//        Class[] parameterTypes = new Class[1];
//        parameterTypes[0] = String.class;
//        Method method1 = Demo.class.getMethod("method1", parameterTypes);
//        Demo.class.
//
//        Demo demo = new Demo();
//        demo.method2(method1(), "Hello World");
////        myMethod(method1());
//    }
//
//    public static void method1() {
//        System.out.println("heelo");
//    }
//
//    public void method2( Method method, String message) throws Exception {
//        Object[] parameters = new Object[1];
//        parameters[0] = message;
//        method.invoke(new Demo());
//    }
//    
////    public Integer myMethod(Callable<Integer> func) throws Exception {
////    	objetc.
////        return func.call();
////    }
//    
//    Object objetc = new Object();
	
	public static void main(String args[]) {
		AWSIoTSiteWise value = null;
//		GetAssetPropertyValueRequest getAssetPropertyValue = new GetAssetPropertyValueRequest();
        Function <AWSIoTSiteWise, GetAssetPropertyValueResult> inc = e -> e.getAssetPropertyValue(getAssetPropertyValueRequest());
        doSum(value, inc);
 
    }
	
	private static GetAssetPropertyValueRequest getAssetPropertyValueRequest() {
		GetAssetPropertyValueRequest getAssetPropertyValue = new GetAssetPropertyValueRequest();
		return new GetAssetPropertyValueRequest();
	}
	
	
 
    public static void doSum(AWSIoTSiteWise value, Function <AWSIoTSiteWise, GetAssetPropertyValueResult> func) {
        System.out.println(func.apply(value));
    }

}