package punto_1;

public class Coche {

    String color;
    String marca;
    int modelo;
    int numero_caballos;
    int numero_puertas;
    String matricula;

    public Coche() {
        this.color="";
        this.marca="";
        this.modelo=0;
        this.numero_caballos=0;
        this.numero_puertas=0;
        this.matricula="";
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //-----------------------------
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    //-----------------------------
    public int getModelo(){
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    //------------------------------
    public int getNumero_caballos(){
        return numero_caballos;
    }
    public void setNumero_caballos(int numero_caballos) {
        this.numero_caballos = numero_caballos;
    }
    //------------------------------
    public int getNumero_puertas(){
        return numero_puertas;
    }
    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }
    //-------------------------------
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    

}
