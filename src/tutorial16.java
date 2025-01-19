public class tutorial16 {
    public static void main(String[] args) {


        String[][] classi = new String[3][3];
        //a sinistra indicano le coordinate di x perciò le righe in una tabella
        // a destra indicano le coordinate di y perciç le colonne di una tabella

        classi[0][0] = "Luca";
        classi[0][1] = "Anna";
        classi[0][2] = "Marco";

        classi[1][0] = "Edoardo";
        classi[1][1] = "Leonardo";
        classi[1][2] = "Antonio";

        classi[2][0] = "Arianna";
        classi[2][1] = "Paolo";
        classi[2][2] = "Andrea";

//        é possibile anche inserirli all'interno delle {}, {}, {} invece che aggiungerli dopo

        System.out.println(classi.length);

        for (String[] coordinateX : classi) {
            System.out.println();
            for (String studente : coordinateX) System.out.println(studente + " ");
        }

    }
}
