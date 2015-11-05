package JavaHomework;
import java.util.Scanner;
public class LineChooser {
	public static void main(String[] args) {
	lineNum();
	}
public static void lineNum(){
	System.out.print("Please choose a number between 1 and 6 : ");
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int numOne = sc.nextInt();
	String lineOne ="1";
	String lineTwo = "2 3";
	String lineThree = "4 5 6";
	String lineFour ="7 8 9 10";
	String lineFive ="11 12 13 14 15";
	String lineSix = "16 17 18 19 20 21";
	if(numOne ==1){
	System.out.println(lineOne);
	}
	if(numOne ==2){
	System.out.println(lineOne);
	System.out.println(lineTwo);
	}
	if(numOne ==3){
	System.out.println(lineOne);
	System.out.println(lineTwo);
	System.out.println(lineThree);
	}
	if(numOne ==4){
	System.out.println(lineOne);
	System.out.println(lineTwo);
	System.out.println(lineThree);
	System.out.println(lineFour);
	}
	if(numOne ==5){
	System.out.println(lineOne);
	System.out.println(lineTwo);
	System.out.println(lineThree);
	System.out.println(lineFour);
	System.out.println(lineFive);
	}
	if(numOne ==6){
	System.out.println(lineOne);
	System.out.println(lineTwo);
	System.out.println(lineThree);
	System.out.println(lineFour);
	System.out.println(lineFive);
	System.out.println(lineSix);
	}		
}
}
