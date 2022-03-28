package punto_4;


public class Habitacion {
    double largo;
    double ancho;
    double altura;
    
    public Habitacion(){
        this.largo=0;
        this.ancho=0;
        this.altura=0;
    }
    
    //-----------------------------
    public double getLargo() {
        return largo;
    }

    public void setLargo(double metros) {
        this.largo = metros;
    }
    //-----------------------------
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double metros) {
        this.ancho = metros;
    }
    //-----------------------------
    public double getAltura() {
        return altura;
    }

    public void setAltura(double metros) {
        this.altura = metros;
    }
    //-----------------------------
    public double getEnchape() {
        double metrosCuadrados=this.largo*this.ancho;
        double total_enchape=((metrosCuadrados*15)/100)+metrosCuadrados;
        return total_enchape;
    }
    //-----------------------------
    public double getTapiz(String decision) {
        double tapiz = this.ancho*this.altura;
        double TotalTapiz;
        
        if(decision.equals("L")){
            TotalTapiz = tapiz/4.2;
        }else{
            TotalTapiz = tapiz/4.6;
        }
        return TotalTapiz;
    }
    
    
}
