package logicalProgram;

public class String {

	public static void main(java.lang.String[] args) {
		
		int a[]= {155,78,196,69,78,25,56,48,96};
		
		int max=a[0];
		for (int i = 0; i<a.length;i++) 
		{
			if(max<a[i])
			max=a[i];
			
		}
		System.out.println(max);

	}


	}


