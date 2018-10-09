
package com.atividade.abstrata;

public abstract class ContaWeb {

    protected String destinatario;
    protected String data;
    
    public abstract void showMessange();
    public abstract void showMessgemCompleto();


    //Construtor
    public ContaWeb(String destinatario, String nome){  
        this.destinatario=destinatario;
        this.data=data;
    }
    
    //Metodos de Acesso
    public void getDestinatario(){
        this.setDestinatario(destinatario);
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    public void getData(){
        this.setDestinatario(destinatario);
    }

    public void setData(String destinatario) {
        this.destinatario = destinatario;
    }
        
}