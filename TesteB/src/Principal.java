
public class Principal {
	public static void main(String[] args) {
		
		//Objeto que passo por parametro os valores das variaveis
		Funcionario fun1 = new Funcionario("Leandro","Programador",1780,19);
		Funcionario fun2 = new Funcionario("Leticia","Secretaria",1400,15);
		Funcionario fun3 = new Funcionario("Leandro","Programador",1980,25);
		Funcionario fun4 = new Funcionario("Leandro","Desemvolvedor Web",2780,29);
		Funcionario fun5 = new Funcionario("Leandro","Back-End",3780,31);
		
		
		Funcionario []array = new Funcionario[5];
		
			array[0] = fun1;
			array[1] = fun2;
			array[2] = fun3;
			array[3] = fun4;
			array[4] = fun5;	
		

	}

}
