package com.rameshsoft.test.GitBatchJuly2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {
	@Test
	public void testOne() {
		System.out.println("TestONe...");
	}
	@Test
	public void testTwo() {
		System.out.println("TestTwo...");
	}
	@Test
	public void testThree() {
		System.out.println("TestThree...");
	}
	@Test
	public void testFour() {
		System.out.println("TestFour...");
	}
	@Test
	public void testFive() {
		System.out.println("TestFive...");
	}
	@Test
	public void testEight() {
		System.out.println("TestEightbyPerson2...");
	}

	public void testSix() {
		System.out.println("TestSix...");
	}
	@Test
	public void testSeven() {
		System.out.println("TestSevenByPerson1...");
	}
	WebDriver driver;
	@Test
	public void launchBrowser() {
		System.out.println("Launch the chrome browser...");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}
	@Test
	public void navigateToRameshsoft() {
		driver.get("https://www.rameshsoft.com/");
		System.out.println("Navigate to "+driver.getCurrentUrl());
	}
	
	
}
