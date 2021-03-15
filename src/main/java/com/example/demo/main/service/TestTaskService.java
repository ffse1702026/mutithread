package com.example.demo.main.service;

import java.util.concurrent.Callable;


public class TestTaskService implements Callable<Boolean> {
	private int i;
	private TestService testService;

	public TestTaskService(int i, TestService testService) {
		super();
		this.i = i;
		this.testService = testService;
	}

	@Override
	public Boolean call() throws Exception {
		try {
			for(int j = this.i; j< this.i + 100; j++) {
				this.testService.saveData(i);
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	

}
