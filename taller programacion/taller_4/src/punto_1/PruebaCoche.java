package punto_1;

import javax.swing.JOptionPane;

public class PruebaCoche {

    public static void main(String[] args) {
        Coche coche_1 = new Coche();

        String color;
        String marca;
        int modelo;
        int numero_caballos;
        int numero_puertas;
        String matricula;
        
        color = JOptionPane.showInputDialog("ingrese el color del coche: ");
        marca = JOptionPane.showInputDialog("ingrese la marca del coche: ");
        modelo = Integer.parseInt(JOptionPane.showInputDialog("ingrese el modelo del coche: "));
        numero_caballos = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de caballos del coche: "));
        numero_puertas = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de puertas del coche: "));
        matricula = JOptionPane.showInputDialog("ingrese la matricula del coche: ");
        
        
        coche_1.setColor(color);
        coche_1.setMarca(marca);
        coche_1.setModelo(modelo);
        coche_1.setNumero_caballos(numero_caballos);
        coche_1.setNumero_puertas(numero_puertas);
        coche_1.setMatricula(matricula);
        
        JOptionPane.showMessageDialog(null,"Datos del coche 1\n "
                + "Color: "+coche_1.getColor()+"\nMarca: "+coche_1.getMarca()+
                "\nModelo: "+coche_1.getModelo()+"\nCaballos de fuerza: "+coche_1.getNumero_caballos()+
                "\nCantidad de puertas: "+coche_1.getNumero_puertas()+"\nMatricula: "+coche_1.getMatricula());

        
    }
}
