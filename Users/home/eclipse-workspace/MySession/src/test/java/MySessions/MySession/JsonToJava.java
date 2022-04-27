package MySessions.MySession;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.google.gson.Gson;

public class JsonToJava {
/*
 * 
 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException, StreamWriteException, DatabindException, IOException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =null;
		//JSONArray jsoa= new JSONArray();
		ArrayList<CustomerInfo> al = new ArrayList<CustomerInfo>();
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/business", "root", "Umesh@2151");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select  * from CustomerInfo where purchasedDate=CURDATE() and Location ='Asia' ;");
		while(rs.next()) {
			CustomerInfo cus= new CustomerInfo();
			cus.setCourseName(rs.getString(1));
			cus.setPurchaseddate(rs.getString(2));
			cus.setAmount(rs.getInt(3));
			cus.setLocation(rs.getString(4));
			al.add(cus);
//			System.out.println(cus.getCourseName());
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getInt(3));
//			System.out.println(rs.getString(4));
		}
		for(int i=0;i<al.size();i++) {
		ObjectMapper om= new ObjectMapper();
		om.writeValue(new File("C:\\Users\\home\\eclipse-workspace\\MySession\\CustomerInfo"+i+".json"), al.get(i));
		//Gson g= new Gson();
		//String jsonString = g.toJson(al.get(i));
		//jsoa.add(jsonString);
		}
		con.close();
		}
	
	
}


