import java.util.*;

class Main{
	
	public static final int MAX = 200_000;
	public static final int MAX_BUSCA = 10_000;
	public static final int MOD = 2_147_483_647;
	
    public static void main(String args[]){
		Random gerador = new Random();
        long inicio, aux, media = 0, total;
        
        Arvore a = new Arvore();
        
        inicio = System.nanoTime();
        
        for(int i = 0; i < MAX; i++){
			aux = System.nanoTime();
			a.add(gerador.nextInt(MOD));
			//a.add(i);
			media += System.nanoTime() - aux;
		}
        
        media /= MAX;
		System.out.printf("Média de tempo de inserção: %.10f\n", media/ 10e9);
		
		media = 0;
		
		/*for(int i = 0; i < MAX_BUSCA; i++){
			aux = System.nanoTime();
			a.encontra(gerador.nextInt(MOD));
			media += System.nanoTime() - aux;
		}*/
		
        total = System.nanoTime() - inicio;
        media /= MAX_BUSCA;
		System.out.printf("Média de tempo de busca: %.10f\n", media/ 10e9);
		System.out.printf("Tempo total: %.10f\n", total / 10e9);
		
		//a.graph();
		
		/*for(int i = 0; i < MAX; i++){
			a.delete(a.encontra(i));
		}
		a.graph();*/

    }

}
