
public class Turma {
        private Estudante[]  estudantes;
		private int quant;//vai ser a quantidades de estudantes
		
		public Turma(int quantEstudant){
			estudantes=new Estudante[quantEstudant];
		}
		
        public boolean addEstudante(Estudante est){
        	estudantes[quant]=est;
        	quant++;
        	return true;
        }
        public Estudante getEstudante(int pos){
        	return estudantes[pos];
        }

	    public float getMedia(){
	    	float soma=0;
	    	for(int i=0;i<quant;i++){
	    		soma+=estudantes[i].getMedia();
	    	}
	    	return soma/estudantes.length;
	    }

	
	

}
