
public class Produto {
    private String nomeloja;
    private double preco;
    private String descricao;
    
    
    public Produto(String nomeloja, double preco, String descricao) {
    	this.nomeloja = nomeloja;
    	this.preco=preco;
    	this.descricao=descricao;
    };
    
    
    //Metodos de Acesso
    public void setNomeLoja(String nomeloja){
    this.nomeloja=nomeloja;
    }
    
        public String getNomeLoja(){
        return nomeloja;
        }
    
    
    public void setPreco(double preco){
    this.preco=preco;
    }   
        public double getPreco(){
        return preco;
        }
 
   
    public void setDescricao(String descricao) {
    	this.descricao=descricao; 	
    }
        
        
    	public String getDescricao(){
    		return "Produto de Informatica";
        } 
        
        
    
    
}
