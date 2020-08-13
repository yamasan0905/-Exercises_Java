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
		
		//�@���͂������l�̉񐔂�\���ϐ�
		int inputNumberCount = 10;
		// ���͂������l�̍��v��\���ϐ�
		int inputNumberSum = 100;
		
		
		for (count = 0, sum = 0; count < inputNumberCount && sum <= inputNumberSum; count++) {
			try {
				numbers[count] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				
				e.printStackTrace();
			}
			sum += numbers[count]; // 100�𒴂���܂ŉ��Z
		}
		
		System.out.println();

		// 100�𒴂����琔�l���o��
		for (int i = 0; i < count; i++) {
			System.out.println(numbers[i]);
		}
	}
}