package Apostila_2_Programa��o;

import java.util.Scanner;

public class _1_Primeira_Quest�o {

	private static Scanner s;

	public static void main(String[] args) {
		int A , B;
		s = new Scanner(System.in);
		System.out.println("Digite um numero");
		A = s.nextInt();
		System.out.println("Digite outro numero");
		B = s.nextInt();
		double calculo = A%B;
		if (calculo == 0) {
			System.out.println("S�o divisiveis");
			
		}else {
			System.out.println("N�o s�o divisiveis");
		}

	}

}
