package modelo.casos;

import modelo.personas.Detective;

public class Homicidio extends Caso{
    private Detective detective2;
    
    public Homicidio(){this.detective2 = new Detective();}
    public void setDetective2(Detective detective2){this.detective2 = detective2;}
    public Detective getDetective2(){return this.detective2;}
    
}

