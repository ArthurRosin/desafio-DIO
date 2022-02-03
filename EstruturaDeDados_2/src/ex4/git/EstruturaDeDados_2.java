
package ex4.git;

/**
 * @author Arthur
 */
public class EstruturaDeDados_2 {

	private NÛ refNÛEntradaFila;
	
	public EstruturaDeDados_2() {
		
		this.refNÛEntradaFila = null;
	}
	
	
//MÈtodo Fila: enqueue
	public void enqueue(NÛ novoNÛ) {
		
		novoNÛ.setRefNÛ(refNÛEntradaFila);
		refNÛEntradaFila = novoNÛ;
		
	}
	
//MÈtodo Fila: First
	public NÛ first() {
		
		if(!this.IsEmpty()) {
			NÛ PrimeiroNÛ = refNÛEntradaFila;
			while(true) {
				if(PrimeiroNÛ.getRefNÛ() != null) {
					
					PrimeiroNÛ = PrimeiroNÛ.getRefNÛ();
					
				}
				
				else {
					
					break;
					
				}
				
			}

			return PrimeiroNÛ;
		}
		
		return null;
		
	}
	
//MÈtodo Fila: dequeue
		public NÛ dequeue() {
			
			if(!this.IsEmpty()) {
				NÛ PrimeiroNÛ = refNÛEntradaFila;
				NÛ NÛAuxiliar = refNÛEntradaFila;
				while(true) {
					if(PrimeiroNÛ.getRefNÛ() != null) {
						
						NÛAuxiliar = PrimeiroNÛ;
						PrimeiroNÛ = PrimeiroNÛ.getRefNÛ();
						
					}
					
					else {
						
						NÛAuxiliar.setRefNÛ(null);
						break;
						
					}
					
				}
				
				return PrimeiroNÛ;
				
			}
			
			return null;
			
		}
	
	
//MÈtolo Fila: IsEmpty
		public boolean IsEmpty() {
			
			return refNÛEntradaFila == null? true : false;
			
		}


		@Override
		public String toString() {
			String stringRetorno = "";
			NÛ NÛAuxiliar = refNÛEntradaFila;
			
			if(refNÛEntradaFila != null) {
				while (true) {
					stringRetorno += "[NÛ{OBJETO = " + NÛAuxiliar.getObject()+ "}]---->";
					
					if(NÛAuxiliar.getRefNÛ()!= null) {
						NÛAuxiliar = NÛAuxiliar.getRefNÛ();
					}
					
					else {
						stringRetorno += "null";
						break;
					}
				}
			}
			
			else {
				stringRetorno = "null";
			}
			
			return stringRetorno;
			
		}
		
		
	
}
