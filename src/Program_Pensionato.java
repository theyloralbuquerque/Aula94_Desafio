import java.util.Locale;
import java.util.Scanner;

import util.Pensionato;

public class Program_Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas reservas? ");
		int n = sc.nextInt();
		
		Pensionato[] vect = new Pensionato[n];

		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("ALUGUEL: #%d\n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();  // Consome a quebra de linha pendente anterior
			String estudante = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[i] = new Pensionato(estudante, email, quarto); // Aqui ocorre uma nova instanciação da classe Pensionato a cada repetição, passando as variável como argumento para o Construtor. 
			System.out.println();
		}
		
		System.out.println("RELAÇÃO DE RESERVAS: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getEstudante() != null) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
