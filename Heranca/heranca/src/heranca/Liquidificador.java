
package heranca;

public class Liquidificador extends Eletrodomestico {
  
    private String cor;
    private boolean filtro;
    private double capacidade;
           
   
public Liquidificador(String cor, boolean filtro, double capacidade, boolean estado, int voltagem, int consumo, double peso){
        super(estado,voltagem,consumo,peso); //Atributos de eletrodomesticos //Ordem de precedencia igual
        this.cor = cor;
        this.filtro=filtro;
        this.capacidade=capacidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isFiltro() {
        return filtro;
    }

    public void setFiltro(boolean filtro) {
        this.filtro = filtro;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }




}
