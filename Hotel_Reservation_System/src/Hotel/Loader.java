package Hotel;
import java.util.Scanner;
public class Loader {
	Scanner input = new Scanner(System.in);
	void loading() {
		
		for(int x =1; x<=1; x++){
			System.out.print("Printing receipt");
			for(int i =1; i<=6; i++){
				try{
			Thread.sleep(400);
			System.out.print(".");
		}catch(Exception e){
		}
			}
		}
		
		System.out.println();
		System.out.println("Press any key to View your receipt. ");
		String press = input.nextLine();
	}
}
