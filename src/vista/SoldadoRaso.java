package vista;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import modelo.OperacionesMilitares;

public class SoldadoRaso extends Rango implements OperacionesMilitares {

    /////////////
    //ATRIBUTOS//
    /////////////

    String mision;
    String reporte;
    

    static ArrayList<SoldadoRaso> listaSoldadoRaso = new ArrayList<>();
    static List<String> accionSoldadoRaso = new ArrayList<>();
    // static List<String> misionSoldadoRaso = new ArrayList<>();
    // static List<String> reportarSoldadoRaso = new ArrayList<>();

    ///////////////
    //CONSTRUCTOR//
    ///////////////

    public SoldadoRaso(String nivel, String nombre, String id, String rango,String mision,String reporte) {
        super(nivel, nombre, id, rango);
        this.mision = mision;
        this.reporte = reporte;
        
        
    }
    
    public SoldadoRaso(){ //constructor vacio necesario para crear objetos de la clase
        
    }

    //////////
    //METODO//
    //////////

    public SoldadoRaso(String nombre, String id, String nivel, String accion, String mision) {
        //TODO Auto-generated constructor stub
    }

    //Metodo para verificar si el ID ya existe en la lista
    public static boolean idExisteEnLista(ArrayList<SoldadoRaso> lista, String id) {
        
        //Recorre la lista<SoldadoRaso> verificando si el id ya existe
        for (SoldadoRaso soldado : lista) {
            if (soldado.id.equals(id)) {
                return true;
            }
        }
        return false;
    }

    ////////////////////
    //METODO/ABSTRACTO//
    ////////////////////

    public void realizarAccion() {

        String accion = JOptionPane.showInputDialog(null, "Ingrese la accion del SoldadoRaso ", "Acción SoldadoRaso ",
                JOptionPane.QUESTION_MESSAGE);

        accionSoldadoRaso.add(accion);
        System.out.println("Acción: " + accion);
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
        nivel = JOptionPane.showInputDialog(null,"Ingrese el nivel del soldado: ", "Crear Soldado", JOptionPane.QUESTION_MESSAGE); 
        
        //Asignamos una mision al soldado
        mision = JOptionPane.showInputDialog(null, "Asigne una misíon al soldado Raso: ", "Asignar Misión", JOptionPane.QUESTION_MESSAGE);
        
        //Reportamos el estado del soldado
        reporte = JOptionPane.showInputDialog(null, "Ingrese el reporte del soldado", "Reportar Estado", JOptionPane.QUESTION_MESSAGE);
        
        //Accion del soldado
        //accion = JOptionPane.showInputDialog(null, "Ingrese la accion del soldado", "Acción Soldado", JOptionPane.QUESTION_MESSAGE);
        realizarAccion();
        
        

        SoldadoRaso nuevoSoldadoRaso = new SoldadoRaso(nivel,nombre, id,rango,mision,reporte);
                
                //Verificacion si el ID existe en la lista
                if(!idExisteEnLista(listaSoldadoRaso, id)){
                    
                    listaSoldadoRaso.add(nuevoSoldadoRaso); //Se cumple la condicion se agrega el soldado
                    
                    JOptionPane.showMessageDialog(null, "Soldado creado y agregado", "Crear Soldado", JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "El ID ya existe", "Crear Soldado", JOptionPane.ERROR_MESSAGE);
                }
                
    }

    //////////////////////
    //MOSTRARINFORMACION//
    //////////////////////

