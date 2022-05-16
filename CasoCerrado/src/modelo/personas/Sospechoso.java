package modelo.personas;
import modelo.Direccion;

public class Sospechoso extends Persona {
    
    private String alias,caracteristicas;
    private Direccion direccion;
    private byte edad;
    
    public Sospechoso(){
        this.alias = "";
        this.direccion = new Direccion();
        this.edad = 0;
        this.caracteristicas = "";
    }
    
    public void setAlias(String alias){this.alias = alias;}
    public void setDireccion(Direccion direccion){this.direccion = direccion;}
    public void setEdad(byte edad){this.edad = edad;}
    public void setCart(String caracteristicas){this.caracteristicas = caracteristicas;}
    public String getAlias(){return this.alias;}
    public Direccion getDireccion(){return this.direccion;}
    public byte getEdad(){return this.edad;}
    public String getCart(){return this.caracteristicas;}    
}
