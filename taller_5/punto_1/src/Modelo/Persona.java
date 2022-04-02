/*
Desarrolle una clase Persona,
con atributos para sus datos personales, dentro de 
los cuales se debe incluir la fecha de
nacimiento (que es un objeto de la clase 
Fecha con atributos para el día, mes y año),
dirección de domicilio y dirección de trabajo 
(que son objetos de la clase Dirección, con los atributos que usted considere necesarios). En la clase
principal, cree varios objetos personas y muestre sus datos
*/

package Modelo;

public class Persona {
    
    private double fecha;
    private String direccion;
    private String direecion_trabajo;

    public Persona(double fecha, String direccion, String direecion_trabajo) {
        this.fecha = fecha;
        this.direccion = direccion;
        this.direecion_trabajo = direecion_trabajo;
    }

    public double getFecha() {

        return fecha;
    }

    public void setFecha(double fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireecion_trabajo() {
        return direecion_trabajo;
    }

    public void setDireecion_trabajo(String direecion_trabajo) {
        this.direecion_trabajo = direecion_trabajo;
    }
    
    
    
    
}
