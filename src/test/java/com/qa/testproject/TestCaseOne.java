package com.qa.testproject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseOne {
	
	@BeforeMethod
	public void precondition(){
		System.out.println("*************************");
		System.out.println("Before Test");
	}
	
	@Test
	public void test1(){
		System.out.println("Test case 1");
	}
	
	
	@Test
	public void test2(){
		System.out.println("Test case 2");
	}
	
	@Test
	public void test3(){
		System.out.println("Test case 3");
	}
	
	@Test
	public void test4(){
		System.out.println("Test case 4");
	}
	
	@Test
	public void test5(){
		System.out.println("Test case 5");
	}
	
	@AfterMethod
	public void postondition(){
		System.out.println("After Test");
		System.out.println("*************************");
	}
}
