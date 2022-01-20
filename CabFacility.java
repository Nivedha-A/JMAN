import java.util.Scanner;

public class CabFacility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int frontEndRiders;
		int backEndRiders;
		System.out.println(" Please provide the number of front end riders");
		frontEndRiders=sc.nextInt();
		System.out.println(" Please provide the number of Back end riders");
		backEndRiders=sc.nextInt();
		int noOfCabs;
		if(frontEndRiders != 0 && backEndRiders ==0 ) {
			 noOfCabs=frontEndRiders/4; //4 members per cab 
			System.out.println((noOfCabs+1)+ " Cabs available for the front ender riders");
		}
		else if(frontEndRiders == 0 && backEndRiders != 0 ) {
			 noOfCabs=backEndRiders/4; //4 members per cab 
			System.out.println((noOfCabs+1)+ " Cabs available for the back ender riders");
		}
		else if((frontEndRiders==backEndRiders)&&(frontEndRiders %2==0) && (backEndRiders %2==0)) {
			noOfCabs=frontEndRiders/2;
			System.out.println(noOfCabs +"  cabs available for the 2 back-end and 2 front-end riders");
		}
		else {
			System.out.println("Invalid inputs");
		}
	}

}
