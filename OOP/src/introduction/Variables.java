package introduction;

public class Variables {

	public static void main(String[] args) {
		int firstNumber; 
		firstNumber  = 5; 
		int secondNumber  = 4; 
		int sum = firstNumber + secondNumber;
		System.out.println(sum);
		firstNumber = --secondNumber;
		System.out.println(firstNumber + secondNumber);

		double thirdNumber = 5;
		// double thirdNumber = 2;
		System.out.println(thirdNumber);
		double fourthNumber = 3.5;
		System.out.println(thirdNumber / fourthNumber );

		boolean alwaysTrue = true;
		boolean thirdSmallerFourth  = thirdNumber  < fourthNumber;
		System.out.println(alwaysTrue && thirdSmallerFourth);

		char karakter = ' ';
		String ime = "Petar";
		String prezime = "Petrovic";
		System.out.println(ime+karakter+prezime+" Njegos");
	}
}