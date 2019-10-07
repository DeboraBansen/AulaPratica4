package apresentacao;
import java.util.Scanner;

import dados.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Turma turma;
		System.out.println("digite o numero de estudantes presentes na turma:");
		int numEstudante=in.nextInt();
		turma=new Turma(numEstudante);
		
		for(int i=0;i<numEstudante;i++) {
			Estudantes est=new Estudantes();
			System.out.println("digite o nome do "+(i+1)+" estudante:");
			est.setNome(in.next());
			for(int j=0;j<4;j++) {
				System.out.println("digite a "+(j+1)+" nota do estudante:");
				est.setNotas(in.nextFloat(),j);
			}
			turma.setEstudante(est, i);
		}
		
		for(int i=0;i<numEstudante;i++) {
			System.out.println("a media do "+turma.getEstudante(i).getNome()+" = "+turma.getEstudante(i).mediaEstudante());
		}
		System.out.println("oiiii\n");
		System.out.println("a media da turma foi = "+turma.mediaTurma());
		
		

	}

}
