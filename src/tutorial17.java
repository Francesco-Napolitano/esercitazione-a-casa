public class tutorial17 {
    public static void main (String[] args){
        String nome = "  Leonardo  ";
        boolean risultato = nome.equalsIgnoreCase("Leonardo");
        System.out.println(risultato);
        char combinatorial = nome.charAt(0);
        System.out.println(combinatorial);
        int indexR = nome.indexOf("a");
        System.out.println(indexR);
        boolean prova = nome.isEmpty();
        System.out.println(prova);
        String cancellaSpazi = nome.trim();
        System.out.println(cancellaSpazi);
        String sostituzione = nome.trim().replace('o','w');
        System.out.println(sostituzione);
    }
}
