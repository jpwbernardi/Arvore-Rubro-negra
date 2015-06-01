class Nodo{
    int info;
    Nodo pai;
    Nodo esq, dir;
    boolean cor; //True = vermelho

    public Nodo(int k){
        info = k;
        cor = false;
        esq = dir = pai = null;
    }

    public Nodo(int k, Nodo p){
        this(k);
        pai = p;
        cor = true;
    }

    public Nodo busca(int k){
        if(k > this.info && this.dir != null) return this.dir.busca(k);
        else if(k < this.info && this.esq != null) return this.esq.busca(k);
        else return this;
    }

    public void print() {
        System.out.println(this + ": " + this.esq + " <- (" + this.info + "  +  " + (this.cor ? "V" : "P") + ") -> " + this.dir);
        if (this.esq != null) this.esq.print();
        if (this.dir != null) this.dir.print();
    }

    public Nodo minimo(){
        if(esq != null) return esq.minimo();
        else return this;
    }
    
    public void caminha(Arvore a, Count i, int chave){
		if(this.esq != null) this.esq.caminha(a, i, chave);
		
		if(this.info > chave && i.i < 50){
			if(a == null) a = new Arvore(this.info);
			else a.add(this.info);
			i.i++;
		}
		
		if(this.dir != null) this.dir.caminha(a, i, chave);
		
	}
	
	public void graph() {
		if (this.cor) { // coloring
			System.out.println("\t" + this.info + " [style = filled, fillcolor = red];");
		} else {
			System.out.println("\t" + this.info + " [style = filled, fillcolor = black, fontcolor = white];");
		}
		if (this.esq != null) {
			System.out.println("\t" + this.info + " -> " + this.esq.info + " [label = \" left\"];");
			this.esq.graph();
		} else {
			System.out.println("\t" + this.info + " -> nil [label = \" left\"];");
		}
		if (this.dir != null) {
			System.out.println("\t" + this.info + " -> " + this.dir.info + " [label = \" right\"];");
			this.dir.graph();
		} else {
			System.out.println("\t" + this.info + " -> nil [label = \" right\"];");
		}
	}

}
