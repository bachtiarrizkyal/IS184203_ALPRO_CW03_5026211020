package computemethods5026211020;

import java.util.*;

public class ComputeMethods5026211020 {
    
  public double fToC(double SuhuF){
			double SuhuC = 5 * (SuhuF - 32) / 9;
			System.out.println("Temp in celcius is " + SuhuC);
			return 0;
		}
		public double hypotenuse(int a, int b){
			double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
			System.out.println("Hypotenuse is " + c);
			return 0;
		}
		public int roll(){
			Random angka = new Random();
			int dadu1= angka.nextInt(6)+1;
			int dadu2 = angka.nextInt(6)+1;
			System.out.println("The sum of the dice values is " + (dadu1+ dadu2));
			return 0;
	}
}