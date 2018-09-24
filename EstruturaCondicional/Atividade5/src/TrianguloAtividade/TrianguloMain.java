package TrianguloAtividade;

import java.util.Scanner;

public class TrianguloMain {

	public static void main(String[] args) {
		
		int x,y,z;
		
		Scanner ler = new Scanner(System.in);
		Triangulo opera = new Triangulo();
		
		System.out.println("Digite valor de A");
			x = ler.nextInt();
			opera.setX(x);
		
		System.out.println("Digite valor de B");
			y = ler.nextInt();
			opera.setY(y);
		System.out.println("Digite valor de C");
			z = ler.nextInt();
			opera.setZ(z);
			
			opera.condicao();
	
	}

}
