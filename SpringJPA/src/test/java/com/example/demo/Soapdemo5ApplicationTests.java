package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Ignore;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Soapdemo5ApplicationTests {

	@Test
	public void contextLoads() {
	}

	//execute before class
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");
	}
	
	//execute after class
	@AfterClass
	public static void  afterClass() {
		System.out.println("in after class");
	}
	
	//execute before test
	@Before
	public void before() {
		System.out.println("in before");
	}
	
	//execute after test
	@After
	public void after() {
		System.out.println("in after");
	}
	
	//test case
	@Test
	public void test() {
		System.out.println("in test");
	}
	
	//test case ignore and will not execute
	@Ignore
	public void ignoreTest() {
		System.out.println("in ignore test");
	}
}
 
 