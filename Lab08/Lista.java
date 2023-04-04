package parteA;

public class Lista {
    private String[] Array;
    private int QuantMaxima;
    private int InicioLista = 0;
    
    public Lista() {
    	QuantMaxima = 5;
    	Array = new String[QuantMaxima];
    	
    }
    
    public Lista(int tamMaximo) {
    	QuantMaxima = tamMaximo;
    	Array = new String[tamMaximo];
    	
    }
    
    public void InserirInicio(String s) {
    	if(InicioLista >= Array.length) {
    		System.out.println("Nao e posivel inserir");
    	}
    	
    	for(int i = InicioLista; i> 0; i--) {
    		Array[i] = Array[i - 1];
    	}
    	
    	Array[0] = s;
    	InicioLista++;
    }
    
    public void InserirFim(String s) {
    	if(InicioLista >= Array.length)
    		System.out.println("Nao e posivel inserir");

    	Array[InicioLista] = s;
    	InicioLista++;
    }
    
    public void InserirPosicao(String s, int pos) {
    	if (InicioLista >= Array.length || pos < 0 || pos > InicioLista)
    		System.out.println("Nao e posivel inserir");
    	for (int i = InicioLista; i > pos; i--){
    		Array[i] = Array[i-1];
    	}
    	
    	Array[pos] = s;
    	InicioLista++;
    }
    
    public String RemoverInicio() {
    	if(InicioLista == 0) {
    		System.out.println("Nao e posivel remover");
    	}
    	
    	String resp = Array[0];
    	InicioLista--;
    	
    	for(int i = 0; i<InicioLista; i++) {
    		Array[i] = Array[i+1];
    	}
    	
    	return resp;
    }
    
    public String RemoverFim() {
    	if(InicioLista == 0) {
    		System.out.println("Nao e posivel remover");
    	}
    	
    	return Array[--InicioLista];
    }
    
    
    public String RemoverPosicao(int pos) {
    	if(InicioLista == 0 || pos < 0 || pos >= InicioLista) {
    		System.out.println("Nao e posivel remover");	
    	}
    	
    	String resp = Array[pos];
    	InicioLista--;
    	
    	for(int i = pos; i< InicioLista; i++) {
    		Array[i] = Array[i+1];
    	}
    	
    	return resp;
    	}
    
    public void Mostrar() {
    	for(int i = 0; i<Array.length; i++) {
            System.out.println("Posição = " + i + " Elemento: " + Array[i]);
    	}
    }
}


