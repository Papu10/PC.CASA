package Praticando_JAVA;

import java.util.Scanner;

public class AP_10_ONLY_WHILE {

	public static void main(String[] args) {
		
		int numero = 0;
		double parimp;
		
		
		while (numero>=0) {
		Scanner n = new Scanner(System.in);
			System.out.println("Digite um número");
				numero = n.nextInt();
				parimp = numero%2;
		if (parimp == 0) {
			System.out.println("Numero Par");
		
		}else {
			
			System.out.println("Número ímpar");
			
		}		

	}

	}
}
