
package ex4.git;

/**
 * @author Arthur
 */
public class EstruturaDeDados_2 {

	private N� refN�EntradaFila;
	
	public EstruturaDeDados_2() {
		
		this.refN�EntradaFila = null;
	}
	
	
//M�todo Fila: enqueue
	public void enqueue(N� novoN�) {
		
		novoN�.setRefN�(refN�EntradaFila);
		refN�EntradaFila = novoN�;
		
	}
	
//M�todo Fila: First
	public N� first() {
		
		if(!this.IsEmpty()) {
			N� PrimeiroN� = refN�EntradaFila;
			while(true) {
				if(PrimeiroN�.getRefN�() != null) {
					
					PrimeiroN� = PrimeiroN�.getRefN�();
					
				}
				
				else {
					
					break;
					
				}
				
			}

			return PrimeiroN�;
		}
		
		return null;
		
	}
	
//M�todo Fila: dequeue
		public N� dequeue() {
			
			if(!this.IsEmpty()) {
				N� PrimeiroN� = refN�EntradaFila;
				N� N�Auxiliar = refN�EntradaFila;
				while(true) {
					if(PrimeiroN�.getRefN�() != null) {
						
						N�Auxiliar = PrimeiroN�;
						PrimeiroN� = PrimeiroN�.getRefN�();
						
					}
					
					else {
						
						N�Auxiliar.setRefN�(null);
						break;
						
					}
					
				}
				
				return PrimeiroN�;
				
			}
			
			return null;
			
		}
	
	
//M�tolo Fila: IsEmpty
		public boolean IsEmpty() {
			
			return refN�EntradaFila == null? true : false;
			
		}


		@Override
		public String toString() {
			String stringRetorno = "";
			N� N�Auxiliar = refN�EntradaFila;
			
			if(refN�EntradaFila != null) {
				while (true) {
					stringRetorno += "[N�{OBJETO = " + N�Auxiliar.getObject()+ "}]---->";
					
					if(N�Auxiliar.getRefN�()!= null) {
						N�Auxiliar = N�Auxiliar.getRefN�();
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
