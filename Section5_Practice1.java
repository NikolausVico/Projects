import java.util.Scanner;

public class Section5_Practice1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a colour code : ");
        double wave = input.nextDouble();
        
        if(wave >= 380) {
        	System.out.println("The colour is red");
        }
        else if(wave >=450) {
        	System.out.println("The colour is blue");
        }
        else if(wave >=495) {
        	System.out.println("The colour is green");
        }
        else if(wave >=570) {
        	System.out.println("The colour is yellow");
        }
        else if(wave >=590) {
        	System.out.println("The colour is orange");
        }
        else if(wave >=620) {
        	System.out.println("The colour is red");
        }
        else
        	System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
    }
