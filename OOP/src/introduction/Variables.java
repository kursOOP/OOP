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


		if(firstNumber > 0)
			System.out.println("firstNumber is positive");
		else if(firstNumber < 0)
			System.out.println("firstNumber is negative");
		else
			System.out.println("firstNumber is zero");


		int month = 5;

		if(month == 1)
			System.out.println("January");
		else if(month == 2)
			System.out.println("February");
		else if(month == 3)
			System.out.println("March");
		else if(month == 4)
			System.out.println("April");
		else if(month == 5)
			System.out.println("May");
		else if(month == 6)
			System.out.println("Jun");
		else if(month == 7)
			System.out.println("July");
		else if(month == 8)
			System.out.println("August");
		else if(month == 9)
			System.out.println("September");
		else if(month == 10)
			System.out.println("October");
		else if(month == 11)
			System.out.println("November");
		else if(month == 12)
			System.out.println("December");
		else
			System.out.println("Non-existent month");

		System.out.println("while 1-10");
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}

		System.out.println("while 8-3");
		i = 8;
		while(i>2) {
			System.out.println(i);
			i--;
		}

		int factorial = 1;
		i = 5;
		while(i>0){
			factorial = factorial * i;
			i--;
		}
		System.out.println("while 5! = "+factorial);

		factorial = 1;
		i = 5;
		do {
			factorial = factorial * i;
			i--;
		}while(i>0);
		System.out.println("do while 5! = "+factorial);

		factorial = 1;
		for(int j=1;j<=5;j++) {
			factorial = factorial * j;
		}
		System.out.println("for 5! = "+factorial);

		System.out.println("for 8-3");
		for(int j=8;j>2;j--) {
			System.out.println(j);
		}

		System.out.println("for 3-8");
		for(int j=3;j<9;j++) {
			System.out.println(j);
		}

		int[] firstArray;
		firstArray = new int[5]; 
		firstArray[0] = 1; 
		firstArray[1] = 2;
		firstArray[2] = 3;
		firstArray[3] = 4;
		firstArray[4] = 5;
		for (int j = 0; j < firstArray.length; j++) {
			System.out.println("index "+j+", value "+firstArray[j]);
		}
		for (int j = firstArray.length-1; j>=0; j--) {
			System.out.println("index "+j+", value "+firstArray[j]);
		}

		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}}; 
		System.out.println("matri");
		for(i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++)
				System.out.println(matrix[i][j]);
		}

	}
}