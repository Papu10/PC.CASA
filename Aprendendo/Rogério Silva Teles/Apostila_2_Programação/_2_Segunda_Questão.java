package Apostila_2_Programa��o;

import java.util.Scanner;

public class _2_Segunda_Quest�o {

	public static void main(String[] args) {
		int n1 , n2 , n3;
		Scanner n = new Scanner(System.in);
		
			System.out.println("Digite um numero");
				n1 = n.nextInt();
			System.out.println("Digite outro numero");
				n2 = n.nextInt();
			System.out.println("Digite outro numero");
				n3 = n.nextInt();
				
		if(n1>n2 && n2>n3) {
			System.out.println("O maior n�mero � o = "+n1+" e o menor numero � o = "+n3);
			
		}else if(n2>n1 && n1>n3){
			System.out.println("O maior n�mero � o = "+n2+" e o menor numero � o = "+n3);
			
		}else if(n1>n3 && n3>n2) {
			System.out.println("O maior n�mero � o = "+n1+" e o menor numero � o = "+n2);
			
		}else if(n2>n3 && n3>n1) {
			System.out.println("O maior n�mero � o = "+n2+" e o menor numero � o = "+n1);
			
		}else if(n3>n1 && n1>n2) {
			System.out.println("O maior n�mero � o = "+n3+" e o menor numero � o = "+n2);
			
		}else if(n3>n2 && n2>n1) {
			System.out.println("O maior n�mero � o = "+n3+" e o menor numero � o = "+n1);
			
		}
		
		}
	}


