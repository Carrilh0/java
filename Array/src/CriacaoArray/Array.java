package CriacaoArray;

public class Array {
 
	public static void main(String []args) {
	
		
	 int [] vetor = {45,546, 841,321,654,665,456, 5454,6542,1213};
	 
	 int i = 0;
	 
		 for(i=0;i<vetor.length;i++) {	 
			 if(vetor[i] % 2 == 0) //Verifica sé o valor armazenado é par 
			 System.out.println("Valores: " + vetor[i]);
		 }
	}
}

