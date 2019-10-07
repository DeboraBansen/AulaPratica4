package dados;

public class Turma {
	private Estudantes[] estudante;
	
	
	public Turma(int numEstudantes) {
		estudante= new Estudantes[numEstudantes];
	}


	public Estudantes getEstudante(int pos) {
		return estudante[pos];
	}


	public void setEstudante(Estudantes est,int pos) {
		estudante[pos] = est;
	}
	public float mediaTurma() {
		float media=0;
		for(int i=0;i<estudante.length;i++) {
			media+=estudante[i].mediaEstudante();
		}
		return media/estudante.length;
	}

}
