package com.demo.reuse;

import org.openqa.selenium.WebDriver;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.demo.config.StartBrowser;
import com.demo.or.LoginPage;
import com.demo.wdcmds.Browser;
import com.demo.wdcmds.ElementsOp;

public class Reusable {
	
	public WebDriver driver;
	public ElementsOp edriver;
	public Browser bdriver;
	
	public Reusable() {
		driver=StartBrowser.driver;
		edriver= new ElementsOp();
		bdriver= new Browser();
		
	}
	
	public void login(String url,String email, String password) throws Exception {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("login to application");
		bdriver.openurl(url);
		edriver.click(LoginPage.loginlink, "login link");
		edriver.type(LoginPage.Emailtextbox, email, "username");
		edriver.type(LoginPage.passwordtextbox, password, "password");
		edriver.click(LoginPage.LoginButton, "LoginButton");
		
		
	}
	public void loginwithExcelData(String url) throws Exception {
		Fillo f = new Fillo();
		Connection con = f.getConnection("Testdata/Data.xlsx");
		String query="select * from Login";
		Recordset rc= con.executeQuery(query);
		while(rc.next()) {
			login(url,rc.getField("Email"),rc.getField("password"));
			
		}	
	}


}
