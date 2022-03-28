package punto_3;


public class Informe {
    double ventas[] = new double[12];
    double promedio;
    double ventaMayor;
    int mesMayorVentas;
    double ventaMenor;
    int mesMenorVentas;
    double acumulado;
    
    
    public Informe(){
        this.promedio=0;
        this.ventaMayor=0;
        this.ventaMenor=0;
        this.acumulado=0;
        this.mesMayorVentas=0;
        this.mesMenorVentas=0;
    }
    
    //-----------------------------
    public double getVentas(int i) {
        return ventas[i];
    }

    public void setVentas(double cantidad, int i) {
        this.ventas[i] = cantidad;
    }
    //-----------------------------
    public double getAcumulado() {
        for(int i=0;i<12;i++){
            this.acumulado+=this.ventas[i];
        }
        return acumulado;
    }
    //-----------------------------
    public double getPromedio() {
        double suma=0;
        for(int i=0;i<12;i++){
            suma += this.ventas[i];
        }
        this.promedio=suma/12;
        return promedio;
    }
    //-----------------------------
    public int getVentaMayor() {
        for(int i=0;i<12;i++){
            if(this.ventas[i]>this.ventaMayor){
                this.ventaMayor=this.ventas[i];
                mesMayorVentas=i+1;
            }
        }
        return mesMayorVentas;
    }
    //-----------------------------
    public int getVentaMenor() {
        this.ventaMenor=this.ventaMayor;
        for(int i=0;i<12;i++){
            if(this.ventas[i]<this.ventaMenor){
                this.ventaMenor=this.ventas[i];
                mesMenorVentas=i+1;
            }
        }
        return mesMenorVentas;
    }
}
