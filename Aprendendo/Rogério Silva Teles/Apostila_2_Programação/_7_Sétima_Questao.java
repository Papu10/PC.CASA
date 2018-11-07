package Apostila_2_Programação;

import java.util.Scanner;

public class _7_Sétima_Questao {

	public static void main(String[] args) {

		double salario;
		int opcao;
		Scanner op = new Scanner (System.in);
	    
		
		    System.out.println("Digite quantas horas foram trabalhadas no mes");
		    
		    	salario = op.nextDouble();
		    	
		    System.out.println("Digite o numero correspondente ao seu cargo");
		    
			System.out.println("1 - Administrativo");
			
			System.out.println("2 - Produção");
			
		    	opcao = op.nextInt();
		    
		    	if (opcao == 1) {
		    		
		    		System.out.println("Seu salário é = R$"+ salario*12);
		    		
		    	}else if (opcao == 2) {
		    		
		    		System.out.println("Seu salário é = R$"+ salario*10);
		    		
		    	}else {
		    		System.out.println("Opção inválida");
		    		System.exit(0);
		    	}
		 
		    	
		
	}

}
