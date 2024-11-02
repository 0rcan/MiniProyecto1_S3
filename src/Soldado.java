import javax.swing.JOptionPane;
public class Soldado{ //Clase Principal Soldado 
    
    /////////////
    //ATRIBUTOS//
    /////////////

    String nombre;
    String id;
    String rango;
    
    ///////////////
    //CONSTRUCTOR//
    ///////////////

    public Soldado(String nombre, String id, String rango) {
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
    }
    
    public Soldado() {
        
    }
}