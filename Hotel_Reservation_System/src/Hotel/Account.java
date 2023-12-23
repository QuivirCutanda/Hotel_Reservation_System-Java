package Hotel;

import java.util.Random;
public class Account {
	private String name, lastName, middleName,address, email, phoneNumber;
	private int Billing;
	private int dayStay = 0;
	void setName(String name){
		this.name = name;
	}
	void setlastName(String lastName){
		this.lastName = lastName;
	}
	void setmiddleName(String middleName){
		this.middleName = middleName;
	}
	void setAddress(String address) {
		this.address = address;
	}
	void setEmail(String email) {
		this.email = email;
	}
	void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	void setDayStay(int dayStay) {
		this.dayStay = dayStay;
	}
	void setBilling(int Billing) {
		this.Billing = Billing;
	}
	String getName(){
		return name;
	}
	String getlastName(){
		return lastName;
	}
	String getmiddleName(){
		return middleName;
	}
	String getAddress() {
		return address;
	}
	String getEmail() {
		return email;
	}
	String getPhoneNumber() {
		return phoneNumber;
	}
	int getDayStay() {
		return dayStay;
	}
	int getBilling() {
		return Billing;
	}
	 public static int reference() {
	        Random random = new Random();
	        int min = 10000000;
	        int max = 99999999;
	        return random.nextInt(max - min + 1) + min;
	    }


}
