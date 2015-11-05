package JavaHomework;
import java.util.Scanner;
public class BinaryCheck {

	public static void main(String[] args) {
		
binNum();
	}
	public static void binNum(){
	System.out.print("Please Enter The Number You Would Like To Check : ");
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int numOne = sc.nextInt();
	if (numOne >2){
		System.out.print("Your Number is NOT a binary");
	}
	if (numOne <2){
		System.out.print("Your Number IS a binary");
	}
	}
}
