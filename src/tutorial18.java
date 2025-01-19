public class tutorial18 {
    public static void main (String[] args){
        Boolean vero = true;
        Character carattere = 'a';
        Integer numero = 7;
        Double virgola = 4.52;
        String stringa = "sos";
        //importantissimo perché queste sopra sono le WRAPPED CLASS e sono utili in quanto è
//        possibile usare iu metodi come per le stringhe anche su questi dati, il problema
//        è chje sono più pesanti dei dati primitivi normali e possono provocare rallentamenti ma solo se ci sono TANTI WRAPPED

        boolean a = true;
        char b = 'a';
        int c = 7;
        double d = 4.52;
        if(carattere == b) System.out.println("Ciao");
    }
}
