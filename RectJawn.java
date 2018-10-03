import java.util.Scanner;

public class RectJawn {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	
    System.out.print("Length:  ");
    
    double length = in.nextDouble();
    
    in.nextLine();
    
    System.out.print("Width:  ");
    
    double width = in.nextDouble();
    
    System.out.println();
    
    System.out.printf("Area:      %10.2f", length*width);
    
    System.out.println();
    
    System.out.printf("Perimeter: %10.2f", 2*(length+width));
    
    System.out.println();
    
    System.out.printf("Diagonal:  %10.2f", Math.sqrt(length*length + width*width));
	

	}

}
