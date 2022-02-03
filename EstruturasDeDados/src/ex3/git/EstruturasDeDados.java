
package ex3.git;

/**
 * @author Arthur
 */
public class EstruturasDeDados {

	private NÛ refNÛEntratadaPilha;
		
	public EstruturasDeDados() {
		this.refNÛEntratadaPilha = null;
	}
	
	// LIFO: MÈtodo Push
	public void push(NÛ novoNÛ) {
		
		NÛ refAuxiliar = refNÛEntratadaPilha;
		refNÛEntratadaPilha = novoNÛ;
		refNÛEntratadaPilha.setRefNo(refAuxiliar);
		
	}
	
	// LIFO: MÈtodo Pop
	public NÛ pop() {
		
		if(!this.isEmpty()) {
			NÛ noPoped = refNÛEntratadaPilha;
			refNÛEntratadaPilha = refNÛEntratadaPilha.getRefNo();
			return noPoped;
		}
		
		return null;
		
		
	}
	
	// LIFO: MÈtodo Top
	public NÛ top() {
		
		return refNÛEntratadaPilha;
		
	}
	
	// LIFO: MÈtodo Empty
	public boolean isEmpty() {
		
		if(refNÛEntratadaPilha == null) {
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
		
		NÛ noAuxiliar = refNÛEntratadaPilha;
		
		while(true) {
			
			if(noAuxiliar != null) {
				stringRetorno += "[NÛ{dado=" + noAuxiliar.getDado() +"}]\n";
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
