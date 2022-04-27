package MySessions.MySession;

import fabricator.Contact;
import fabricator.Fabricator;
public class FabricatorTestDataGenerator {
public static void main(String[] args) {
Contact contact = Fabricator.contact();
String fullName = contact.fullName(false, false);
String firstName = contact.firstName();
String lastName = contact.lastName();
String address = contact.address();
String phoneNumber = contact.phoneNumber();
String email = contact.eMail();
System.out.println("The Full Name is : " + fullName);
System.out.println("The First Name is : " + firstName);
System.out.println("The Last Name is : " + lastName);
System.out.println("The Address is : " + address);
System.out.println("The Phone Number is : " + phoneNumber);
System.out.println("The EMail is : " + email);
}
}