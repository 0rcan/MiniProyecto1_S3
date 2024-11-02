import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Capitan extends implements OperacionesMilitares{ //clase hija de Rango e implementa la interfaz OperacionesMilitares

    //ATRIBUTOS//
    
    int cantidadSoldadosBajoSuMando;
    static ArrayList<Capitan> listaCapitanes = new ArrayList<>();
    static list<String> accionCapitan = new ArrayList<>();
    static List<String> misionCapitan = new ArrayList<>();
    static List<String> reportarCapitan = new Arraylist<>();

    //CONSTRUCTOR//

    public Capitan(int cantidadSoldadosBajoSuMando, int nivel, String nombre, String id, String rango) { //constructor 
        super(nivel, nombre, id, rango); 
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
    }

    public Capitan(){ //constructor vacio necesario para crear objetos de la clase
        
    }



}
