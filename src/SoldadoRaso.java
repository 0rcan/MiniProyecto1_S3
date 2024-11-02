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
        //Datos que se compararan con la lista 
        rango = "1";

        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado: ", "Crear Soldado", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null,"Ingrese el ID del soldado: ", "Crear Soldado", JOptionPane.QUESTION_MESSAGE);
        nivel = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nivel del soldado: ", "Crear Soldado", JOptionPane.QUESTION_MESSAGE)); 
        
        
    }

    //////////////////////
    //MOSTRARINFORMACION//
    //////////////////////

    @Override
    public void mostrarInformacion() {
        
        //Datos que se compararan con la lista 
        rango = "1";
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado:","Información Soldado", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del soldado:","Información Soldado", JOptionPane.QUESTION_MESSAGE);
    
    
    }

    ////////////////////
    //MODIFICARSOLDADO//
    ////////////////////

    @Override
    public void modificarSoldado() {
        System.out.println("e");
        //Datos que se compararan con la lista 
        rango = "1";
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado:","Modificar Soldado", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del soldado:", "Modificar Soldado", JOptionPane.QUESTION_MESSAGE);
        
        
    }

}
