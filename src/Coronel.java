import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Coronel extends Rango implements OperacionesMilitares{
    //Clase coronel que hereda de Rango e implemebta la interfaz OperacionesMilitares

    String estrategia;
    static ArrayList<Coronel> listaCoronel= new ArrayList<>();
    static List<String> accionCoronel=new ArrayList<>();
    static List<String> misionCoronel=new ArrayList<>();
    static List<String> reportarCoronel=new ArrayList<>();

    public  Coronel (String estrategia, int nivel, String nombre, String id, String Rango){
        super(nivel, nombre,id,rango);
        this.estrategia=estrategia;
    }
    public Coronel(){//Constructor vacio necesario para crear onjetos de la clase

    }
    //Metodo

    //Metodo para verificar si el ID ya existe en la lista
    public static boolean idExisteEnLista(List<Coronel> lista, String id){

        //Recorre la lista <Coronel> verificando si el id ya existe
        for (Coronel soldado : lista){
            if (soldado.id.equals(id)){
                return true;
            }
        }
        return false;
    }
    
    //Metodo abstracto
     public void realizarAccion(){
    
        String accion = JOptionPane.showInputDialog(null, "Ingrese la accion del Coronel ", "Acción Coronel ", JOptionPane.QUESTION_MESSAGE);
                
        accionCoronel.add(accion);
        System.out.println( "Acción: " + accion);
    }

}
