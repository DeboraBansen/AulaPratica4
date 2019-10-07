package dados;

public class Estudantes {
	private String nome;
	private float[] notas;
	
	public Estudantes() {
		notas=new float[4];
}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float[] getNotas() {
		return notas;
	}
	public void setNotas(float nota,int pos){
		notas[pos]=nota;
	}
	public float mediaEstudante() {
		float media=0;
		for(int i=0;i<4;i++) {
			media+=notas[i];
		}
		return media/4;
	}
	

}
