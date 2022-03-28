package punto_4;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PruebaHabitacion {

    public static void main(String[] args) {
        Habitacion cuarto = new Habitacion();
        JTextArea salida = new JTextArea();
        double largo;
        double ancho;
        double altura;
        String decision;
        
        
        largo = Double.parseDouble(JOptionPane.showInputDialog("digite el largo de la habitacion en metros: "));
        ancho = Double.parseDouble(JOptionPane.showInputDialog("digite el ancho de la habitacion en metros: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("digite la altura de la habitacion en metros: "));
        
        
        cuarto.setLargo(largo);
        cuarto.setAncho(ancho);
        cuarto.setAltura(altura);
        
        decision = JOptionPane.showInputDialog("¿Tapizado liso o con diseño? [L/d]: ");
        
        
        salida.append("-------Datos------\n");
        salida.append("Largo: "+cuarto.getLargo()+" m\n");
        salida.append("Ancho: "+cuarto.getAncho()+" m\n");
        salida.append("Altura: "+cuarto.getAltura()+" m\n\n");
        salida.append("se requieren "+cuarto.getEnchape()+" m2 de enchape para el piso.\n");
        salida.append("se requieren "+Math.round(cuarto.getTapiz(decision.toUpperCase()))+" m2 de tapiz para la pared.\n");
        
        JOptionPane.showMessageDialog(null, salida);
    }
}
