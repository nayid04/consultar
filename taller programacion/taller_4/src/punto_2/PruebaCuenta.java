package punto_2;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PruebaCuenta {

    public static void main(String[] args) {
        Cuenta usuario = new Cuenta();
        JTextArea salida = new JTextArea();
        
        int noCuenta, opcion;
        String nombreCliente;
        double saldo;
        
        
        noCuenta = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de cuenta del cliente: "));
        nombreCliente = JOptionPane.showInputDialog("ingrese el nombre del cliente: ");
        saldo = Double.parseDouble(JOptionPane.showInputDialog("ingrese el saldo del cliente: "));
        
        usuario.setNoCuenta(noCuenta);
        usuario.setNombreCliente(nombreCliente);
        usuario.setSaldo(saldo);
        do{
        salida.append("----Datos----\n");
        salida.append("Numero de cuenta: "+usuario.getNoCuenta()+"\n");
        salida.append("Nombre del cliente: "+usuario.getNombreCleinte()+"\n");
        salida.append("Saldo: "+usuario.getSaldo()+"\n\n");
        salida.append("----Menu----\n 1.Consignar\n 2.Retirar\n 3.Salir\n\nIngrese el numero de la acción que desea realizar: ");
        opcion=Integer.parseInt(JOptionPane.showInputDialog(salida));
        
        if(opcion==1){
            usuario.setConsignar(Double.parseDouble(JOptionPane.showInputDialog("cuanto va a consignar?: ")));
        }
        if(opcion==2){
            usuario.setRetirar(Double.parseDouble(JOptionPane.showInputDialog("cuanto va a retirar?: ")));
        }
        salida.setText("");
        }while(opcion!=3);
    }
}
