import java.util.Scanner;
public class TestClass5026211107 {

    public static void main(String args[]) {
        
        //Create an instance of ComputeMethods, 
    	ComputeMethods compMeth = new ComputeMethods();
    	Scanner input = new Scanner(System.in);
    
        //invoke the 3 methods and dispay their results
    	double problem01 = compMeth.fToC(input.nextDouble());
    	compMeth.hypotenuse(input.nextInt(), input.nextInt());
    	compMeth.roll();
    }
}

