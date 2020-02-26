public class Racine {

    public static int[] calculer(int a,int b){
        int j = b-a+1;
        int[] lst = new int[j];

        for (int i = 0; i < j; i++) {

            lst[i]= (a+i)*(a+i);

        }
    return lst;
    }

    public static void main(String[] args) {
        int[] tab = calculer(2,4);
        for (int i = 0; i <= tab.length-1; i++) {
            System.out.println(tab[i]);
        }
        System.out.println();


    }
}
