import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Matrice {
    public static int[][] calculer(int m, int n, int a, int b){
        int [][] tab = new int[m][n]; // Création de la matrice
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //pour chaque case du tableau, un nouveau random
                tab[i][j] = ThreadLocalRandom.current().nextInt(a, b + 1);
            }
        }
        return tab;
    }

    public static void main(String[] args) {
        int [][]result = calculer(4,4,0,1);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(result[i][j]);
            }
        }
    }

}
