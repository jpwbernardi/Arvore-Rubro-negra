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
        System.out.println(this + ": " + this.esq + " <- (" + this.info + "  +  " + this.cor + ") -> " + this.dir + "  ~~~  Cor: " + this.cor);
        if (this.esq != null) this.esq.print();
        if (this.dir != null) this.dir.print();
    }

}
