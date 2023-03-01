package lp2;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.print("Informe uma frase: ");
		String frase = leia.nextLine();
		System.out.print("Informe um numero inteiro:");
		int valor = leia.nextInt();
		for(int i = 0; i < valor ; i++) {
			System.out.println(frase);
		}

	}

}
