import java.util.ArrayList;
import java.util.List;

public interface OperacionesMilitares {
     //Interfaces con las acciones del menu
     static ArrayList<SoldadoRaso> listaSoldadoRaso = new ArrayList<>();
     static List<String> accionSoldadoRaso = new ArrayList<>();
     static List<String> misionSoldadoRaso = new ArrayList<>();
     static List<String> reportarSoldadoRaso = new ArrayList<>();
     
     static ArrayList<SoldadoRaso> listaTeniente = new ArrayList<>();
     static List<String> accionTeniente = new ArrayList<>();
     static List<String> misionTeniente = new ArrayList<>();
     static List<String> reportarTeniente = new ArrayList<>();

     static ArrayList<Coronel> listaCoronel = new ArrayList<>();
     static List<String> accionCoronel = new ArrayList<>();
     static List<String> misionCoronel = new ArrayList<>();
     static List<String> reportarCoronel = new ArrayList<>();

     static ArrayList<Coronel> listaCapitan = new ArrayList<>();
     static List<String> accionCapitan = new ArrayList<>();
     static List<String> misionCapitan = new ArrayList<>();
     static List<String> reportarCapitan = new ArrayList<>();




     public void crearSoldado();
     public void mostrarInformacion();
     public void modificarSoldado();

     public void asignarMision(String mision);
     public void reportarEstado();
}
