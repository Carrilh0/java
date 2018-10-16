package Simulado;

public abstract class Funcionario {

    private String nome;
    private int dia;
    private int mes;
    private int ano;
    private int nss;

    //METODO CONSTRUTOR
    Funcionario(String nome, int dia, int mes, int ano, int nss) {
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;                                 
        this.ano = ano;
        this.nss = nss;
    }

    public abstract double calcularSalario();   //METODO ABSTRATO 

   
    public void imprimirDados(){
      System.out.print("Nome Funcionario: "+nome+"\nData de Nascimento: "+dia+"/"+mes+"/"+ano+"\nINSS: "+nss);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }
}
