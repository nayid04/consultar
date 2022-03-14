package punto_04;

import javax.swing.JOptionPane;

public class punto_04 {
    public static void main(String[] args){
        int dias;
        float km_rec, lt_gasolina, total, estacionamiento, peajes;
        
        dias = Integer.parseInt(JOptionPane.showInputDialog("¿cuantos dias va a durar el viaje?"));
        km_rec = Float.parseFloat(JOptionPane.showInputDialog("¿total kilometros por dia?"));
        lt_gasolina = Float.parseFloat(JOptionPane.showInputDialog("¿costo por litro de gasolina?"));
        estacionamiento = Float.parseFloat(JOptionPane.showInputDialog("¿costo del estacionamiento por dia?"));
        peajes = Float.parseFloat(JOptionPane.showInputDialog("¿pago de peajes por dia?"));
        
        total = dias * ((lt_gasolina/km_rec)+estacionamiento+peajes);
        
        JOptionPane.showMessageDialog(null,"el costo total del viaje fue: "+total);
        
    }
}
