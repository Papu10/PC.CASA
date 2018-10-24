package Praticando_JAVA;

import java.util.Scanner;

public class AP_3_FORMA_DE_PAGAMENTO {

	public static void main(String[] args) {
		//Crie um programa que receba o nome de um produto, seu preço e a condição de
		//pagamento (à vista / a prazo). Se o pagamento for à vista o cliente deverá ter um
		//desconto de 5%, se for a prazo um juro de 2%.
		
	Scanner s = new Scanner (System.in);
	System.out.println ("Digite o nome do produto");
	String nome = s.nextLine();
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
