
package heranca;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){

    //Passagem do valores para Tv e Eletrodomestico
    Tv lg = new Tv(false,120,45,2.7,"04.1",46,270);
    Liquidificador lq = new Liquidificador("Branco",true,1.5,true,45,145,2.5);
    
    //TV
    System.out.println("Volume da tv: "+lg.getVolume());
    
    	lg.setVolume(90);
    
    System.out.println("Volume atualizado: "+lg.getVolume());
    
    //Liquidificador
    System.out.println("Capacidade do Liquidificador: "+lq.getCapacidade());

    	lq.setCapacidade(4.5);
    
    System.out.println("Capacidade do Liquidificador Atualizado: "+lq.getCapacidade());
    
    
    
    
   
    
    
    }
}
