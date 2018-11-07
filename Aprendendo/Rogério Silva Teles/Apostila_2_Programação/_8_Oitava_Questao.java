package Apostila_2_Programação;

import java.util.Scanner;

public class _8_Oitava_Questao {

	public static void main(String[] args) {
		
		
		double salario;
			Scanner s = new Scanner (System.in);
		    
				System.out.println("Digite seu salário atual");
				
				   salario = s.nextDouble();
				   
				if (salario < 280) {
					
						double act = salario + (salario*20/100);
						
						System.out.println("Aumento de 20%");
						
						System.out.println("Seu salário após reajuste é = R$"+act);
						
			}else if (salario >= 280 && salario < 700) {
				
						double act = salario + (salario*15/100);
						
						System.out.println("Aumento de 15%");
						
						System.out.println("Seu salário após reajuste é = R$"+act);
				
			}else if (salario >= 700 && salario < 1500) {
				
						double act = salario + (salario*10/100);
						
						System.out.println("Aumento de 10%");
				
						System.out.println("Seu salário após reajuste é = R$"+act);
				
			}else if (salario >= 1500) {
				
						double act = salario + (salario*5/100);
						
						System.out.println("Aumento de 5%");
						
						System.out.println("Seu salário após reajuste é = R$"+act);
			}
			    System.out.println("Seu salário antes era = R$"+salario);
			    
				   

	}

}
