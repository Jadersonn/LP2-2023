package lp2;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		System.out.print("Informe a altura 1 do triangulo: ");
		double altura = leia.nextDouble();
		
		System.out.print("Informe a base: ");
		double base =  leia.nextDouble();
		double area = (altura * base)/2;
		double perimetro = altura * 2 + base;
		

		System.out.println("Area do triangulo: "+area);
		System.out.println("Perimetro do triangulo: "+perimetro);
	}

}
