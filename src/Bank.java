
//import scanner for user input
import java.util.Scanner;
public class Bank {
	//Scaneer class for user input
	Scanner sc = new Scanner(System.in);

	//bank variables for person
	String accholder;
	int accNum;
	int pin;

	//wrapper class variables
	Integer accBalance;
	Integer cardNum;
	Integer withdrawal;
	Integer newBalance;

	int options;

	//method details
	void details(){
		System.out.println("**********WELCOME TO NEW PORT BANK**********");
		System.out.println("GOOD DAY PLEASE ENTER YOUR NAME ANN PIN TO LOG ON TO YOUR PORTAL :) ");
		System.out.println("NAME >>> ");
		accholder= sc.next();
		System.out.println("PIN  >>> ");
		pin = sc.nextInt();

		System.out.println("\nEnter 1 if you want to check your remaining balance\nEnter 2 if you want to withdraw money\nEnter 3 to exit");
		options = sc.nextInt();

		if(options ==1){
			System.out.println("WELCOME "+accholder+" your balance will be displayed >>> ");
			accNum= 1774567823;
			accBalance =  50000;
			cardNum = 1774566655;
			System.out.println(accNum);
			System.out.println(accBalance);
			System.out.println(cardNum);

		}
		if(options == 2){
			System.out.println("HOW MUCH WOULD YOU LIKE TO WITHDRAW >>> ");
			int	withdraw = sc.nextInt();
			int newBalance = accBalance - withdraw;
			System.out.println("New Balance >>> "+newBalance);
		}
		if(options ==3){
			System.exit(0);
		}


		System.out.println("");


	}
}
