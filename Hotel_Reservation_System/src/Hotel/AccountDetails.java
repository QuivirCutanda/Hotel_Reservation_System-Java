package Hotel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AccountDetails extends Loader {
	Scanner input = new Scanner(System.in);
	Account form = new Account();
	
	int select;
	private String name, lastName,address, email, phoneNumber;
	boolean nameChecker = true,lastNameChecker = true,emailChecker = true, numberChecker = true, addressChecker = true;
	int ref = Account.reference();
	int containLetter = 0;
	int daysToStay;
    String inputDate;
    LocalDate startDate;
    LocalDate endDate;
    String formattedStartDate;
    String formattedEndDate;
    
	int Billing;
	byte emailVirified = 0;
	public AccountDetails (){

		System.out.println("===================* PERSONAL INFO. *======================\n\n");

		while(nameChecker) {
			System.out.print("Enter your Name : ");
			 name = input.nextLine();
			if(name.isEmpty()== true) {
				System.out.println("This field is required..");
			}
			else if(name.length()<3) {
				System.out.println("Please Enter valid name..");
			}
		else {
			nameChecker=false;
			}

		}
		System.out.print("Enter your MiddleName : ");
		String middleName = input.nextLine();
		
		while(lastNameChecker) {
			System.out.print("Enter your LastName : ");
			 lastName = input.nextLine();
			 if(lastName.isEmpty()== true) {
					System.out.println("This field is required..");
				}
				else if(lastName.length()<3) {
					System.out.println("Please Enter valid Last Name..");
				}
			else {
				lastNameChecker=false;
				}

		}

		while(addressChecker) {
			System.out.print("Enter your Address : ");
			 address = input.nextLine();
			 if(address.isEmpty()== true) {
					System.out.println("This field is required..");
				}
				else if(address.length()<4) {
					System.out.println("Please Enter valid Address..");
				}
			else {
				addressChecker = false;
				}

		}
		while(emailChecker) {
		System.out.print("Enter your Email : ");
		 email = input.nextLine();
		char charEmail []= email.toCharArray();
		for(int i = 0; i < email.length(); i++) {
			if(charEmail[i] == '@'){
				++emailVirified;
				break;
			}
		}

		if(email.isEmpty()) {
			System.out.println("This field is required..");
		}
		else if(emailVirified != 1) {
			System.out.println("Invalid Email.. Missing '@'");
		}else {
			emailChecker = false;
		}
		}
		while(numberChecker) {
			System.out.print("Enter your Phone Number : ");
			 phoneNumber = input.nextLine();
			 char numCount[] =phoneNumber.toCharArray();
			 String letter = "ABCDEFGHIGKLMNOPQRSTUWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_+<>?:{}|+,./;''[]~`{}\" ;";
			 char charLetter[] = letter.toCharArray();
			 for(int i =0; i<phoneNumber.length(); i++) {
				for(int x =0; x<letter.length(); x++){
	if(numCount[i]==charLetter[x]){
		containLetter += 1;
	}
}
		 }
		 if(containLetter>0){
			 System.out.println("Please input valid number.. Numbers must not have any kind of special character, whitespaces, or letters..");
			 containLetter =0;
		 }else if(phoneNumber.isEmpty()) {
				System.out.println("This field is required..");
		}else if(phoneNumber.length() != 11) {
			System.out.println("invalid number..It must be 11 digit's. please try again... ");
		}else if(phoneNumber.charAt(0) != '0') {
			System.out.println("invalid number..It must be start from '0'. please try again... ");
		} 
		else{
			numberChecker = false;
			break;
		}
		}
		System.out.println("Check-in date (*April 19 2023 ):");
         inputDate = input.nextLine();
         
         System.out.println("How many days do you want to stay?: ");
         daysToStay = input.nextInt();
         handleDateOperations();
         
		form.setName(name);
		form.setlastName(lastName);
		form.setmiddleName(middleName);
		form.setAddress(address);
		form.setEmail(email);
		form.setPhoneNumber(phoneNumber);

		receipt();
	}
	
	
	void receipt() {
		loading();
		System.out.println("\n\n=======================* RECEIPT *==========================\n");
		System.out.println(" Reference       : "+ ref);
		System.out.println(" Check-in date   : "+formattedStartDate	);
		System.out.println(" Check-out date  : "+formattedEndDate	);
		System.out.println(" Name         	 : "+form.getName()+" "+form.getmiddleName()+" "+ form.getlastName());
		System.out.println(" Address      	 : "+ form.getAddress());
		System.out.println(" Email	      	 : "+form.getEmail());
		System.out.println(" Phone Number 	 : "+form.getPhoneNumber());
		System.out.println(" Stay In      	 : "+ daysToStay +" days");
		System.out.println("============================================================");
		System.out.println("     AMOUNT TO PAY => PHP: "+daysToStay*roomType.Billing);
		System.out.println("============================================================");

	}
	private void handleDateOperations() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy");
        startDate = LocalDate.parse(inputDate, formatter);
        endDate = startDate.plusDays(daysToStay);

        formattedStartDate = startDate.format(DateTimeFormatter.ofPattern("MMMM d yyyy"));
        formattedEndDate = endDate.format(DateTimeFormatter.ofPattern("MMMM d yyyy"));
    }

}
