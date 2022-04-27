package com.demo.scripts;

import org.testng.annotations.Test;

import com.demo.config.StartBrowser;
import com.demo.reuse.Reusable;
import com.demo.utils.ConfigurationSupport;

public class LoginTest extends StartBrowser {
	public ConfigurationSupport cs = new ConfigurationSupport("config.properties");
  @Test
  public void loginintoApplication() throws Exception {
	  Reusable re= new Reusable();
	  re.login(cs.getProperty("url"),cs.getProperty("email") , cs.getProperty("password"));
	  //re.loginwithExcelData(cs.getProperty("url"));

  }
  
 
}
