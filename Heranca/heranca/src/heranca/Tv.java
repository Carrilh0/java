package heranca;

public class Tv extends Eletrodomestico {
    
    private String canal;
    private int volume;
    private int tamanho;

    //Passagem de parametro de todos os atributos de Eletrodomestico e TV 
    public Tv(boolean estado, int voltagem, int consumo, double peso, String canal, int volume, int tamanho) {
        super(estado, voltagem, consumo, peso); //Atributos de eletrodomesticos //Ordem de precedencia igual
    
        this.canal=canal;
        this.volume=volume;
        this.tamanho=tamanho;
    }

    public String getCanal() {
        return canal;
    }

 
    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }  
}
