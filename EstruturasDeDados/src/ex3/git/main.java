package ex3.git;

public class main {
	
	public static void main(String[] args){
		
		EstruturasDeDados minhaPilha = new EstruturasDeDados();
		
		minhaPilha.push(new N�(1));
		minhaPilha.push(new N�(2));
		minhaPilha.push(new N�(3));
		minhaPilha.push(new N�(4));
		minhaPilha.push(new N�(5));
		minhaPilha.push(new N�(6));
		
		System.out.println(minhaPilha);
		
		System.out.println(minhaPilha.pop());
		
		System.out.println(minhaPilha);
		
		minhaPilha.push(new N� (99));
		System.out.println(minhaPilha);
			
		
	}
	
}
