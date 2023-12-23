package Hotel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class HeavenHotel {
	Account form = new Account();
	roomType type = new roomType();
	int dayCounter = 0;
	DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MMMM dd yyyy");
	LocalDate dateNow = LocalDate.now();
	String dateIn = dateNow.format(formatDate);
	LocalDate futureDate = dateNow.plusDays(dayCounter);
	String dateOut = futureDate.format(formatDate);
	
	
	int dayLeterCounter = 0;
	boolean DayStay = true;
	String dayStay;
	private int select, choiseRoom;
	Scanner input = new Scanner(System.in);
	String key;
	HeavenHotel(){
		boolean active = true;
		System.out.println("================================");
		System.out.println("|** HOTEL RESERVATION SYSTEM **|");
		System.out.println("================================");
		System.out.println("[1] ROOM DETAILS");
		System.out.println("[2] DISPLAY AVAILABLE ROOMS");
		System.out.println("[3] MAKE RESERVATION");
		System.out.println("[4] EXIT");
		System.out.println("================================");
		System.out.println();
		System.out.print("Select: ");
		try{
			select = input.nextInt();
		}catch(Exception e) {
			System.out.println("Invalid key.. System closed..");
		}
		
		while(active) {
			switch(select) {
			case 1:
				type.ReservationDetails();
				System.out.println("press any key to continue....");
				 key = input.next();
				 
				System.out.println("\t       -------------------------");
				System.out.println("\t      | Welcome to Heaven Hotel |");
				System.out.println("\t --------------------------------------");
				System.out.println("\t| The Hotel you wouldn't want to leave |");
				System.out.println("\t --------------------------------------\n");
				System.out.println("| [1]Room Details | [2]Display Available Rooms | [3]Make Reservation | [4]Exit |");
				System.out.println(" ------------------------------------------------------------------------------\n");
				System.out.print("Select: ");
				try{
					select = input.nextInt();
				}catch(Exception e) {
					System.out.println("Invalid key.. System closed..");
				}
				break;

			case 2:
			
				type.pakageAvailable();
				System.out.println("press any key to continue....");
				 key = input.next();
				 
				 System.out.println("================================");
					System.out.println("|** HOTEL RESERVATION SYSTEM **|");
					System.out.println("================================");
					System.out.println("[1] ROOM DETAILS");
					System.out.println("[2] DISPLAY AVAILABLE ROOMS");
					System.out.println("[3] MAKE RESERVATION");
					System.out.println("[4] EXIT");
					System.out.println("================================");
					System.out.println();
					System.out.print("Select: ");
				try{
					select = input.nextInt();
				}catch(Exception e) {
					System.out.println("Invalid key.. System closed..");
				}
				break;
				
			case 3:
		
				type.choiseRoom();
				new AccountDetails();
				System.out.println("================================");
				System.out.println("|** HOTEL RESERVATION SYSTEM **|");
				System.out.println("================================");
				System.out.println("[1] ROOM DETAILS");
				System.out.println("[2] DISPLAY AVAILABLE ROOMS");
				System.out.println("[3] MAKE RESERVATION");
				System.out.println("[4] EXIT");
				System.out.println("================================");
				System.out.println();
				System.out.print("Select: ");
				try{
					select = input.nextInt();
				}catch(Exception e) {
					System.out.println("Invalid key.. System closed..");
				}
				break;
				
			case 4:
				
				System.out.println("System Close");
				active = false;
				break;

				default:
					System.out.println("Invalid key... please try again...");
					System.out.println("press any key to continue....");
					key = input.next();
					
					System.out.println("================================");
					System.out.println("|** HOTEL RESERVATION SYSTEM **|");
					System.out.println("================================");
					System.out.println("[1] ROOM DETAILS");
					System.out.println("[2] DISPLAY AVAILABLE ROOMS");
					System.out.println("[3] MAKE RESERVATION");
					System.out.println("[4] EXIT");
					System.out.println("================================");
					System.out.println();
					System.out.print("Select: ");
					try{
						select = input.nextInt();
					}catch(Exception e) {
						System.out.println("Invalid key.. System closed..");
					}

			}
		}
		input.close();
	}

}
