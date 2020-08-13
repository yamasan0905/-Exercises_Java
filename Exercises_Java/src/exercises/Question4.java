package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question4 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = new int[10];
		
		int count;
		int sum;
		
		//　入力した数値の回数を表す変数
		int inputNumberCount = 10;
		// 入力した数値の合計を表す変数
		int inputNumberSum = 100;
		
		
		for (count = 0, sum = 0; count < inputNumberCount && sum <= inputNumberSum; count++) {
			try {
				numbers[count] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				
				e.printStackTrace();
			}
			sum += numbers[count]; // 100を超えるまで加算
		}
		
		System.out.println();

		// 100を超えたら数値を出力
		for (int i = 0; i < count; i++) {
			System.out.println(numbers[i]);
		}
	}
}