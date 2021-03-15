package com.example.demo.main;

import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.main.service.TestService;
import com.example.demo.main.service.TestTaskService;

@Controller
public class Main {
	@Autowired
	private TestService testtestService;
	
	@RequestMapping("/test")
	public String multilThread() throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		CompletionService<Boolean> executor = new ExecutorCompletionService<>(executorService);
		List<Future<Boolean>> futures = new ArrayList<Future<Boolean>>();
		
		for(int i = 0; i <10; i++) {
			TestTaskService testService = new TestTaskService(i * 1000, testtestService);
			futures.add(executor.submit(testService));
		}
		for(int i = 0; i<10; i++) {
			Boolean result = executor.take().get();
		}
		executorService.shutdown();
		// TODO SEND MAIL HERE
		return "test";
	}

}
