import java.util.*;

class Main{
	
    public static void main(String args[]){
		Random gerador = new Random();
        long inicio, aux, media = 0, total;
        
        Arvore a = new Arvore(gerador.nextInt(2147483647));
        
        inicio = System.nanoTime();
        
        for(int i = 0; i < 200_000; i++){
			aux = System.nanoTime();
			a.add(gerador.nextInt(2147483647));
			media += System.nanoTime() - aux;
		}
        
        //(a.busca50(10)).raiz.print();
        //a.raiz.print();
        
        media /= 200_000;
		System.out.printf("Média de tempo de inserção: %.10f\n", media/ 10e9);
		
		media = 0;
		
		for(int i = 0; i < 10_000; i++){
			aux = System.nanoTime();
			a.encontra(gerador.nextInt(2147483647));
			media += System.nanoTime() - aux;
		}
        
       // (a.busca50(10)).raiz.print();
        //a.raiz.print();
        
        total = System.nanoTime() - inicio;
        media /= 200_000;
		System.out.printf("Média de tempo de busca: %.10f\n", media/ 10e9);
		
		System.out.printf("Tempo total: %.10f\n", total / 10e9);
        
        //System.out.println("\n\n[" + raiz.onde(15).info + "][" + raiz.onde(29) + "][" + raiz.onde(10).info + "]");

        //raiz.printOrdenado();

        //System.out.println("\n\n" + raiz.nivel() + " " + raiz.d.nivel() + " " + raiz.d.d.nivel() + " " + raiz.d.d.e.nivel() + "\n\n" + raiz.altura());

    }

}
