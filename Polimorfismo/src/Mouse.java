public class Mouse extends Produto{
    
    private String tipo;
    
    public Mouse(String tipo, String nomeloja, double preco, String descricao) {
    	super(nomeloja,preco,descricao);
    	this.tipo = tipo;
    } 
	  
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
        public String getTipo(){
            return tipo;
        }
    
    //Retorna descricao do produto, modificado no construtor de Mouse
    public String getDescricao(String descricao) {
    	return descricao;
    }

}
