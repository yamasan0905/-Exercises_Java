package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question {

	public static void main(String[] args) {

		System.out.println("”’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numbers[] = new int[10];

		try {
			for( int i = 0 ; i < 10 ; i++ ) {
				numbers[i] = Integer.parseInt( br.readLine() );
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
		

		for (int n :  numbers) {
			System.out.println(n * 2);
		}

	}

}
