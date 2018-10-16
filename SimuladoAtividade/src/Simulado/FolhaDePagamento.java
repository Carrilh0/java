package Simulado;

public class FolhaDePagamento {

	public static void main(String[] args) {

		// Funcionarios Assalariados
		FuncionarioSalariado funSal1 = new FuncionarioSalariado("Vitor Carrilho", 12, 05, 2000, 45647867, 3.84, 31, 0);
		FuncionarioSalariado funSal2 = new FuncionarioSalariado("Augusto Jose", 24, 10, 1961, 45647867, 4.21, 30, 0);
		FuncionarioSalariado funSal3 = new FuncionarioSalariado("Leandro Alves", 04, 12, 1998, 45647867, 7.87, 30, 0);

			// Array de FuncionarioAssalariados
			FuncionarioSalariado[] funSalArray = new FuncionarioSalariado[3]; // Array de FuncionarioSalariado
				funSalArray[0] = funSal1;
				funSalArray[1] = funSal2;
				funSalArray[2] = funSal3;

					System.out.println("=========Funcionario Assalariados===========\n");
					int i;
					for (i = 0; i < funSalArray.length; i++) {
			
						// Aumentar salario
						if (2018 - funSalArray[i].getAno() <= 30)
			
							funSalArray[i].setAumento(200);
						else
							funSalArray[i].setAumento(100);
			
						System.out.println("Nome do Funcionario: " + funSalArray[i].getNome());
						System.out.println("Data de Nascimento: " + funSalArray[i].getDia() + "/" + funSalArray[i].getMes() + "/"+ funSalArray[i].getAno());
						System.out.println("Numero INSS: " + funSalArray[i].getNss());
						System.out.println("Valor Salarial: " + funSalArray[i].calcularSalario());
						System.out.println("");
			
					}

		// Funcionarios Hora
		FuncionarioHora funHora1 = new FuncionarioHora("Leticia Alves", 13, 4, 2003, 45647867, 8, 8, 2.1);
		FuncionarioHora funHora2 = new FuncionarioHora("Lucia Alves", 15, 7, 1956, 45647867, 8, 5.21, 2.1);
		FuncionarioHora funHora3 = new FuncionarioHora("Leandro Magalhaes", 23, 07, 1986, 45647867, 8, 3.46, 2.1);
		FuncionarioHora funHora4 = new FuncionarioHora("Douglas Santos", 01, 7, 1979, 45647867, 8, 6.78, 2.1);

			FuncionarioHora[] funHoraArray = new FuncionarioHora[4];
				funHoraArray[0] = funHora1;
				funHoraArray[1] = funHora2;
				funHoraArray[2] = funHora3;
				funHoraArray[3] = funHora4;

					int h;
					System.out.println("\n=========Funcionario Hora===========\n");
					for (h = 0; h < funHoraArray.length; h++) {
						System.out.println("Nome do Funcionario: " + funHoraArray[h].getNome());
						System.out.println("Data de Nascimento: " + funHoraArray[h].getDia() + "/" + funHoraArray[h].getMes() + "/"
								+ funHoraArray[h].getAno());
						System.out.println("Numero INSS: " + funHoraArray[h].getNss());
						System.out.println("Valor Salarial: " + funHoraArray[h].calcularSalario());
						System.out.println("");
			
					}

		// Funcionarios Comissionado
		FuncionarioComissionado funComissao1 = new FuncionarioComissionado("Kakashi Hatake", 23, 6, 1986, 45647867, 0,1200);
		FuncionarioComissionado funComissao2 = new FuncionarioComissionado("Naruto Uzumaki", 01, 7, 1979, 45647867, 30,1400);

			FuncionarioComissionado[] funComissaoArray = new FuncionarioComissionado[2];
				funComissaoArray[0] = funComissao1;
				funComissaoArray[1] = funComissao2;

					
					System.out.println("\n=========Funcionario Comissao===========\n");
					int k;
					for (k = 0; k < funComissaoArray.length; k++) {
							
						if(funComissaoArray[k].getMes() <= 6) 
							
							funComissaoArray[k].setComissao(30);
						else
							funComissaoArray[k].setComissao(20);
							
					
						System.out.println("Nome do Funcionario: " + funComissaoArray[k].getNome());
						System.out.println("Data de Nascimento: " + funComissaoArray[k].getDia() + "/"+ funComissaoArray[k].getMes() + "/" + funComissaoArray[k].getAno());
						System.out.println("Numero INSS: " + funComissaoArray[k].getNss());
						System.out.println("Valor Salarial: " + funComissaoArray[k].calcularSalario());
						System.out.println("");
			
						}	

					
	}
}
