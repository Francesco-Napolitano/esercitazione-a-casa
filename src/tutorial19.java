import java.util.ArrayList;

public class tutorial19 {
    public static void main(String[] args) {
//        ArrayList<String> persone = new ArrayList<>();
//        persone.add("Luca");
//        persone.add("Marco");
//        persone.add("Anna");
//
//        persone.set(2,"Paola");
//        persone.removeFirst();
//        persone.clear();
//        for (String s : persone) System.out.println(s);

//        seconda parte
//        ArrayList <Integer> persone = new ArrayList<>();
//        persone.add(1);
//        persone.add(10);
//        persone.add(100);
//        persone.clear(); questa funzione cancella tutto all'interno dell'array list
//       for (Integer s : persone) System.out.println(s);

       ArrayList<ArrayList<String>> classi = new ArrayList<>();

       ArrayList <String> classe1 = new ArrayList<>();
       classe1.add("Luca");
       classe1.add("Francesco");

       ArrayList <String> classe2 = new ArrayList<>();
       classe2.add("Ignazio");
       classe2.add("Cruciani");

       classi.add(classe1);
       classi.add(classe2);
        for (ArrayList<String> strings : classi) {
            System.out.println();
            for (String string : strings) System.out.println(string + " ");
        }

    }
}
