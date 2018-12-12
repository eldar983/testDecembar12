package zadatak2;


public class MyArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] niz = {2,4,6,8};
		MyArray objekt = new MyArray(niz);
		
		System.out.println("Suma niza je " + objekt.sumAllElements());
		System.out.println("Najveci element niza je " + objekt.getLargestElemet());
		System.out.println("Najmanji element niza je " + objekt.getSmallestElement());
		
		objekt.printAllElements();
		

	}

}
