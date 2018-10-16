package Simulado;

public class FuncionarioComissionado extends Funcionario {

	private int comissao;
	private double valorFixoSalarial;

	FuncionarioComissionado(String nome, int dia, int mes, int ano, int nss, int comissao,double valorFixoSalarial) {
		super(nome, dia, mes, ano, nss);
		this.comissao = comissao;
		this.valorFixoSalarial = valorFixoSalarial;
	}

	public double calcularSalario() {
		return valorFixoSalarial = valorFixoSalarial + (valorFixoSalarial * comissao / 100);
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

	public double getValorFixoSalarial() {
		return valorFixoSalarial;
	}

	public void setValorFixoSalarial(double valorFixoSalarial) {
		this.valorFixoSalarial = valorFixoSalarial;
	}

}
