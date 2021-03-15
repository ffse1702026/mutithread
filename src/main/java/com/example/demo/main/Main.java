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
	
	// to do insert db
	@Autowired
	private TestService testtestService;
	
	@RequestMapping("/test")
	public String multilThread() throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(20);
		CompletionService<Boolean> executor = new ExecutorCompletionService<>(executorService);
		List<Future<Boolean>> futures = new ArrayList<Future<Boolean>>();
		int totalpage = 10000;
		int quyen = 5;
		int maCode = 2000;
		
		for(int i = 0; i <totalpage /100; i++) {
			int start = i * 100 + 1;
			int end = (i+1) * 100;
			if(end % (totalpage/ quyen) == 0) {
				maCode += 1;
			}
			TestTaskService testService = new TestTaskService(start,end ,maCode, testtestService);
			futures.add(executor.submit(testService));
		}
		for(int i = 0; i<100; i++) {
			executor.take().get();
		}
		executorService.shutdown();
		// TODO SEND MAIL HERE
		
		return "test";
	}

}
