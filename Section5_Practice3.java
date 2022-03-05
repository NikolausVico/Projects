import java.util.Scanner;
public class Section5_Practice2 {

    public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the colour code : ");
	int currentColour = input.nextInt();

	switch(currentColour){
	case 1 :
	System.out.println("Next traffic light is green"); break;
	case 2 :
	System.out.println("Next traffic light is yellow"); break;
	case 3 :
	System.out.println("Next traffic light is red"); break;
	default : System.out.println("Invalid colour");
      
    }
}
}
