package com.ineuron.pattern;

public class Pattern_1 {
	
	public static void main(String[] args) {
		
		int n=13;
		System.out.println();
		  System.out.println("...........................Patterns covered during class lecture.................... ");
		  System.out.println(".....................................................................................");
		  System.out.println();
		  System.out.println();
		  System.out.println();
         System.out.println("-------------------------------Normal Pattern------------------------------");
         System.out.println("----------------------------------------------------------------------------");
         System.out.println();
		for (int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
				System.out.print("*");
			}
		System.out.print(" ");
		for(int j=i;j<n;j++) {
			
			System.out.print("*");
	}
		System.out.print("   ");
		for(int j=0;j<=i;j++) {
			
			System.out.print("*");
	}
		System.out.print("  ");
		for(int j=0;j<n;j++) {
			
			if(i==n-1|| j==n-1 || i==0 || j==0) {
				System.out.print("*");
		}
			else {
				System.out.print(" ");
			}
		}
		 System.out.print("  ");
		
		for(int j=0;j<n;j++) {
			
			if(i==j) {
			
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		
		System.out.print("   ");
		
		for(int j=0;j<n;j++) {
			
			if(j==0 || j==n-1 || i==(n-1)/2) {
			
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		

	System.out.println();
	
		}
		
		System.out.println();
		System.out.println("------------------------------complex patternss------------------------------");
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();
		System.out.println(             "              1.)");
		System.out.println();
		for (int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
				
		if(j==0 || j==n-1 || i==(n-1)/2 || i==0) {
				
		System.out.print("*");
				}
			else {
			System.out.print(" ");
				}
			}
			System.out.print(" ");
			
           for(int j=0;j<n;j++) {
				
				if(i>0&&i<n-1 || (j>0 && j<n-1) || i==(n-1)/2) {
				
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
           System.out.print(" ");
           for(int j=0;j<n;j++) {
				
				if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 || j==n-1&&i!=0 || i==(n-1)/2) {
				
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
           System.out.print(" ");
           
			for(int j=0;j<n;j++) {
				
				if(i==0 && j!=n-1 ||j==0 || i==n-1 && j!=n-1 || j==n-1&& i!=0 && i!=n-1) {
				
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
              for(int j=0;j<n;j++) {
				
				if(i==0 || j==(n-1)/2) {
				
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
              
              System.out.print("    ");
              for(int j=0;j<n;j++) {
            	  if(i==j || (i+j)==n-1 || i==0 || j==0 || i==n-1 || j==n-1 || (i+j)==(n-1)/2 || (i-j)==(n-1)/2 || (j-i)==(n-1)/2 ||(i+j)== (n-1)+(n-1)/2) {
            		  System.out.print("*");
            	  }
            	  else {
            		  System.out.print(" ");
            	  }
              }
              
              
             
              
              System.out.print("    ");
              for(int j=0;j<n;j++) {
            	  if( i==0 || j==0 || i==n-1 || j==n-1) {
            		  System.out.print("*");
            	  }
            	  else {
            		  System.out.print(" ");
            	  }
              }

              
              System.out.print("   ");
              for(int j=0;j<n;j++) {
            	  if(i==j || (i+j)==n-1 ) {
            		  System.out.print("*");
            	  }
            	  else {
            		  System.out.print(" ");
            	  }
              }

              
              System.out.print("   ");
              for(int j=0;j<n;j++) {
            	  if(  (i+j)==(n-1)/2 || (i-j)==(n-1)/2 || (j-i)==(n-1)/2 ||(i+j)== ((n-1)+(n-1)/2)){
            		  System.out.print("*");
            	  }
            	  else {
            		  System.out.print(" ");
            	  }
              }
              System.out.print("   ");
              for(int j=0;j<n;j++) {
            	  if(  (i+j)<(n-1)/2 || (i-j)>=(n-1)/2 || (j-i)>=(n-1)/2 ||(i+j)>=((n-1)+(n-1)/2)){
            		  System.out.print("*");
            	  }
            	  else {
            		  System.out.print(" ");
            	  }
              }


              
              
			System.out.println();
	
		}	
		System.out.println();
	}
}
