package com.patterns.diamonds;

public class Diamond {

	/*public static void printDiamond(String s) {
		for (int i = 1; i <= 5; i++) {
			for (int x = 2 - i; x >= 0; x--) {
				System.out.print(" ");
			}
			if ((i % 2) != 0) {
				for (int y = 1; y <= i; y++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
for(int i=3;i>=1;i--) {
	for(int x=1;x<i-1;x++) {
		System.out.print(" ");
	}
	if((i%2)!=0) {
		for(int y=1;y<=i;y++) {
			System.out.print("*");
		}
		System.out.println();
	}
}*/
	//}

	public static void main(String[] args) {
		//printDiamond("*");
		System.out.println("====Print Square====");
		printPa();
		System.out.println("====Print Diamond====");
		printDiamond();
		System.out.println("====Print Dumble====");
        printDumble();
        System.out.println("====Print C====");
        printC();
        System.out.println("====Print T====");
        printT();
        System.out.println("====Print I====");
        printI();
        System.out.println("====Print E====");
        printE();
        System.out.println("====Print F====");
        printF();
        System.out.println("====Print H====");
        printH();
    
	}

	public static void printPa() {
		int n=4,m=4;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if((i==0)||(j==0)||(i==n)||(j==m)) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void printDiamond() {
		int n=3;
		for(int i=1;i<=n;i++) {
			for(int x=1;x<=n-i;x++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
		
		for(int i=n-1;i>=1;i--) {
			for(int x=1;x<=n-i;x++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
	 	
	}
    
	public static void printDumble() {
		int n=3;
		/*for(int i=1;i<=n;i++) {
			for(int x=1;x<=n-i;x++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
		
			System.out.println();
		}*/
		
		for(int i=n;i>=1;i--) {
			for(int x=1;x<=n-i;x++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
		if(i!=1) {
			System.out.println();
			}
		}
	 	
		
		for(int i=1;i<=n;i++) {
			for(int x=1;x<=n-i;x++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1;k++) {
				if(i!=1) {
				System.out.print("*");
				}
			}
		
			System.out.println();
		}
		
	}
	
	public static void printC() {
		int n=4,m=4;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if((i==0)||(j==0)||(i==n)) {
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	public static void printT() {
		int n=4,m=4;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if((i==0)||(j==m)) {
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void printH() {
		int n=4,m=4;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if((i==2)||(j==0)||(j==m)) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	/**/
	public static void printI() {
		int n=4,m=4;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if((i==0)||(i==n)||(j==m)) {
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	
	public static void printE() {
		int n=4,m=4;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if((i==0)||(i==n)||(j==0)||(i==2)) {
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	public static void printF() {
		int n=4,m=4;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if((i==0)||(j==0)||(i==2)) {
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	
	public static void printHallowDiamond() {
		int n=3;
		for(int i=1;i<=n;i++) {
			for(int x=1;x<=n-i;x++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1;k++) {
				//if(i%2!=0)
				System.out.print("*");
			}
		
			System.out.println();
		}
		
		for(int i=n-1;i>=1;i--) {
			for(int x=1;x<=n-i;x++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1;k++) {
				//if((k%2==0)&&(i%2!=0))
				System.out.print("*");
			}
		
			System.out.println();
		}
	 	
	}
	
	
}
