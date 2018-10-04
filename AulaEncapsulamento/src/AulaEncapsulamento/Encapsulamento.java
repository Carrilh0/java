package AulaEncapsulamento;


public class Encapsulamento {
	private String cpf="000.000";
	protected String nome="Leandro";
	public int idade=19;
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
		public String getCpf() {
			return cpf;
		}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
		public String getNome() {
			return nome;
		}
		
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
		public int getIdade() {
			return idade;
		}
	
	
	
}
