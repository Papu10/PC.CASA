package Apostila_2_Programação;

import java.util.Scanner;

public class _6_Sexta_Questao {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner (System.in);
	
		System.out.println ("Digite o valor do produto");
		double valor = s.nextDouble();
		System.out.println("DIGITE A TECLA CORRESPONDETE AO SEU MODO DE PAGAMENTO");
		System.out.println("1- A VISTA");
		System.out.println("2- A PRAZO");
	    int opcao = s.nextInt();
	    if (opcao== 1) {
	    	System.out.println("VOCÊ TERÁ UM DESCONTO DE 5%");
	    	System.out.println("PREÇO FINAL=");
	    	System.out.println(valor - (valor *5/100));
	    	
	    }else {
	    	System.out.println("VOCÊ TERÁ  JUROS DE 2%");
	    	System.out.println("PREÇO FINAL=");
	    	System.out.println(valor + (valor *2/100));
	    }
		}

	}