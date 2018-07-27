/*ENTRADA DE DADOS*/

import java.util.Scanner;

public class EntradaDados{
                     /*Método*/
    public static void main(String args[]) {
      System.out.print("Digite seu nome:");
        Scanner teclado = new Scanner(System.in); /*METODO = ler DADOS*/
            String nome = teclado.nextLine();

      System.out.print("Digite sua nota:");
        Float nota = teclado.nextFloat();

      System.out.format("A nota de %s é %.1f \n", nome,  nota);
    }
}
