package example;

import java.util.Scanner;

public class team2_16_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.println("입력 >> ");

		String lower = sc.nextLine().toLowerCase();

		for (char i = 'a'; i <= 'z'; i++) {
			int num = 0;
			System.out.print(i + " : ");
			for (int j = 0; j < lower.length(); j++) {

				if (lower.charAt(j) == i) {
					num++;
				}

			}
			System.out.println(num);
		}
	}

}
