
package ex3.git;

/**
 * @author Arthur
 */
public class EstruturasDeDados {

	private N� refN�EntratadaPilha;
		
	public EstruturasDeDados() {
		this.refN�EntratadaPilha = null;
	}
	
	// LIFO: M�todo Push
	public void push(N� novoN�) {
		
		N� refAuxiliar = refN�EntratadaPilha;
		refN�EntratadaPilha = novoN�;
		refN�EntratadaPilha.setRefNo(refAuxiliar);
		
	}
	
	// LIFO: M�todo Pop
	public N� pop() {
		
		if(!this.isEmpty()) {
			N� noPoped = refN�EntratadaPilha;
			refN�EntratadaPilha = refN�EntratadaPilha.getRefNo();
			return noPoped;
		}
		
		return null;
		
		
	}
	
	// LIFO: M�todo Top
	public N� top() {
		
		return refN�EntratadaPilha;
		
	}
	
	// LIFO: M�todo Empty
	public boolean isEmpty() {
		
		if(refN�EntratadaPilha == null) {
			return true;
		}
		
		return false;
		
		// return refEntratadaPilha == null ? true : false;
		// Maneira simplificada
	}
	
	@Override
	public String toString() {
		
		String stringRetorno = "----------------------\n";
		stringRetorno += " EstruturasDeDados \n";
		stringRetorno += "----------------------\n";
		
		N� noAuxiliar = refN�EntratadaPilha;
		
		while(true) {
			
			if(noAuxiliar != null) {
				stringRetorno += "[N�{dado=" + noAuxiliar.getDado() +"}]\n";
				noAuxiliar = noAuxiliar.getRefNo(); 
			} 
			
			else {
				break;
			}
			
		}
		
		stringRetorno += "=======================\n";
		return stringRetorno;
	}
	
}
