
public class Funcionario {

private String nome, cargo;
private double salario, aumento;
private int idade;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	//Construtor da class
	public Funcionario(String nome, String cargo, double salario, int idade) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.idade = idade;
	}
	
	
	//Metodo aumenta salario
	void aumentoSalarial(){
		
		salario = salario + aumento;
		
	}
	
	
	
}
