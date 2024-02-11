package demo;

public class Demo {
	/** Esto en realidad es un comentario realizado en la rama de master */
	/** Otro comentario, ahora desde la rama cambios1 */
	private int variable1;
	
	/** Quiero otra variable que tratar aquí */
	private boolean estaBien;
	
	
	public Demo(int v1){
		estaBien = false;
		variable1 = v1;
		System.out.println(variable1);
		variable1 += 300;
		System.out.println(variable1);
		// Cosas adicionales para tener puntos de conexión en el árbol
		
		Esta vez vamos a rebasear en una misma rama.
		Esto es importante hacerlo bien
	}
}
