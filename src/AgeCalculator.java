import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		/*System.out.println("Enter todays Day,Month, Year");
		int todayDay = sc.nextInt();
		int todayMonth = sc.nextInt();
		int todayYear = sc.nextInt();
		*/
		int todayDay = 30;
		int todayMonth = 05;
		int todayYear = 2017;
		//int count = 0;
		
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y"))
		
		{
			System.out.println("Enter Your birth MM,DD, YY");
			int DD = sc.nextInt();
			int MM = sc.nextInt();
			int YY = sc.nextInt();
			
			
			
			/*
			 System.out.println(" Enter your MM DD YY ");
			int arr[]=new int[3];
			
			
			for (int i =0;i<arr.length;i++){
				arr[i]= sc.nextInt();
				}
			
				System.out.println( "\n Would you like to enter details for another client? Y/N");
				choice = sc.next();
				count ++;
			
			
			for(int i: arr){ //for printing array
	
		      System.out.println(i);
	
		   }
	
			*/
			int x =  (todayYear - YY)-1;
			int y = todayMonth-MM;
			int z= todayDay-DD;
			
			
		
		
		System.out.println(x+ "Years"+y + " Months " + z+" Day");
		System.out.println( "\n Would you like to enter details for another client? Y/N");
		choice = sc.next();
		}
		
		System.out.println( "Thanks for using the age calculator!");
		}


}

