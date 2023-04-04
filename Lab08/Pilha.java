package parteA;

public class Pilha {
	public String[] Array;
	int QuantMaxima;
	int PosicaoTopo = 0; //topo da pilha
	
	public Pilha() {
		QuantMaxima = 6;
		Array = new String[6];

	}
	public Pilha(int tam) {
		QuantMaxima = tam;
		Array = new String[QuantMaxima];
		
	}
	
	public void Empilhar(String s) {
		if(PosicaoTopo >= Array.length) {
		 System.out.println("Nao e possivel inserir");
		}
		 Array[PosicaoTopo++] = s;
	}
	
	public String Desempilhar() {
		if(QuantMaxima <= 0) {
		 System.out.println("Nao e possivel remover");
		}
		 
		 String string = Array[--PosicaoTopo];
		 Array[PosicaoTopo] = null;
		 
		 return string;
	}
	
	public void MotrarUm() {
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Posição = " + i + " Elemento: " + Array[i]);
        }
	}
	
	public void MostrarDois() {
	    for (int i = PosicaoTopo - 1; i >= 0; i--) {
	        System.out.println("Posição = " + i + " Elemento: " + Array[i]);
	    }
	}

}


