package ex1;

import java.util.Scanner;

public class SquareRoot01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int result = 1;
		System.out.print("승수: ");

		int pow = scanner.nextInt();

		for (int i = 0; i < pow + 1; i++) {
			if (pow == i) {
				result = (int) Math.pow(2, i);
			}
		}
		// Q: 아래 for문을 작성하시오.

		System.out.println("2의 " + pow + "제곱근은 " + result + "입니다.");

	}

}
