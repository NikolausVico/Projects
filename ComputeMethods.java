
import java.util.Random;
public class ComputeMethods {
    
    public double fToC(double degreesF) {
		double degreesC = (degreesF - 32)*(5.0/9.0);
		System.out.println("Derajat dalam oC : " +degreesC);
		return degreesC;
    	
    }
    public double hypotenuse(int a, int b) {
    	double c = (a*a) + (b*b);
    	System.out.println("Sisi miringnya adalah : " +Math.sqrt(c));
    	return Math.sqrt(c) ;
    	
    }
    public int roll() {
    	Random dice = new Random();
    	int dice01 = dice.nextInt(1,6);
    	int dice02 = dice.nextInt(1,6);
    	System.out.println("Dadu pertama menunjukan angka : "+dice01);
    	System.out.println("Dadu kedua menunjukan angka : " +dice02);
    	System.out.println("Jumlah Kedua dadu adalah = " + (dice01+dice02));
		return 0;
}
}
