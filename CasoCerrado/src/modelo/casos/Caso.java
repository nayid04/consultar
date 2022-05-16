package modelo.casos;

import modelo.personas.Detective;
import modelo.personas.Sospechoso;

public class Caso {
    
    private int NoCaso;
    private String descripcion,prioridad,NomClave;
    private Detective detective;
    private Sospechoso sospechoso[];
    
    public Caso(){
        NoCaso = 0;
        descripcion = "";
        prioridad = "";
        NomClave = "";
        
        detective = new Detective();
        sospechoso = new Sospechoso[15];
    }
    
    public void setNoCaso(int NoCaso){this.NoCaso = NoCaso;}
    public void setDescripcion(String descripcion){this.descripcion = descripcion;}
    public void setPrioridad(String prioridad){this.prioridad = prioridad;}
    public void setNomClave(String NomClave){this.NomClave = NomClave;}
    public void setDetective(Detective detective){this.detective = detective;}
    
    public void setSospechosos(byte cantidad){
        
    }
}