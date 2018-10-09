public class Main {
	public static void main(String args[]) { 
    
		Mouse m = new Mouse("Wi-fi 2.4 Ghz","Americanas",59.90,"Mouse ótico, Saída USB. 1.600 dpi");
    
		Livro l = new Livro("Ernest","Saraiva",40.05,"Jogador N 1");
		
		System.out.println("Ficha tecnica: "+ m.getTipo()+"\nDescrição: "+m.getDescricao());
		System.out.println("");
		System.out.println("Ficha tecnica: "+ l.getAutor()+"\nDescrição: "+l.getDescricao());
		
		Main [] carrrinho = new Main[5];
		
		
		
		
	
	}
}
