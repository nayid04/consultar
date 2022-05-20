package modelo.casos;

import modelo.Bitacora;
import modelo.personas.Detective;
import modelo.personas.Sospechoso;

public class Caso {
    
    private int NoCaso;
    private String descripcion,prioridad,NomClave;
    private Detective detective;
    private Sospechoso sospechoso[];
    private Bitacora bitacora;
    
    public Caso(){
        this.NoCaso = 0;
        this.descripcion = "";
        this.prioridad = "";
        this.NomClave = "";
        
        detective = new Detective();
        sospechoso = new Sospechoso[15];
    }
    
    public void setNoCaso(int NoCaso){this.NoCaso = NoCaso;}
    public void setDescripcion(String descripcion){this.descripcion = descripcion;}
    public void setPrioridad(String prioridad){this.prioridad = prioridad;}
    public void setNomClave(String NomClave){this.NomClave = NomClave;}
    public void setDetective(Detective detective){this.detective = detective;}
    public void setSospechoso(int num,Sospechoso sospechoso){this.sospechoso[num] = sospechoso;}
    
    public int getNoCaso(){return this.NoCaso;}
    public String getDescripcion(){return this.descripcion;}
    public String getPrioridad(){return this.prioridad;}
    public String getNomClave(){return this.NomClave;}
    public Detective getDetective(){return this.detective;}
    public Sospechoso getSospechoso(int num){return this.sospechoso[num];}
    public Bitacora getBitacora(){return this.bitacora;}
    
    
}