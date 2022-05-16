
package modelo.personas;
import modelo.Direccion;

public class Detective extends Persona {
    
    private byte experiencia;
    private String capacitado;
    
    public Detective(){
        this.experiencia = 0;
        this.capacitado = "";
    }
    
    public void setExp(byte experiencia){this.experiencia = experiencia;}
    public void setCap(String capacitado){this.capacitado = capacitado;}
    public byte getExp(){return this.experiencia;}
    public String getCap(){return this.capacitado;}
}
