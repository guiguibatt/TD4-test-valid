public class Triangle {
    public static int calculer(int a, int b, int c) {
        if (a <=0 || b<=0 || c<= 0) return 4;
        if ( a == b && b == c) return 1;
        if (a == c || b ==c) return 2;
        else return 3;
    }
}
