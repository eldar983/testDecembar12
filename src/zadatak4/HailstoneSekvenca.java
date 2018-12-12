package zadatak4;

import java.util.Scanner;

public class HailstoneSekvenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Unesite pocetni broj da bi dobili Hailstone sekvencu za uneseni broj: ");
		
		Scanner input = new Scanner(System.in);
		
		int broj = input.nextInt();
		
		System.out.print("Hailstone sekvenca za broj " + broj + " je: " + broj + " ");
		
		if(broj == 1) {
			System.out.println("Hailstone sekvenca za " + broj + " je: 1");
		}else {
			
			while(broj != 1) {
				if(broj % 2 == 0) {
					broj = broj / 2;
				}else {
					broj = (3 * broj) + 1;
				}
				System.out.print(broj + " ");
			}
		}	
		input.close();
	}
}
