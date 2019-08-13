

public class OperacoesComString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] lista = {5,2,8778,34,2,564,57656,88,989,678,564,2,1,34,4,5,5};
	    int esq;
	    for (int i = 0; i<lista.length; i++) {
	      for (int j = 0; j<lista.length-1; j++) {
	        if (lista[j] > lista[j+1]) {
	            esq = lista[j];
	            lista[j] = lista[j+1];
	            lista[j+1] = esq;
	        }
	      }
	    }
	    for (int valor : lista) {
	      System.out.println(valor);  
	    }
	    
	  
		
		
		/*
		String letras = "abcde ABCDe efgh EFGH ";
		
		String lMinusculas = letras.toLowerCase();
		String lMaiusculas = letras.toUpperCase();
		String lPartes = letras.substring(1);
		String lPartes2 = letras.substring(1,2);
		String lTroca = letras.replace('e', 'S');
		String lTroca2 = letras.replace("abcd", "DRUIBA");
		int lIndice = letras.indexOf("abcdfgdfg");
		int lIndice2 = letras.lastIndexOf("e");
		String [] lVetor = letras.split(" ");
		
		System.out.println(lMinusculas + lMaiusculas);
		System.out.println(letras.trim());
		System.out.println(lPartes);
		System.out.println(lPartes2);
		System.out.println(lTroca);
		System.out.println(lTroca2);
		System.out.println(lIndice);
		System.out.println(lIndice2);
		
		for (String palavra : lVetor) {
			System.out.println(palavra);
		}
		*/
		
	}

}
