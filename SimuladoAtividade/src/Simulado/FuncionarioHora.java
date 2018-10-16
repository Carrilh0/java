package Simulado;

public class FuncionarioHora extends Funcionario {

    private double horasTrabalhada, valorHora, valorEspecial;

    FuncionarioHora(String nome, int dia, int mes, int ano, int nss, double horasTrabalhada, double valorHora, double valorEspecial) {
        super(nome, dia, mes, ano, nss);
        this.horasTrabalhada = horasTrabalhada;
        this.valorHora = valorHora;
        this.valorEspecial = valorEspecial;
    }

    public double calcularSalario() {
        return horasTrabalhada = horasTrabalhada * valorHora + valorEspecial;
    }

    public double getHorasTrabalhada() {
        return horasTrabalhada;
    }

    public void setHorasTrabalhada(double horasTrabalhada) {
        this.horasTrabalhada = horasTrabalhada;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorEspecial() {
        return valorEspecial;
    }

    public void setValorEspecial(double valorEspecial) {
        this.valorEspecial = valorEspecial;
    }

}
