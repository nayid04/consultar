package punto_4;

import java.util.Scanner;

public class punto_4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int cantidad, horas_extras=0;
        
        System.out.print("¿cuantos empleados va a registrar?: ");
        cantidad = entrada.nextInt();
        
        String nombres_empleados[] = new String[cantidad];
        int horas_semanales[] = new int[cantidad];
        double tarifa[] = new double[cantidad];
        double sueldo_bruto[] = new double[cantidad];
        
        for(int i=0;i<cantidad;i++){
            System.out.println("\n--- Datos del empleado ---");
            System.out.print("ingrese el nombre del empleado: ");
            nombres_empleados[i] = entrada.next();
            System.out.print("ingrese el numero de horas trabajadas en la semana: ");
            horas_semanales[i] = entrada.nextInt();
            System.out.print("ingrese la tarifa por hora: ");
            tarifa[i] = entrada.nextDouble();
            
            if (horas_semanales[i] > 40){
                horas_extras = horas_semanales[i]-40;
                sueldo_bruto[i] = (tarifa[i]*40)+(horas_extras * (tarifa[i]*1.5));
            }
            else{
                horas_extras = 0;
                sueldo_bruto[i] = (tarifa[i]*horas_semanales[i])+(horas_extras * (tarifa[i]*1.5));
            }
            
            
        }
        
        System.out.println("--- Resultado ----");
        for(int i=0;i<cantidad;i++){
            
            System.out.println("El sueldo bruto semanal de "+ nombres_empleados[i]+" es: "+sueldo_bruto[i]);
        }
        
    }
}
