package arrayNumbers;

public class AddingArrayContent {
	
	public static void main (String []args) {
		
		int [] arrayOfTen = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
        int length = arrayOfTen.length;
		
		for (int i=0; i< length; i++) {
			 sum += arrayOfTen[i];
			
			}
		System.out.println("The sum of this Array is " + sum);
	}

}
