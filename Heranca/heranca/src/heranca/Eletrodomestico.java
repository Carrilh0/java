package heranca;

public class Eletrodomestico {
    
    private boolean estado;
    private int voltagem;
    private int consumo;
    private double peso;

    //Metodo para receber valor da class Main
    public Eletrodomestico(boolean estado, int voltagem, int consumo, double peso){
        this.estado = estado;
        this.voltagem = voltagem;
        this.consumo = consumo;
        this.peso = peso;
        }
    
    
    //Metodos de acesso
    public void setEstado(boolean estado){
        this.estado=estado;
    }
    
    public boolean isEstado() {
        return estado;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    
    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }




}
