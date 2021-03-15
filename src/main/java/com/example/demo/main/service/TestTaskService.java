package com.example.demo.main.service;

import java.util.concurrent.Callable;


public class TestTaskService implements Callable<Boolean> {
	private int i;
	private TestService testService;
	private int macode;
	private int end;

	public TestTaskService(int i,int macode, int end, TestService testService) {
		super();
		this.i = i;
		this.testService = testService;
		this.macode = macode;
		this.end =end;
	}

	@Override
	public Boolean call() throws Exception {
		try {
			for(int j = this.i; j< end; j++) {
				this.testService.saveData(this.macode);
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	

}
