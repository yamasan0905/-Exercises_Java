package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question4 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[10];
		
		//　入力した回数を表す変数
		int inputNumberCount;
		// 合計
		int total;
		
		
		for (inputNumberCount = 0, total = 0; inputNumberCount < 10 && total <= 100; inputNumberCount++) {
			try {
				numbers[inputNumberCount] = Integer.parseInt(br.readLine());
				
			} catch (NumberFormatException | IOException e) {
				
				e.printStackTrace();
			}
			total += numbers[inputNumberCount];// ローカル変数totalに、変数numbers[inputNumberCount]に格納された数値を加算
		}
		
		System.out.println();

		// ブロック変数iが変数inputNumberCountより小さい間、変数numbers[i]に格納された数値を表示
		for (int i = 0; i < inputNumberCount; i++) {
			System.out.println(numbers[i]);
		}
	}
}