package Apostila_2_Programa��o;

import java.util.Scanner;

public class _5_Quinta_Quest�o {

	public static void main(String[] args) {
	 String opcao;
	 Scanner op = new Scanner(System.in);
	 	
	 	System.out.println("Digite a letra correspondente a op��o desejada");
	 	System.out.println("M - Matutino");
	 	System.out.println("V - Vespertino");
	 	System.out.println("N - Noturno");
	 	opcao = op.next();
	 		switch(opcao) {
	 			case "M":
	 				System.out.println("Bom Dia!");
	 				break;
	 			case "V":
	 				System.out.println("Boa Tarde!");
	 				break;
	 			case "N":
	 				System.out.println("Boa Noite!");
	 				break;
	 			default:
	 				System.out.println("Op��o Inv�lida");
	 				
	 			
	 		}

	}

}
