package assignmentOne;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int i, j, isPrime;
		
		
		for (i = 2; i <= 1000; i++) {
		isPrime = 0;
		
		for (j = 2; j <= i / 2; j++) {
		if (i % j == 0) {
		isPrime = 1;
	    break;
		}
		}
		
		if (isPrime == 0) 
			System.out.println(i+" ");
		}	
		
	}
	}


