public class Triangle {
    public static int calculer(int a, int b, int c) {
        if (a <=0 || b<=0 || c<= 0) return 4;
        if ( a == b && b == c) return 2;
        if (a == c || b ==c || a==b) return 1;
        else return 3;
    }
}
