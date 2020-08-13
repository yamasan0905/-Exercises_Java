package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question3 {

	public static void main(String[] args) {
		
		
		System.out.println("”’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numbers[] = new int[10];
		
		int inputNumber = 10;

		try {
			for (int i = 0; i < inputNumber; i++) {
				numbers[i] = Integer.parseInt(br.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();

		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
		
		System.out.println();

		for (int number : numbers) {
			if (number % 2 != 0) {
				System.out.println(number);
			}
		}

	}
}
