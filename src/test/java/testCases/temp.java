package testCases;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number 1 to 9 ");
		
		if(scanner.hasNextInt()) {
			int num = scanner.nextInt();
			
			if(num>=1&& num<=9) {
				for(int i=1;i<=num;i++) {
					for(int j=1;j<=num;j++) {
						System.out.println(j);
					}
					System.out.println();
				}
				for(int i=num-1;i>=1;i--) {
					for(int j=1;j<=i;j++) {
						System.out.println(j);
					}
					System.out.println();
				}
				
				}
			else {
				System.out.println("inavlid input");
			}
		}

		scanner.close();
	}

}
