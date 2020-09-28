package arrayNumbers;

public class CreatingArray {
	
	public static void main (String [] args) {
		 
		int [] arrayOfTen = new int [10];
		
		 arrayOfTen [0] = 1;
		 arrayOfTen [1] = 2;
		 arrayOfTen [2] = 3;
		 arrayOfTen [3] = 4;
		 arrayOfTen [4] = 5;
		 arrayOfTen [5] = 6;
		 arrayOfTen [6] = 7;
		 arrayOfTen [7] = 8;
		 arrayOfTen [8] = 9;
		 arrayOfTen [9] = 10;
		
		int length = arrayOfTen.length;
		
		for (int i=0; i< length; i++) {
			System.out.println(" Array : "  + "index "+ i + " : " + arrayOfTen[i]);
		}
	}

}
// i is greater than length 