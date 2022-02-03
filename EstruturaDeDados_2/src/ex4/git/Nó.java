package ex4.git;

public class Nó {
	
	private Object object;
	private Nó refNó;
	
	public Nó() {
		
	}
	
	public Nó(Object object) {
			
		this.refNó = null;
		this.object = object;
			
	}
	
	public Object getObject() {
		
		return object;
		
	}
	
	public void setObject(Object object) {
		
		this.object = object;
		
	}
	
	public Nó getRefNó() {
		
		return refNó;
		
	}
	
	public void setRefNó(Nó refNó) {
		
		this.refNó = refNó;
		
	}

	@Override
	public String toString() {
		return "Nó [object=" + object + "]";
	}

}
