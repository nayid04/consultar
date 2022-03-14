package punto_02;


public class punto_02 {
    public static void main(String[] args){
        int num1, num2, num3;
        float suma, promedio, producto, cociente, modulo;
        
        num1 = 30;
        num2 = 25;
        num3 = 14;
        
        suma = num1 + num2 + num3;
        promedio = suma / 3;
        producto = num1 * num2 * num3;
        cociente = (num1 / num2) / num3;
        modulo = (num1 % num2) % num3;
        
        System.out.println("la suma de los 3 numeros es: "+suma);
        System.out.println("el promedio de los 3 numero es: "+promedio);
        System.out.println("el producto de los 3 numero es: "+producto);
        System.out.println("el cociente de los 3 numeros es: "+cociente);
        System.out.println("el modulo de los 3 numeros es: "+modulo);
    }    
}
