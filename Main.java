import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int quantEstudant;
		Turma turma;
		
		//criando a turma de estudantes
		System.out.println("digite a quantidade de estudantes da turma:");
		quantEstudant=in.nextInt();
		turma=new Turma(quantEstudant);
		
	
		for(int i=0;i<quantEstudant;i++){
			System.out.println("digite o nome do "+(i+1)+" nome do estudante:");
			Estudante est=new Estudante();
			est.setNome(in.next());
			for(int j=0;j<4;j++){
				System.out.println("digite a "+(j+1)+" nota do "+est.getNome());
				est.setNota(j, in.nextFloat());
			}
			turma.addEstudante(est);
		}
		
		for(int i=0;i<quantEstudant;i++){
			System.out.println("o estudante "+turma.getEstudante(i).getNome()+" teve media "+turma.getEstudante(i).getMedia());
			
		}
		System.out.println("a media da turma foi "+turma.getMedia());
	}

}
