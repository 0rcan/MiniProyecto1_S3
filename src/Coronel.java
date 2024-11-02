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

    //Metodos de la interfaz

    @Override
    public void asignarMision(String mision) {
        //El polimorfismo se encarga de añadir la mision a la lista
        misionCoronel.add(mision);
        System.out.println( "Misión asignada: " + mision);
    }

    @Override
    public void reportarEstado() {
        
        String reporte = JOptionPane.showInputDialog(null, "Ingrese el reporte del Coronel ", "Reportar Estado", JOptionPane.QUESTION_MESSAGE);
                
        //El polimorfismo se encarga de añadir el reporte a la lista
        reportarCoronel.add(reporte);
        System.out.println( "Reporte: " + reporte);
       
    }
    //Crear soldado
    @Override
    public void crearSoldado() {

        //Datos que se compararan con la lista 
        rango = "4";

        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del coronel: ", "Crear Coronel ", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null,"Ingrese el ID del coronel: ", "Crear Coronel ", JOptionPane.QUESTION_MESSAGE);
        nivel = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nivel del coronel: ", "Crear Coronel ", JOptionPane.QUESTION_MESSAGE)); 
        estrategia = JOptionPane.showInputDialog(null,"Ingrese la estrategia del coronel: ", "Crear Coronel ", JOptionPane.QUESTION_MESSAGE); 
        
        String mision = JOptionPane.showInputDialog(null, "Asigne una misíon al Coronel: ", "Asignar Misión", JOptionPane.QUESTION_MESSAGE);
        
        //Asignamos una mision al soldado
        asignarMision(mision); //Se asigna la mision al soldado
        
        //Reportamos el estado del soldado
        reportarEstado();
        realizarAccion();

        Coronel nuevoCoronel = new Coronel(estrategia, nivel,nombre, id,rango);
                
                //Verificacion si el ID existe en la lista
                if(!idExisteEnLista(listaCoronel, id)){
                    
                    listaCoronel.add(nuevoCoronel); //Se cumple la condicion se agrega el soldado
                    
                    JOptionPane.showMessageDialog(null, "Soldado creado y agregado", "Crear Coronel ", JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "El ID ya existe", "Crear Coronel ", JOptionPane.ERROR_MESSAGE);
                }
        
    }
    //Mostrar informacion
    @Override
    public void mostrarInformacion() {

        //Variable para verificar si el soldado fue encontrado
        boolean encontrado = false;
        
        //Datos que se compararan con la lista 
        rango = "4";
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del coronel: ","Información Coronel ", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del coronel: ","Información Coronel ", JOptionPane.QUESTION_MESSAGE);
    
        int contador = 0;
        //Siclo para recorrer la lista
        for (Coronel soldado : listaCoronel) {

            System.out.println(listaCoronel.size());
            //Condicion para verificar si el soldado existe comparando con los datos ingresados
            if(nombre.equals(soldado.nombre) && rango.equals(soldado.rango) && id.equals(soldado.id)){
                
                //Si se cumple muestra lo siguiente
                JOptionPane.showMessageDialog(null, 
                "Nombre: " + soldado.nombre + "\n" +
                "ID: " + soldado.id + "\n" +
                "Rango: " + soldado.rango + "\n" +
                "Nivel: " + soldado.nivel  + "\n" +
                "Estrategia del coronel: " + soldado.estrategia + "\n", "Información Coronel ", JOptionPane.INFORMATION_MESSAGE);
                
                //Cuando el contador este igualado al indice se imprime en pantalla
                JOptionPane.showMessageDialog(null, "Misión: " + misionCoronel.get(contador), "Información Coronel ", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Reporte: " + reportarCoronel.get(contador), "Información Coronel ", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Acción: " + accionCoronel.get(contador), "Información Coronel ", JOptionPane.INFORMATION_MESSAGE);
                
                //asignarMision(mision);

                System.out.println("x");

                //Si el soldado fue encontrado la varieable se actualiza
                encontrado = true;
                break;
            }else{
                contador++;//incrementamos el contador para que este en el mismo indice que el soldado
            }
        }
        
        
        //Si el soldado no fue encontrado se muestra este mensaje
        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "No se encontró el Coronel ", "Información Coronel ", JOptionPane.ERROR_MESSAGE);
        }
    }
    //Modificar soldado
    






}
