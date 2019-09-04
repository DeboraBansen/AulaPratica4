
public class Estudante {
  private String nome;
  private float[] notas=new float[4];
  
  //public Estudante(int quantEstudant){
	//  notas=new float[quantEstudant];
  //}
  
  public Estudante() {
	// TODO Auto-generated constructor stub
}
public void setNome(String nome){
	  this.nome=nome;
	  
  }
  public String getNome(){
	  return nome;
  }
  public boolean setNota(int pos,float nota){
	  this.notas[pos]=nota;
	  return true;
  }
  public float getNota(int pos){
	  return notas[pos];
  }

  public float getMedia(){
	  float soma=0;
	  for(int i=0;i<notas.length;i++){
		  soma+=notas[i];
	  }
	  return soma/notas.length;
	  
  }
}
