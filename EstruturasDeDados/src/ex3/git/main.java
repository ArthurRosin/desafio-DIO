package ex3.git;

public class main {
	
	public static void main(String[] args){
		
		EstruturasDeDados minhaPilha = new EstruturasDeDados();
		
		minhaPilha.push(new Nó(1));
		minhaPilha.push(new Nó(2));
		minhaPilha.push(new Nó(3));
		minhaPilha.push(new Nó(4));
		minhaPilha.push(new Nó(5));
		minhaPilha.push(new Nó(6));
		
		System.out.println(minhaPilha);
		
		System.out.println(minhaPilha.pop());
		
		System.out.println(minhaPilha);
		
		minhaPilha.push(new Nó (99));
		System.out.println(minhaPilha);
			
		
	}
	
}
