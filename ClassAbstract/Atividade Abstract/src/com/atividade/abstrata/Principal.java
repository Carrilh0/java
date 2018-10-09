
package com.atividade.abstrata;

public class Principal {
  public static void main(String args[]){
  
      DiaDosNamorados diafoda = new DiaDosNamorados("Leandro fudido","12/05");
      Natal natal = new Natal("Leandro Alves","25/12");
      Aniversario niver = new Aniversario("Leandro Alves","04/12");

      //Metodo 
      diafoda.showMessange();
      natal.showMessange();
      niver.showMessange();
      
      System.out.println("====Testando Metodo==== \n");
      diafoda.showMessgemCompleto();
      natal.showMessgemCompleto();
      niver.showMessgemCompleto();
  
  } 
}
