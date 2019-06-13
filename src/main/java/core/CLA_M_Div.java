package core;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CLA_M_Div {
	public static void main (String [] cla){
	if (cla.length < 2) {System.out.println("At least two parameters"); System.exit(0);	}
	Double result = Double.valueOf(cla [0]);
	for (int i = 1; i <cla.length; i++) {result /= Double.valueOf(cla [i]);}
	System.out.println(new BigDecimal(result).setScale(2, RoundingMode.HALF_UP));
	}
}
