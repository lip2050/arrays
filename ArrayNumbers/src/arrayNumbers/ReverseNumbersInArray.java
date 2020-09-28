package arrayNumbers;

public class ReverseNumbersInArray {
	
	public static void main (String [] args) {

		int [] arrayOfTen = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int length = arrayOfTen.length;
		
		for (int i=length - 1; i>=0; i--) {
			System.out.println(" Array : "  + " index"+ i + " : " + arrayOfTen[i]);
		}
	}

}
