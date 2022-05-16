package modelo.personas;

public class Persona {
    
    private String id,nombre1,nombre2,apellido1,apellido2;
    
    public Persona(){
        this.id = "";
        this.nombre1 = "";
        this.nombre2 = "";
        this.apellido1 = "";
        this.apellido2 = "";
    }
 
    public void setNombres(String nombre1,String nombre2){
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }
    public void setApellidos(String apellido1,String apellido2){
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    
    public void setId(String id){this.id = id;}
    public String getId(){return this.id;}
    public String getNombre1(){return this.nombre1;}
    public String getNombre2(){return this.nombre2;}
    public String getApellido1(){return this.apellido1;}
    public String getApellido2(){return this.apellido2;}
}
