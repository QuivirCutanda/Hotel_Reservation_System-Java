package Hotel;
import java.util.Scanner;
public   class  roomType {
	Scanner input = new Scanner(System.in);
	
	int choiseRoom;
	public static int Billing = 0;
	public  int room1_Price = 1000,
				room2_Price = 1200,
				room3_Price = 1500;

			int room1_Available = 1,
				room2_Available = 3,
				room3_Available = 2;
			
			public void choiseRoom() {
				    ReservationDetails();
					System.out.println("Choise your Package : ");
					 choiseRoom = input.nextInt();
					switch(choiseRoom) {
					case 1:
						
						if(room1_Available ==0) {
							System.out.println("\n ---------------------------------------------------------------------");
							System.out.println("| !!Package[1] not Available from now!! please choice another package |");
							System.out.println(" ---------------------------------------------------------------------");
							Billing = 0;
							System.out.println("Choise your Package : ");
							choiseRoom = input.nextInt();
						}
						Billing = room1_Price;
						room1_Available -= 1 ;
						break;
					case 2:
						
						if(room2_Available ==0) {
							System.out.println("\n ---------------------------------------------------------------------");
							System.out.println("| !!Package[2] not Available from now!! please choice another package |");
							System.out.println(" ---------------------------------------------------------------------");
							Billing = 0;
							System.out.println("Choise your Package : ");
							choiseRoom = input.nextInt();
						}
						Billing = room2_Price;
						room2_Available -= 1 ;
						break;
					case 3:
						
						if(room3_Available ==0) {
							System.out.println("\n ---------------------------------------------------------------------");
							System.out.println("| !!Package[3] not Available from now!! please choice another package |");
							System.out.println(" ---------------------------------------------------------------------");
							Billing = 0;
							System.out.println("Choise your Package : ");
							choiseRoom = input.nextInt();
						}
						Billing = room3_Price;
						room3_Available -= 1 ;
						break;
						default:
							Billing = 0;
							System.out.print("Invalid key.. please try again..\n");
							System.out.println("Choise your Package : ");
							choiseRoom = input.nextInt();
					}
			 }
			public void ReservationDetails() {
				System.out.println("+================+=============+===============+======================+=========================+====================================+===============+");
			    System.out.println("| PACKAGE TYPE   | BEDROOM     | BALCONEY      |  NUMBER OF GUESTS    |    AVAILABLE            | OTHER ENCLUSIONS                   |    PRICE      |");
			    System.out.println("+================+=============+===============+======================+=========================+====================================+===============+");
			    if(room1_Available ==0) {
			    System.out.println("|     1          |  1          |    NO         |       1-2            |       No Available      | Wifi, Private bathroom, Aircon     |    "+room1_Price+"       |");
			    }else {
			    System.out.println("|     1          |  1          |    NO         |       1-2            |         "+room1_Available+"               | Wifi, Private bathroom, Aircon     |    "+room1_Price+"       |");
			    }
				System.out.println("+----------------+-------------+---------------+----------------------+-------------------------+------------------------------------+---------------+");
			    if(room2_Available ==0) {
			    System.out.println("|     2          |  2          |    YES        |       2-4            |       No Available      | Wifi, Private bathroom, Aircon, TV |    "+room2_Price+"       |");
			    }else {
			    System.out.println("|     2          |  2          |    YES        |       2-4            |         "+room2_Available+"               | Wifi, Private bathroom, Aircon, TV |    "+room2_Price+"       |");
			    }
				System.out.println("+----------------+-------------+---------------+----------------------+-------------------------+------------------------------------+---------------+");
			    if(room3_Available ==0) {
			    System.out.println("|     3          |  4          |    YES        |       4-8            |       No Available      | Wifi, Private bathroom, Aircon, TV |    "+room3_Price+"       |");
			    }else {
			    System.out.println("|     3          |  1          |    YES        |       4-8            |         "+room3_Available+"               | Wifi, Private bathroom, Aircon, TV |    "+room3_Price+"       |");
			    }
				System.out.println("+----------------+-------------+---------------+----------------------+-------------------------+------------------------------------+---------------+");
		}
		public void	pakageAvailable(){
			System.out.println("+================+=========================+===============+");
		    System.out.println("| PACKAGE TYPE   |        AVAILABLE        |    PRICE      |");
		    System.out.println("+================+=========================+===============+");
			if(room1_Available ==0){
			System.out.println("|     1          |       No Available      |    "+room1_Price+"       |");
			   }else {
	        System.out.println("|     1          |            "+room1_Available+"            |    "+room1_Price+"       |");
				    
			   }
			System.out.println("+----------------+-------------------------+---------------+");
			if(room2_Available ==0){
				System.out.println("|     2          |       No Available      |    "+room2_Price+"       |");
				   }else {
		        System.out.println("|     2          |            "+room2_Available+"            |    "+room2_Price+"       |");
					    
				   }
			System.out.println("+----------------+-------------------------+---------------+");
			if(room3_Available ==0){
				System.out.println("|     3          |       No Available      |    "+room3_Price+"       |");
				   }else {
		        System.out.println("|     3          |            "+room3_Available+"            |    "+room3_Price+"       |");
					    
				   }
			System.out.println("+----------------+-------------------------+---------------+");
			}
}
