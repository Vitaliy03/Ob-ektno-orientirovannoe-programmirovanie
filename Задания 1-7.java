public class Main
{
	public static void main(String[] args) {
		byte a = 10;
		short b = 2404;
		int c = 200000;
		long d = 15000l;
		float e = 120.0f;
		double g = 15.72775;
		boolean h = true;
		String name = "Vitaliy";
		System.out.println(summ(a, b, c, d));
		System.out.println(interval(a, b));
		System.out.println(sign(a));
		System.out.println(minus(a));
		System.out.println(hello(name));
	}
	public static double summ (double a, double b, double c, double d){
	    return a * (b + (c / d));
	}
	public static boolean interval(double a, double b){
	    return ((a+b >= 10) & (a+b <= 20));
	}
	public static String sign (long a){
	    if (a >=0) {
	        return ("Положительное");
	    }
	    else {
	        return ("Отрицательное");
	    }
	}
	public static boolean minus (long a){
	    if (a <0) {
	        return true;
	    }
	    else {
	        return false;
	    }
	}
	public static String hello (String name){
	    return ("Привет," + name + "!");
	}
	
}
