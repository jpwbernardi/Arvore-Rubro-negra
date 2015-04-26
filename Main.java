class Main{

    public static void main(String args[]){
        Arvore a = new Arvore(11);
        a.add(2);
        a.add(14);
        a.add(15);
        a.add(1);
        a.add(7);
        a.add(8);
        a.add(5);
        a.add(4);

        a.delete(a.encontra(5));

        a.raiz.print();

        //System.out.println("\n\n[" + raiz.onde(15).info + "][" + raiz.onde(29) + "][" + raiz.onde(10).info + "]");

        //raiz.printOrdenado();

        //System.out.println("\n\n" + raiz.nivel() + " " + raiz.d.nivel() + " " + raiz.d.d.nivel() + " " + raiz.d.d.e.nivel() + "\n\n" + raiz.altura());

    }

}
