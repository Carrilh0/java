public class Livro extends Produto {
   
	private String autor;

	public Livro(String autor,String nomeloja, double preco, String descricao) {
		super(nomeloja,preco,descricao);
		this.autor=autor;
	}
	
	public void setAutor(String autor){
		this.autor=autor;
	}
   
	public String getAutor(){
	   return autor;
	}
   
   
   
}