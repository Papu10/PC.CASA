package Apostila_2_Programa��o;

import java.util.Scanner;

public class _3_Terceira_Quest�o {

	public static void main(String[] args) {
		
		double preco1 , preco2 , preco3;
			Scanner p = new Scanner (System.in);
				
			    System.out.println("Digite o pre�o de um produto.");
					preco1 = p.nextDouble();
				
				System.out.println("Digite o pre�o do segundo produto");
					preco2 = p.nextDouble();
					
				System.out.println("Digite o pre�o do terceiro produto");
					preco3 = p.nextDouble();
		
		if(preco1>preco2 && preco2>preco3) {
				System.out.println("O produto com pre�o = "+preco3+" � o mais barato");
				
		}else if(preco2>preco1 && preco1>preco3) {
			System.out.println("O produto com pre�o = "+preco3+" � o mais barato");
			
		}else if(preco2>preco3 && preco3>preco1) {
			System.out.println("O produto com pre�o = "+preco1+" � o mais barato");
		
	    }else if(preco3>preco2 && preco2>preco1) {
			System.out.println("O produto com pre�o = "+preco1+" � o mais barato");
			
	    }else if(preco1>preco3 && preco3>preco2) {
			System.out.println("O produto com pre�o = "+preco2+" � o mais barato");
			
	    }else if(preco3>preco1 && preco1>preco2) {
			System.out.println("O produto com pre�o = "+preco2+" � o mais barato");
			
	    }
	    }
		
	}
