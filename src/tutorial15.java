public class tutorial15 {
    public static void main (String[] args){
//        int [] votiStoria = new int[3];
//        votiStoria[0] = 7;
//        votiStoria[1] = 6;
//        votiStoria[2] = 7;
        int[] numeric = new int[2];
        numeric[0] = 20;
        numeric[1]= 19;
        System.out.println(numeric[1] + " esempio");

        int[] numeriSecondaParte = {5,9,3,2};

        System.out.println(numeriSecondaParte[numeriSecondaParte.length-1]);
        for (int numeri : numeriSecondaParte)
            System.out.println(numeri);
    }
}
