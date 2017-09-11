package opet.aulatds171a.main;

public class MainFinally {

	public static void main(String[] args) {
		
		try {
			System.out.println("Teste");
			int i=0, j=0;
			// força erro de arythmetic expression
			i = i/j;
		} catch (ArithmeticException e) {
			System.out.println("Deu exception");
			throw e;
		}
		finally {
			//finally sempre executa, independente se try levantou excessão ou não 
			System.out.println("Passou no bloco try");
		}
 


	}

}
