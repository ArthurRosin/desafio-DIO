package ex4.git;

public class N� {
	
	private Object object;
	private N� refN�;
	
	public N�() {
		
	}
	
	public N�(Object object) {
			
		this.refN� = null;
		this.object = object;
			
	}
	
	public Object getObject() {
		
		return object;
		
	}
	
	public void setObject(Object object) {
		
		this.object = object;
		
	}
	
	public N� getRefN�() {
		
		return refN�;
		
	}
	
	public void setRefN�(N� refN�) {
		
		this.refN� = refN�;
		
	}

	@Override
	public String toString() {
		return "N� [object=" + object + "]";
	}

}
