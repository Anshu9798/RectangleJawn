import java.util.Scanner;

public class RectJawn {

	public static void main(String[] args) {
	
	Scanner scanner1 = new Scanner(System.in);
	
	
    System.out.print("Please enter the Length:  ");
    
    double length = scanner1.nextDouble();
    
    	scanner1.nextLine();
    
    System.out.print("Please enter the Width:  ");
    
    double width = scanner1.nextDouble();
    
    System.out.println();
    
    System.out.printf("Area:      %10.2f",length * width);
    
    System.out.println();
    
    System.out.printf("Perimeter: %10.2f",2*(length + width));
    
    System.out.println();
    
    System.out.printf("Diagonal:  %10.2f",Math.sqrt(length * length + width * width));
	

	}

}
 
