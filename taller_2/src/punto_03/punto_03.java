package punto_03;


public class punto_03 {
    public static void main(String[] args){
        float costo, iva, util, precio_final;
        String producto;
        
        producto = "nevera";
        costo = 450000.00f;
        iva = 19;
        util = 40;
        
        precio_final = ((costo*iva)/100)+((costo*util)/100)+ costo;
         
        System.out.println("el precio final del producto "+producto+" es: "+precio_final);
        
    }
}
