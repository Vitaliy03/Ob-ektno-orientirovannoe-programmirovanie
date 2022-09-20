import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int data = scanner.nextInt();
		System.out.println(leap(data));
	}
	public static String leap (int a){
	    if (a%400 == 0){
	        return ("Високосный");
	    }
	    else if ((a%4 == 0) & (a%100 != 0)){
	        return ("Високосный");
	    }
	    else {
	        return ("Невисокосный");
	    }
	}
}
