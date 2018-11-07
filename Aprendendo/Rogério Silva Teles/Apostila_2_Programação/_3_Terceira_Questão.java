package Apostila_2_Programação;

import java.util.Scanner;

public class _3_Terceira_Questão {

	public static void main(String[] args) {
		
		double preco1 , preco2 , preco3;
			Scanner p = new Scanner (System.in);
				
			    System.out.println("Digite o preço de um produto.");
					preco1 = p.nextDouble();
				
				System.out.println("Digite o preço do segundo produto");
					preco2 = p.nextDouble();
					
				System.out.println("Digite o preço do terceiro produto");
					preco3 = p.nextDouble();
		
		if(preco1>preco2 && preco2>preco3) {
				System.out.println("O produto com preço = "+preco3+" é o mais barato");
				
		}else if(preco2>preco1 && preco1>preco3) {
			System.out.println("O produto com preço = "+preco3+" é o mais barato");
			
		}else if(preco2>preco3 && preco3>preco1) {
			System.out.println("O produto com preço = "+preco1+" é o mais barato");
		
	    }else if(preco3>preco2 && preco2>preco1) {
			System.out.println("O produto com preço = "+preco1+" é o mais barato");
			
	    }else if(preco1>preco3 && preco3>preco2) {
			System.out.println("O produto com preço = "+preco2+" é o mais barato");
			
	    }else if(preco3>preco1 && preco1>preco2) {
			System.out.println("O produto com preço = "+preco2+" é o mais barato");
			
	    }
	    }
		
	}
