/**
 * 
 */
package ex2.git;
import java.util.Scanner;

/**
 * @author Arthur
 *
 */
public class TiposPrimitivos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do aluno");
		String nome = teclado.nextLine();
		System.out.println("Digite a nota do aluno");
		float nota_1 = teclado.nextFloat();
		
		System.out.println("O nome é: " + nome);
		System.out.printf("E a nota é: %.2f", nota_1);
		
		// Converter inteiro para String
		
		int idade = 30;
		String valor = Integer.toString(idade);
		System.out.println("\nTransformando Int em String: " + valor);
		
		// Converter String para inteiro
		
		String valor_2 = "30.5";
		float idade_2 = Float.parseFloat(valor_2);
		System.out.println("\nTransformando String em Int: " + idade_2);
				

	}

}
