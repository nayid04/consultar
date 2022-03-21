package punto_5;

public class punto_5 {

    public static void main(String[] args) {
        String titulos[] = {"Comuna", "Candidato A", "Candidato B", "Candidato C", "Candidato D"};

        int votos[][] = {{1, 2, 3, 4, 5}, {194, 180, 221, 432, 820}, {48, 20, 90, 50, 61}, {206, 320, 140, 821, 946}, {45, 16, 20, 14, 18}};
        int total_votos[] = new int[5];
        String mas_votado = "", ganador = "";
        int cont = 0, mayor_votado = 0,num_comuna=0;
        double porcentaje, votos_emitidos = 0, mayor_porcentaje = 0;
        int total_comuna[] = new int[5];
        double mayor_comuna=0, porcentaje_comuna;

        for (int i = 0; i <= titulos.length - 1; i++) {
            System.out.print(titulos[i] + "\t");/*mostrar titulo en la pantalla*/
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int m = 0; m < 5; m++) {
                System.out.print(votos[m][i] + "\t      ");/*para mostrar los numeros de los votos en pantalla*/
            }
            System.out.println("");
        }

        System.out.println("\n---- votos totales ----");

        for (int i = 1; i < 5; i++) {
            for (int m = 0; m < 5; m++) {
                total_votos[cont] += votos[i][m];/*acumulador par tener la cantidad total de votos por candidato*/
            }
            votos_emitidos += total_votos[cont];/*acumulador par tener la cantidad total de votos en general*/
            cont++;
        }
        cont = 0;
        
        /*-------- Calcular la comuna con mayor porcentaje de votos*/
        
        for (int i = 0; i < 5; i++) {
            for (int m = 1; m < 5; m++) {
                total_comuna[cont] += votos[m][i];/*acumulador par tener la cantidad total de votos por candidato*/
            }
            porcentaje_comuna = (total_comuna[cont] * 100) / votos_emitidos;
            if (porcentaje_comuna > mayor_comuna) {/*para calcular el cantidado con mayor porcentaje de votos*/
                mayor_comuna = porcentaje_comuna;
                num_comuna = i+1;
            }
            cont++;
        }
        cont = 0;
        
        
        for (int j = 1; j < 5; j++) {

            porcentaje = (total_votos[cont] * 100) / votos_emitidos;/*para calcular el porcentaje de votos*/
            System.out.printf("El " + titulos[j] + " tiene " + total_votos[cont] + " votos en total con un porcentaje del %.2f \n", porcentaje);
            
            if (total_votos[cont] > mayor_votado) {/*para calcular el cantidado con más votos y su cantidad de votos*/
                mayor_votado = total_votos[cont];
                mas_votado = titulos[j];
            }
            
            if (porcentaje > mayor_porcentaje) {/*para calcular el cantidado con mayor porcentaje de votos*/
                mayor_porcentaje = porcentaje;
                ganador = titulos[j];
            }
            cont++;
        }
        System.out.println("------ Conclusiones ------");
        System.out.println("El " + mas_votado + " con " + mayor_votado + " votos fue el que obtuvo más votos");
        System.out.printf("El " + ganador + " ha sido el ganador ya que tiene el %.2f porciento de los votos\n", mayor_porcentaje);
        System.out.printf("La comuna "+num_comuna+" con %.2f porciento de votos es la que tiene mayor porcentaje de votos\n",mayor_comuna);

    }
}
