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

    public void add(int k){
        Nodo aux = this.busca(k);
        if(k > aux.info) this.addFix(aux.dir = new Nodo(k, aux));
        else if(k < aux.info) this.addFix(aux.esq = new Nodo(k, aux));
    }

    public void print() {
        System.out.println(this + ": " + this.esq + " <- (" + this.info + "  +  " + this.cor + ") -> " + this.dir);
        if (this.esq != null) this.esq.print();
        if (this.dir != null) this.dir.print();
    }

    public void addFix(Nodo k){
        Nodo tio;
        if(k->pai == null){
            k->cor = false;
            return;
        }else if(k->pai->cor == false){
            return; //Se o pai é preto, a arvore continua valida
        }else{
            if(k->pai->pai != null){
                if(k->pai->pai->esq == k->pai) tio = k->pai->pai->dir;
                else tio = k->pai->pai->esq;
            }
            //Se chegou aqui, pai é vermelho
            if(tio != null && tio->cor == true){ //Se o tio também for vermelho...
                tio->cor = k->pai->cor = false; //Tio e pai viram pretos
                k->pai->pai->cor = true; //Avo recebe vermelho
                addFix(k->pai->pai); //Verifica se a mudança no avô não alterou nenhuma propriedade
            }
        }


    }
}
