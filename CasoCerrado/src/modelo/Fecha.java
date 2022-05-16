package modelo;

public class Fecha {
    private byte dia,mes;
    private int año;
    
    public Fecha(){
        this.dia = 0;
        this.mes = 0;
        this.año = 0;
    }
    
    public void setDia(byte dia){this.dia = dia;}
    public void setMes(byte mes){this.mes = mes;}
    public void setAño(int año){this.año = año;}
    public byte getDia(){return dia;}
    public byte getMes(){return mes;}
    public int getAño(){return año;}
}
