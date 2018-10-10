public class Main {
	public static void main(String args[]) { 
		int i;
		
		//Objetos + passagem de valores por parametro class Construtor Mouse
		Mouse m = new Mouse("Wi-fi 2.4 Ghz","Americanas",59.90,"Mouse ótico, Saída USB. 1.600 dpi");

		//Construtor Livro
		Livro l = new Livro("Ernest","Saraiva",40.05,"Jogador N 1");
		
		System.out.println("====Teste de Polimorfismo====");
		System.out.println("Ficha tecnica: "+ m.getTipo()+"\nDescrição: "+m.getDescricao()+"\nValor: R$"+m.getPreco());
		System.out.println("\nAutor do Livro: "+ l.getAutor()+"\nDescrição: "+l.getDescricao()+"\nValor: R$"+l.getPreco());
		System.out.println("");
		
		Mouse mouse1 = new Mouse("Com fio","PontoFrio",46.90,"Gamer, 2.400DPI");
		Mouse mouse2 = new Mouse("Com fio","PeixeUrbano",70.90,"Gamer, 4.000DPI");
		Mouse mouse3 = new Mouse("Com fio","CasasBahia",98.90,"Workstation, 2.400DPI");
		
			//Array de objetos Mouse
			Mouse [] arrayM = new Mouse[4];
				arrayM[1] = mouse1;
				arrayM[2] = mouse2;
				arrayM[3] = mouse3;
		
		System.out.println("====== Carrinho de Compra ======");
		for(i=1;i<arrayM.length;i++){
			System.out.println("Compra N: "+i);
			System.out.println("Loja: "+arrayM[i].getNomeLoja());
			System.out.println("Tipo de Mouse"+arrayM[i].getTipo());
			System.out.println("Descricao: "+arrayM[i].getDescricao());
			System.out.println("Preco: R$"+arrayM[i].getPreco());
			System.out.println("======================================");
		}
	}
}
