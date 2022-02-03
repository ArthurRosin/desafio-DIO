package ex4.git;

public class main {
	
	public static void main(String[] args) {
		
		EstruturaDeDados_2 minhaFila = new EstruturaDeDados_2();
		minhaFila.enqueue(new Nó("primeiro"));
		minhaFila.enqueue(new Nó("segundo"));
		minhaFila.enqueue(new Nó("terceiro"));
		minhaFila.enqueue(new Nó("quarto"));
		minhaFila.enqueue(new Nó("quinto"));
		minhaFila.enqueue(new Nó("sexto"));
		
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.dequeue());
		
		System.out.println(minhaFila);
		
		minhaFila.enqueue(new Nó("sétimo"));
		
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.first());
		
		System.out.println(minhaFila);
		
		
		
	}

}
