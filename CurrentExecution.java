package assignmentOne;

public class CurrentExecution {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		int loop[] = new int[] {12,34,66,85,900};
		
		for(int i=0;i<loop.length;i++) {
		
		if(loop[i]==85)
			break;
		
		System.out.println("i: "+loop[i]);
		}
		
		System.out.println("loop completed");

	}

}
