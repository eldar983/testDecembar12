package zadatak3;

import java.util.Scanner;

public class RolerCoaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Unesite jednu recenicu:");
		Scanner input = new Scanner(System.in);
		
	
		String rijec = input.nextLine();
		String novi = "";
		
		for(int i = 0; i < rijec.length(); i++) {
		
			if(i %2 == 0) {
			
				novi += Character.toUpperCase(rijec.charAt(i));
			}else
				novi += Character.toLowerCase(rijec.charAt(i));		  
			  }
		for(int i = 0; i <novi.length(); i++) {
			System.out.print(novi.charAt(i));
			
			
		}
		
		input.close();
						
			}
	}

