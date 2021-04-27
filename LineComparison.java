import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println( "Welcome to Line Comparison Computation Program" );

		double x1, y1, x2, y2;
  	    Scanner sc = new Scanner(System.in);
  	    System.out.println(" Enter co-ordinates of first line : ");
  	    x1 = sc.nextDouble();
  	    y1 = sc.nextDouble();
  	    x2 = sc.nextDouble();
  	    y2 = sc.nextDouble();

  	    double length1 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
  	    System.out.println(" Length of line1 is : "+length1);

  	    System.out.println(" Enter co-ordinates of second line : ");
  	    x1 = sc.nextDouble();
  	    y1 = sc.nextDouble();
  	    x2 = sc.nextDouble();
  	    y2 = sc.nextDouble();

  	    double length2 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
  	    System.out.println(" Length of line2 is : "+length2);

  	    String strlength1 = String.valueOf(length1);
  	    String strlength2 = String.valueOf(length2);

  	    int comparison = strlength1.compareTo(strlength2);
  	    System.out.println("Comparison of Line1 and Line2 = "+comparison);
  	    if (comparison==0) {
  	    	System.out.println("Length of Line1 = "+length1+" is equal to Length of Line2 = "+length2);
	    } else if(comparison<0) {
  	     	System.out.println("Length of Line1 = "+length1+" is less than to Length of Line2 = "+length2);	
  	    } else {
  	      	System.out.println("Length of Line1 = "+length1+" is greater than to Length of Line2 = "+length2);
  	    }
	}
}
