package MySessions.MySession;

import static org.testng.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

import org.testng.annotations.Test;


public class startbatch {

	@Test
	public void batchFile() throws IOException, InterruptedException
	{
		Runtime run= Runtime.getRuntime();
		run.exec("cmd /c start mvnbuild.bat");
		Thread.sleep(2000);
		
		Boolean flag=false;
		File fi =new File("output.txt");
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.SECOND, 30);
		long stopTime=cal.getTimeInMillis();
		
		while(System.currentTimeMillis()<stopTime) {
			
		FileReader fread = new FileReader(fi);	
		BufferedReader bf= new BufferedReader(fread);
		String currentLine= bf.readLine();
		
		while(currentLine!=null && !flag) {
			if(currentLine.contains("BUILD SUCCESS")) {
				flag=true;
				break ;
			}
			else
				currentLine= bf.readLine();
		}
		fread.close();
		bf.close();
		}
		
	assertTrue(flag);
		
	}
	@Test
	public void delete() {
		File fi =new File("output.txt");
		if(fi.exists())
			fi.delete();
	}
}
