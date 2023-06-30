package assignment;

public class Name {
	public static void main(String[] args) {
	int n1=11;
	
	
	for (int i=0;i<n1;i++) {
    for(int j=0;j<n1;j++) {
			
			if( j==0 || (i-j)==(n1-1)/2 || (i+j) ==(n1-1)/2 ) {
			
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
         System.out.print(" ");
		for(int j=0;j<n1;j++) {
			
			if(i==0&&j!=0&j!=n1-1 || j==0 && i!=0 && i!=n1-1 || i==n1-1&& j!=0 && j!=n1-1 || j==n1-1&& i!=0 && i!=n1-1) {
			
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		 System.out.print(" ");
		 
		 
		 for(int j=0;j<n1;j++) {
				
				if(j==0 || j==(n1-1) ||(i-j)==0&&i<(n1-1)/2 || (i+j)==(n1-1) && i<(n1-1)/2  ){
				
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		 
		 System.out.print(" ");
           for(int j=0;j<n1;j++) {
			
			if(i==0&&j!=0&&j!=n1-1 || j==0&&i!=0 || i==(n1-1)/2 || j==n1-1 &&i!=0 ) {
			
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
           System.out.print(" ");
           
           for(int j=0;j<n1;j++) {
   			
   			if(i==n1-1||j==0) {
   				System.out.print("*");
   		}
   			else {
   				System.out.print(" ");
   			}
   		}
		System.out.println();
	}
	
	
	System.out.println();
	
	
}}