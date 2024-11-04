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
    
    // METODO//
    

    // Metodo para verificar si el ID ya existe en la lista
    public static boolean idExisteEnLista(List<Capitan> lista, String id) {
        
        //Recorre la lista<Capitan> verificando si el id ya existe
        for (Capitan soldado : lista) {
            if (soldado.id.equals(id)) {
                return true;
            }
        }
        return false;
    
        }

    
    //METODO/ABSTRACTO//
    
    public void realizarAccion(){
    
        String accion = JOptionPane.showInputDialog(null, "Ingrese la accion del capitan: ", "Acción capitan", JOptionPane.QUESTION_MESSAGE);
        
        accionCapitan.add(accion);
        System.out.println( "Acción: " + accion);
    }



}
