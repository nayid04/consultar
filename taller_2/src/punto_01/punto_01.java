package punto_01;



public class punto_01 {
    public static void main(String[] args){
        int x=30;
        float d = x/2;
        System.out.printf("x = %d\n", x );
        System.out.printf("El valor de %d + %d es %d\n", x, x, ( x + x ) );
        System.out.printf("El valor de %d / 2 = %.2f\n", x, d );
        System.out.printf("El valor de %d mod 3 = %d\n", x, x%3 );
    }
}
