package punto_3;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PruebaInforme {
    public static void main(String[] args){
        Informe datos = new Informe();
        JTextArea salida = new JTextArea();
        for(int i=0;i<12;i++){
            datos.setVentas(Double.parseDouble(JOptionPane.showInputDialog("ingrese el total de ventas del mes: "+(i+1))), i);
        }
        
        salida.append("------Datos-------\n");
        salida.append("el promedio de ventas del año es: "+datos.getPromedio()+"\n");
        salida.append("el acumulado total de ventas en el año es: "+datos.getAcumulado()+"\n");
        salida.append("el mes - "+datos.getVentaMayor()+" - tuvo mayores ventas.\n");
        salida.append("el mes - "+datos.getVentaMenor()+" - tuvo menores ventas.\n");
        
        JOptionPane.showMessageDialog(null, salida);
    }
}
