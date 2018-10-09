public class Main {
	public static void main(String args[]) { 
    
		//Objetos + valores das class Mouse e Livro
		Mouse m = new Mouse("Wi-fi 2.4 Ghz","Americanas",59.90,"Mouse ótico, Saída USB. 1.600 dpi");
    
		Livro l = new Livro("Ernest","Saraiva",40.05,"Jogador N 1");
		
		System.out.println("Ficha tecnica: "+ m.getTipo()+"\nDescrição: "+m.getDescricao()+"\nValor: R$"+m.getPreco());
		System.out.println("\nAutor do Livro: "+ l.getAutor()+"\nDescrição: "+l.getDescricao()+"\nValor: R$"+l.getPreco());
		
		//Main [] carrrinho = new Main[5];
		
		
		
		
	
	}
}
