package com.atividade.abstrata;


public class DiaDosNamorados extends ContaWeb {

public DiaDosNamorados(String destinatario,String data){
    super(destinatario, data);
    this.destinatario=destinatario;
    this.data=data;
}
        
    public void showMessange() {
       System.out.println("Feliz Dia dos Namorados. Ass: " + destinatario+"\n");   
    }  
    
    public void showMessgemCompleto(){
        System.out.println("Voce e legal. Ass: "+destinatario+"Data: "+data+"\n");
    }
  
}

