package com.atividade.abstrata;


public class Aniversario extends ContaWeb {

public Aniversario(String destinatario, String data){
    super(destinatario, data);
    this.destinatario=destinatario;
    this.data=data;
}
        
    public void showMessange() {
       System.out.println("Feliz Aniversario. Ass: " + destinatario+"\n");   
    }  

    public void showMessgemCompleto(){
        System.out.println("Que voce tenha muitos anos de vida. Ass: "+destinatario+"Data: "+data+"\n");
    }
}
