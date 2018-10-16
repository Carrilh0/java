package Simulado;

public class FuncionarioSalariado extends Funcionario {

	private double valorDia, aumento;
	private int diaTrabalhado;

	FuncionarioSalariado(String nome, int dia, int mes, int ano, int nss, double valorDia, int diaTrabalhado,
			int aumento) {
		super(nome, dia, mes, ano, nss);
		this.valorDia = valorDia;
		this.diaTrabalhado = diaTrabalhado;
		this.aumento = aumento;
	}

	public double calcularSalario() {
		return valorDia = getDiaTrabalhado() * getValorDia() * 8 + getAumento();
	}

	public double getValorDia() {
		return valorDia;
	}

	public void setValorDia(double valorDia) {
		this.valorDia = valorDia;
	}

	public int getDiaTrabalhado() {
		return diaTrabalhado;
	}

	public void setDiaTrabalhado(int diaTrabalhado) {
		this.diaTrabalhado = diaTrabalhado;
	}

	public void setAumento(double aumento) {
		this.aumento = aumento;
	}

	public double getAumento() {
		return aumento;
	}

	public String imprimirDados(String nome, int dia, int mes, int ano, int nss, double valorDia) {
		return ("Nome Funcionario: " + nome + " Dia: " + dia + "/" + mes + "/" + ano + "Horas Trabalhadas: "
				+ valorDia);
	}

}
