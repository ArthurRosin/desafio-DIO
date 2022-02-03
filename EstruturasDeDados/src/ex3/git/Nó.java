package ex3.git;

public class Nó {
	
	private int  dado;
	private Nó refNo = null;
	
	public Nó() {
		
	}

	public Nó(int dado) {
		super();
		this.dado = dado;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public Nó getRefNo() {
		return refNo;
	}

	public void setRefNo(Nó reNo) {
		this.refNo = reNo;
	}

	@Override
	public String toString() {
		return "Nó [dado=" + dado + "]";
	}
	
	
	
}
