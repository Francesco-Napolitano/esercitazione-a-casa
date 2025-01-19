public class tutorial13 {
    public static void main (String[] args){
        System.out.println("ciao");
        int i = 0;
        while (i < 0){
            System.out.println("While " + i);
            i++;
        }

        do {
            System.out.println("doWhile " + i);
            i++;
        }while (i<0);
    }
}
