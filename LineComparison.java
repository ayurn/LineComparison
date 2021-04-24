import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println( "Welcome to Line Comparison Computation Program" );

		double x1, y1, x2, y2;
  	    Scanner sc = new Scanner(System.in);
  	    System.out.println(" Enter co-ordinates of first line : ");
  	    x1=sc.nextDouble();
  	    y1=sc.nextDouble();
  	    x2=sc.nextDouble();
  	    y2=sc.nextDouble();

  	    double len1 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
  	    System.out.println(" Length of line1 is : "+len1);

  	    System.out.println(" Enter co-ordinates of second line : ");
  	    x1=sc.nextDouble();
  	    y1=sc.nextDouble();
  	    x2=sc.nextDouble();
  	    y2=sc.nextDouble();

  	    double len2 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
  	    System.out.println(" Length of line2 is : "+len2);

  	    String strlen1 = String.valueOf(len1);
  	    String strlen2 = String.valueOf(len2);

  	    int comparison=strlen1.compareTo(strlen2);
  	    System.out.println("Comparison of Line1 and Line2 = "+comparison);
  	    if(comparison==0)
  	    {
  	    	System.out.println("Length of Line1 "+len1+" is equal to Length of Line2 "+len2 );
  	    	
  	    }


	}
}