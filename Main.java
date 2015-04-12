class Main{

    public static void main(String args[]){
        Nodo raiz = new Nodo(10);
        raiz.add(5);
        raiz.add(10);
        raiz.add(7);
        raiz.add(3);
        raiz.add(15);
        raiz.add(12);
        raiz.add(17);
        raiz.add(16);

        raiz.print();

        //System.out.println("\n\n[" + raiz.onde(15).info + "][" + raiz.onde(29) + "][" + raiz.onde(10).info + "]");

        //raiz.printOrdenado();

        //System.out.println("\n\n" + raiz.nivel() + " " + raiz.d.nivel() + " " + raiz.d.d.nivel() + " " + raiz.d.d.e.nivel() + "\n\n" + raiz.altura());

    }

}
