import java.util.Scanner;

public class PrivateMain {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		Scanner ler = new Scanner(System.in);
		Private pri = new Private();
		
		System.out.println("Digite seu nome");
		nome = ler.nextLine();
		System.out.println("Digite seu idade");
		idade = ler.nextInt();
		ler.close();
		
			pri.setNome(nome);
			pri.setIdade(idade);
		
		
		System.out.println("Seu nome é"+pri.getNome());
		System.out.println("Seu nome é"+pri.getIdade());
		pri.getIdade();
	}

}
