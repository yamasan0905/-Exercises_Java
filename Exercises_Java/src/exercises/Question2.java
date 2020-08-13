package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2 {

	public static void main(String[] args) {
		
		System.out.println("”’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numbers[] = new int[10];

		try {
			for (int i = 0; i < 10; i++) {
				numbers[i] = Integer.parseInt(br.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();

		for (int i = 9; i >= 0; i--) {
			System.out.println(numbers[i]);
		}

	}

}
