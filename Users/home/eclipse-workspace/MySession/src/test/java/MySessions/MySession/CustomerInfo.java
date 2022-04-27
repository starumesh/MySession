package MySessions.MySession;

public class CustomerInfo {

	private String CourseName;
	private String Purchaseddate;
	private int Amount;
	private String Location;
	
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getPurchaseddate() {
		return Purchaseddate;
	}
	public void setPurchaseddate(String purchaseddate) {
		Purchaseddate = purchaseddate;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
}