    @Override
    public void mostrarInformacion() {

        //Variable para verificar si el soldado fue encontrado
        boolean encontrado = false;
        
        //Datos que se compararan con la lista 
        rango = "1";
       // nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado:","Información Soldado", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del soldado:","Información Soldado", JOptionPane.QUESTION_MESSAGE);
    
        int contador = 0;
        //Siclo para recorrer la lista
        for (SoldadoRaso soldado : listaSoldadoRaso) {

            System.out.println(listaSoldadoRaso.size());
            //Condicion para verificar si el soldado existe comparando con los datos ingresados
            if(/*nombre.equals(soldado.nombre) && */rango.equals(soldado.rango) && id.equals(soldado.id)){
                
                //Si se cumple muestra lo siguiente
                JOptionPane.showMessageDialog(null, 
                "Nombre: " + soldado.nombre + "\n" +
                "ID: " + soldado.id + "\n" +
                "Rango: " + soldado.rango + "\n" +
                "Nivel: " + soldado.nivel + "\n" +
                "Mision: " + soldado.mision  + "\n" +
                "Reporte: " + soldado.reporte, "Información Soldado", JOptionPane.INFORMATION_MESSAGE);
                
                // //Cuando el contador este igualado al indice se imprime en pantalla
                // JOptionPane.showMessageDialog(null, "Misión: " + misionSoldadoRaso.get(contador), "Información Soldado", JOptionPane.INFORMATION_MESSAGE);
                // JOptionPane.showMessageDialog(null, "Reporte: " + reportarSoldadoRaso.get(contador), "Información Soldado", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Acción: " + accionSoldadoRaso.get(contador), "Información Soldado", JOptionPane.INFORMATION_MESSAGE);
                
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
            JOptionPane.showMessageDialog(null, "No se encontró el soldado", "Información Soldado", JOptionPane.ERROR_MESSAGE);
        }
    }

    ////////////////////
    //MODIFICARSOLDADO//
    ////////////////////

    @Override
    public void modificarSoldado() {
        
        //Variable para verificar si el soldado fue encontrado
        boolean encontrado = false;
        //String nuevoId;
        //sboolean idValido;
        
        //Datos que se compararan con la lista 
        rango = "1";
        //nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado:","Modificar Soldado", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del soldado:", "Modificar Soldado", JOptionPane.QUESTION_MESSAGE);
        int contador = 0;
        //Siclo para recorrer la lista
        for (SoldadoRaso soldado : listaSoldadoRaso) {

            //Condicion para verificar si el soldado existe comparando con los datos ingresados
            if(/*nombre.equals(soldado.nombre) &&*/ rango.equals(soldado.rango) && id.equals(soldado.id)){
                
                //Recordatorio no se puede modificar Rangos ya que hace conflicto con la lista donde se almacenan los soldados
                //Remplazo de datos
                JOptionPane.showMessageDialog(null, "Soldado encontrado", "Modificar Soldado", JOptionPane.INFORMATION_MESSAGE);
                soldado.nivel = JOptionPane.showInputDialog(null, "Ingrese el nuevo nivel del soldado:", "Modificar Nombre Soldado", JOptionPane.QUESTION_MESSAGE);
                soldado.nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del soldado:", "Modificar Nombre Soldado", JOptionPane.QUESTION_MESSAGE);

                //do while para evitar ids repetidos
                do {
                    //Variable para ingresar el nuevo id
                    //nuevoId = JOptionPane.showInputDialog(null, "Ingrese el nuevo ID del soldado: ", "Modificar ID Soldado", JOptionPane.QUESTION_MESSAGE);
                    
                    //Si el id existe entonces la variable idValido sera falsa
                    //De lo contrario sera false
                   // idValido = !idExisteEnLista(listaSoldadoRaso, nuevoId);

                    //convertimos la variable a lo contrario entonces se muestra el mensaje
                    //if (!idValido && nuevoId == null) { 
                        //JOptionPane.showMessageDialog(null, "El ID ya existe en la lista", "Información Soldado", JOptionPane.ERROR_MESSAGE);
                    //}

                //Mientras siga siendo verdad 
                //seguira en el siclo hasta que el id sea diferente a uno existente
                //soldado.id = nuevoId; //Se actualiza el id del soldado
                
                //Remplazamos el elemento de la posicion contador con su nueva mision,reprote y accion
                soldado.mision = JOptionPane.showInputDialog(null, "Ingrese la nueva misión del soldado: ", "Modificar Misión", JOptionPane.QUESTION_MESSAGE);
                //misionSoldadoRaso.set(contador,mision);
                soldado.reporte = JOptionPane.showInputDialog(null, "Ingrese el nuevo reporte del soldado: ", "Modificar reporte", JOptionPane.QUESTION_MESSAGE);
                //reportarSoldadoRaso.set(contador,reporte);
                String accion = JOptionPane.showInputDialog(null, "Ingrese la nueva acción del soldado: ", "Modificar acciín", JOptionPane.QUESTION_MESSAGE);
                accionSoldadoRaso.set(contador,accion);

                JOptionPane.showMessageDialog(null, "Soldado Actualizado Con éxito", "Modificar Soldado", JOptionPane.INFORMATION_MESSAGE);
                
                //Mostrar la informacion del soldado actualizada
                JOptionPane.showMessageDialog(null, 
                "Nombre: " + soldado.nombre + "\n" +
                "ID: " + soldado.id + "\n" +
                "Rango: " + soldado.rango + "\n" + 
                "Nivel: " + soldado.nivel + "\n" +
                "Mision: " + soldado.mision  + "\n" +
                "Reporte: " + soldado.reporte, "Modificar Soldado", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("FUNCIONA");
                
                // JOptionPane.showMessageDialog(null, "Misión: " + misionSoldadoRaso.get(contador), "Información Soldado", JOptionPane.INFORMATION_MESSAGE);
                // JOptionPane.showMessageDialog(null, "Reporte: " + reportarSoldadoRaso.get(contador), "Información Soldado", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Acción: " + accionSoldadoRaso.get(contador), "Información Soldado", JOptionPane.INFORMATION_MESSAGE);

                //Si el soldado fue encontrado la varieable se actualiza
                encontrado = true;

                //Fin del siclo for
                break;
            } while (true);
            {
                contador++;//incrementamos el contador para que este en el mismo indice que el soldado
            }
        }
        //Si el soldado no fue encontrado se muestra este mensaje
        if(encontrado == false){
            JOptionPane.showMessageDialog(null, "No se encontró el soldado", "Información Soldado", JOptionPane.ERROR_MESSAGE);
        }
    
    }

}

    @Override
    public void asignarMision(String mision) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asignarMision'");
    }

    @Override
    public void reportarEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reportarEstado'");
    }}