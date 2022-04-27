package com.demo.or;

import org.openqa.selenium.By;

public class HomePage {

	public static By MyNaukari = By.xpath("//div[contains(text(),'My Naukri')]");
	public static By Logout = By.linkText("Logout");//// a[@class='logout-gnb']
	public static By notify =By.xpath("//span[@id='rJobCntr']");
	public static By labels=By.xpath("//span[@class='notiLabel']");
	public static By counts=By.xpath("//span[@class='notiCount']");

}
