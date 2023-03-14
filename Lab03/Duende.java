package AtividadeNatal;

public class Duende {
	private String Nome;
	private int Idade;
	
	
	
	public Duende() {
		Nome = " ";
		Idade = 0;
	}
	
	public Duende(String nome, int idade) {
		Nome = nome;
		Idade = idade;
	}
	
	public String GetNome() {
		return Nome;
	}
	
	public int GetIdade() {
		return Idade;
	}
	
	public void SetNome(String nome) {
		Nome = nome;
	}
	
	public void SetIdade(int idade) {
		Idade = idade;
	}
	
	
	

}
