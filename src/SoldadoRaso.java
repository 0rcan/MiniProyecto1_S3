import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SoldadoRaso extends Rango implements OperacionesMilitares {

    /////////////
    //ATRIBUTOS//
    /////////////

    static ArrayList<SoldadoRaso> listaSoldadoRaso = new ArrayList<>();
    static List<String> accionSoldadoRaso = new ArrayList<>();
    static List<String> misionSoldadoRaso = new ArrayList<>();
    static List<String> reportarSoldadoRaso = new ArrayList<>();

    ///////////////
    //CONSTRUCTOR//
    ///////////////

    public SoldadoRaso(int nivel, String nombre, String id, String rango) {
        super(nivel, nombre, id, rango);
        
    }
    
    public SoldadoRaso(){ //constructor vacio necesario para crear objetos de la clase
        
    }

    ////////////////
    //CREARSOLDADO//
    ////////////////

    @Override
    public void crearSoldado() {
        System.out.println("se crea soldado");
    }

}
