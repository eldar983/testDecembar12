package zadatak5;

import java.util.Scanner;

public class PrviKarakterKojiSeNePonavlja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Unesite neki string:");

		Scanner input = new Scanner(System.in);
		
		String s1 = input.nextLine();
		
		
		petlja: for(int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			for(int j = i + 1; j < s1.length(); j++) 
			
				if(ch == s1.charAt(j))
					continue petlja;

				System.out.println("Prvi karakter koji se ne pojavljuje u ostatku stringa je: " + ch);
				break;
			}
		input.close();
	}

}
