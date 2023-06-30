package assignment_1;

public class assignment_1 {

	public static void main(String [] args) {
		int n=8;
		
		
		System.out.println("1.Write a program(WAP) to print INEURON using pattern programming logic.");
		System.out.println("                                  -------------------------");
		System.out.println();
		for(int i=0 ; i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if(i==0 || i==n-1 || j==(n-1)/2)
				System.out.print("*");
				else
					System.out.print(" ");
	
			}
			
			System.out.print("  ");
	       for(int j=0;j<n;j++) {
				
				if(j==0 || j==n-1 || i==j)
				System.out.print("*");
				else
					System.out.print(" ");
	
			}
	       
	       System.out.print("  ");
	       for(int j=0;j<n;j++) {
				
				if(j==0 || i==0 || i==(n-1)|| i==(n-1)/2)
				System.out.print("*");
				else
					System.out.print(" ");
	
			}
	       
			 
	       System.out.print("  ");
	       for(int j=0;j<n;j++) {
				
				if(j==0 && i!=n-1 || j==n-1 &&i!=n-1 || i==n-1 && j!=0 && j !=n-1)
				System.out.print("*");
				else
					System.out.print(" ");
	
			}
			
	       
	       System.out.print("  ");
	       for(int j=0;j<n;j++) {
				
				if(j==0  || i==0 &&j!=(n-1) ||j==(n-1)&&i<=(n-1)/2&&i!=0 && i!=(n-1)/2 ||(i-j)==1&& i>=(n-1)/2 || i==(n-1)/2 && j!=n-1  )
				System.out.print("*");
				else
					System.out.print(" ");
	
			}
			
	       System.out.print("  ");
	       for(int j=0;j<n;j++) {
				
				if(j==0 && i!=0 && i!=n-1 || i==0 && j!=0 && j!=n-1 || i==(n-1)&& j!=0 && j!=n-1 || j==(n-1) && i!=0 && i!=n-1)
				System.out.print("*");
				else
					System.out.print(" ");
	
			}
	       
	       
	       System.out.print("  ");
	       for(int j=0;j<n;j++) {
				
				if(j==n-1|| j==0 ||i==j)
				System.out.print("*");
				else
					System.out.print(" ");
	
			}
			
	       
			System.out.println(" ");
			
			
			
			
		}
		System.out.println("                                  -------------------------");
		System.out.println();
		System.out.println("2. Write a program to print\r\n"
				+ "1 1 1 1\r\n"
				+ "2 2 2 2\r\n"
				+ "3 3 3 3\r\n"
				+ "4 4 4 4");
		System.out.println("                                  -------------------------");
		System.out.println();
		int n1=5;
		for(int i=1 ; i<n1;i++) {
			for(int j=0;j<n1;j++) {
				System.out.print(i + " ");
			}
			
			System.out.println();
	}
		
		System.out.println("WAP to print to print patterns ..3..4..5  ");
		System.out.println();
		
		
		for(int i=0 ; i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if(i==0 || i==n-1 || j==0 || j==(n-1) || (i+j)<=(n-1)/2  || (j-i)>=(n-1)/2)
				System.out.print("*");
				else
					System.out.print(" ");
	
			}
			
			System.out.print("   ");
			
	for(int j=0;j<n;j++) {
				
				if(j==0&&i>=(n-1)/2  || j==(n-1)&&i>=(n-1)/2 ||i==n-1 || (i-j)>=(n-1)/2|| (i+j)>=((n-1)+(n-1)/2))
				System.out.print("*");
				else
					System.out.print(" ");
	
			}
	
             System.out.print("  ");
              for(int j=0;j<n;j++) {
			
			if(i==0 || i==n-1 || j==0 || (i+j)<=(n-1)/2 || (i-j)>=(n-1)/2)
			System.out.print("*");
			else
				System.out.print(" ");

		}
	
			
			System.out.println();
		
		}
		
		
		
		
		
		
		
		
}}
