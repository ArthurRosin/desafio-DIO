package ex3.git;

public class N� {
	
	private int  dado;
	private N� refNo = null;
	
	public N�() {
		
	}

	public N�(int dado) {
		super();
		this.dado = dado;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public N� getRefNo() {
		return refNo;
	}

	public void setRefNo(N� reNo) {
		this.refNo = reNo;
	}

	@Override
	public String toString() {
		return "N� [dado=" + dado + "]";
	}
	
	
	
}
