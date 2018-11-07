package Apostila_2_Programação;

import java.util.Scanner;

public class _9_Nona_Questao {

	public static void main(String[] args) {
	
		double l1 , l2 , l3 ;
		
			Scanner s = new Scanner (System.in);
		
				System.out.println("Digite o numero correspondente a um dos lados do triangulo");
			
						l1 = s.nextDouble();
			
			  	System.out.println("Digite o numero correspondente a outro dos lados do triangulo");
				
			  			l2 = s.nextDouble();
			  
			  	System.out.println("Digite o numero correspondente a outro dos lados do triangulo");
				
			  			l3 = s.nextDouble();
			  			
			  	if (l1+l2>l3 && l1+l3>l2 && l2+l3>l1) {
			       
			  		System.out.println("É UM TRIÂNGULO!");
			  		
			  				if (l1 == l2 && l2 == l3) {
			  				
			  					System.out.println("Triangulo equilatero!");
			  				
			  				}else if (l1 == l2 || l1 == l3 || l2 == l3) {
			  				
			  					System.out.println("Triangulo isóceles!");
			  			
			  				}else {
			  					 
			  					System.out.println("Triangulo escaleno!");
			  				}
			  				
			  				
			  	}else {
			  		
			  		System.out.println("NÃO É UM TRIÂNGULO!");
			  		
			  		 System.exit(0);
			  	}
	}

}
