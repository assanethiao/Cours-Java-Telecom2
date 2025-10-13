import java.math.BigInteger;
public class Factorielle {
	
	public int intFactorielle(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return n * intFactorielle(n-1);
		}
		
	}
	
	public double doubleFactorielle(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return n * intFactorielle(n-1);
		}
		
	}
	public BigInteger bigIntFactorielle(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE; 
        } else {
            return BigInteger.valueOf(n).multiply(bigIntFactorielle(n - 1));
        }
    }
}
 