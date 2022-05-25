package modelo.casos;

public class CiberCrimen extends Caso{
    private String tipo;
    
    public CiberCrimen(){this.tipo = "";}
    public void setTipo(String tipo){this.tipo = tipo;}
    public String getTipo(){return this.tipo;}
}
