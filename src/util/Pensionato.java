package util;

public class Pensionato {
	
	private String estudante;
	private String email;
	private int quarto;
	
	public Pensionato() {  // Construtor Padrão
		
	}
	
	public Pensionato(String estudante, String email, int quarto) {   // Construtor
		this.estudante = estudante;
		this.email = email;
		this.quarto = quarto;
	}

	public String getEstudante() {
		return estudante;
	}
	
	public void setEstudante(String estudante) {
		this.estudante = estudante;
		}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getQuarto() {
		return quarto;
	}
	
	public String toString() {
		return quarto + ": " + estudante + ", " + email;
	}

	

}
