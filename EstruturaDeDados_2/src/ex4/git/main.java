package ex4.git;

public class main {
	
	public static void main(String[] args) {
		
		EstruturaDeDados_2 minhaFila = new EstruturaDeDados_2();
		minhaFila.enqueue(new N�("primeiro"));
		minhaFila.enqueue(new N�("segundo"));
		minhaFila.enqueue(new N�("terceiro"));
		minhaFila.enqueue(new N�("quarto"));
		minhaFila.enqueue(new N�("quinto"));
		minhaFila.enqueue(new N�("sexto"));
		
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.dequeue());
		
		System.out.println(minhaFila);
		
		minhaFila.enqueue(new N�("s�timo"));
		
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.first());
		
		System.out.println(minhaFila);
		
		
		
	}

}
