package Apostila_2_Programação;

import java.util.Scanner;

public class _5_Quinta_Questão {

	public static void main(String[] args) {
	 String opcao;
	 Scanner op = new Scanner(System.in);
	 	
	 	System.out.println("Digite a letra correspondente a opção desejada");
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
	 				System.out.println("Opção Inválida");
	 				
	 			
	 		}

	}

}
