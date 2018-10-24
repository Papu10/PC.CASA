package Praticando_JAVA;

import java.util.Scanner;

public class AP_6_VENDENDO_CARRO {

	public static void main(String[] args) {
		// 
		double preço;
		Scanner pr = new Scanner(System.in);
		int opcao;
		Scanner op = new Scanner(System.in);
		
		System.out.println("Digite o valor do carro");
		preço = pr.nextDouble();
		
		System.out.println("DIGITE O NUMERO CORRESPONDETE AO ANO DO CARRO");
		System.out.println(" ");
		System.out.println("1- ANTES 2000");
		System.out.println("2- DEPOIS 2000");
		System.out.println("3-SAIR");
		opcao = op.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("VOCE TEVE DESCONTO DE 12%");
			System.out.println("Preço final=");
			System.out.println(preço - (preço * 12/100));
			break;
		case 2:
			System.out.println("VOCE TEVE DESCONTO DE 7%");
			System.out.println("Preço final=");
	        System.out.println(preço - (preço * 7/100));
	        break;
	        default:
	        	System.out.println("OPÇÃO INVÁLIDA. RECOMECE");
		}
		
		
		
		

	}

}
