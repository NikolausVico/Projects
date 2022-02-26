import java.util.Scanner;


public class ProcessName {
    
    
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.print("Enter your name: ");
	String name = console.nextLine();
	int pemisah = name.indexOf(" ");
	String lastName = name.substring(pemisah+1);
	String firstName = name.substring(0,pemisah);

System.out.println("Your name is : "+lastName+", "+firstName);  
                
        
    }
}