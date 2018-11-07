package testes;
import java.util.Scanner;

public class TRABALHOXHORAS {

	public static void main(String[] args) {
		// QUANTAS HORAS TRABALHA POR MES
		//QUANTO GANHA POR HORA
		//MOSTRAR QUANTO GANHA NO FINAL DO MES
	
		Scanner s = new Scanner (System.in);
	
		System.out.println("Digite quanto você ganha por hora");
		double ganha = s.nextDouble();
		System.out.println("Digite quantas horas você trabalha durante o mês");
		double hora = s.nextDouble();
		double salario = ganha * hora;
		//DECLAREI UMA VARIÁVEL PARA CALCULAR O SALARIO
		//PODERIA TER FEITO ESSE CALCULO LA EM BAIXO MSM
		System.out.println("SALÁRIO FINAL DO MÊS="+salario);
		
	}

}
