package demo;

public class Demo {
	/** Esto en realidad es un comentario realizado en la rama de master */
	/** Otro comentario, ahora desde la rama cambios1 */
	private int variable1;
	
	
	public Demo(int v1){
		variable1 = v1;
		System.out.println(variable1);
		variable1 += 300;
		System.out.println(variable1);
	}
}
