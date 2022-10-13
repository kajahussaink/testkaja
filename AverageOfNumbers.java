package assignmentOne;

public class AverageOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double arr[]= new double[] {10,90.78,111,8989,7876};
		double sum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			sum=sum+arr[i];
				}
		
		double average=sum/arr.length;
		 System.out.println("Sum of Numbers = "+average); 
		
		
		
	}

}
