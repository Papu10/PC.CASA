package Apostila_2_Programa��o;

import java.util.Scanner;

public class _7_S�tima_Questao {

	public static void main(String[] args) {

		double salario;
		int opcao;
		Scanner op = new Scanner (System.in);
	    
		
		    System.out.println("Digite quantas horas foram trabalhadas no mes");
		    
		    	salario = op.nextDouble();
		    	
		    System.out.println("Digite o numero correspondente ao seu cargo");
		    
			System.out.println("1 - Administrativo");
			
			System.out.println("2 - Produ��o");
			
		    	opcao = op.nextInt();
		    
		    	if (opcao == 1) {
		    		
		    		System.out.println("Seu sal�rio � = R$"+ salario*12);
		    		
		    	}else if (opcao == 2) {
		    		
		    		System.out.println("Seu sal�rio � = R$"+ salario*10);
		    		
		    	}else {
		    		System.out.println("Op��o inv�lida");
		    		System.exit(0);
		    	}
		 
		    	
		
	}

}
