package TrianguloAtividade;

public class Triangulo {
	int x,y,z;

public void setX(int x) {
	this.x = x;
	
}

public void setY(int y) {
	this.y = y;
	
}

public void setZ(int z) {
	this.z = z;
	
}

public void condicao() {
	
if((x == y) && (y == z) && (z == x))
	System.out.print("Triangulo Equil�tero");
else
	if ((x == y) || (y == z) || (z == x))
		System.out.print("Triangulo Is�sceles");	
else
	System.out.print("Triangulo Escaleno");
	
	}
}
