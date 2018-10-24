package Praticando_JAVA;

import java.util.Scanner;

public class AP_1_MAIOR_E_MENOR {
	//LEIA 3 NUMEROS E INFORME O MAIOR E O MENOR


	private static Scanner s;

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Digite 1 número inteiro");
		 int n1 = s.nextInt();
		 System.out.println("Digite 1 número inteiro");
		 int n2 = s.nextInt();
		 System.out.println("Digite 1 número inteiro");
		 int n3 = s.nextInt();
		
if (n1>n2 && n1>n3) {
	System.out.println("O NUMERO "+n1+" É O MAIOR NUMERO");
}
if (n2>n1 && n2>n3) {
	System.out.println("O NUMERO "+n2+" É O MAIOR NUMERO");
}
if (n3>n1 && n3>n2) {
	System.out.println("O NUMERO "+n3+" É O MAIOR NUMERO");
}
if (n1<n2 && n1<n3) {
	System.out.println("O NUMERO "+n1+" É O MENOR NUMERO");
}
if (n2<n1 && n2<n3) {
	System.out.println("O NUMERO "+n2+" É O MENOR NUMERO");
}
if (n3<n2 && n1>n3) {
	System.out.println("O NUMERO "+n3+" É O MENOR NUMERO");
}
//IZI PIZI


	}

}
