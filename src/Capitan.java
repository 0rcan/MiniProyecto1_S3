import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Capitan extends Rango implements OperacionesMilitares {

    /////////////
    // ATRIBUTOS//
    /////////////

    String mision;
    String reporte;
    String cantidadSoldadosBajoSuMnado;

    static ArrayList<Capitan> listaCapitan = new ArrayList<>();
    static List<String> accionCapitan = new ArrayList<>();
//     static List<String> misionCapitan = new ArrayList<>();
//     static List<String> reportarCapitan = new ArrayList<>();

    ///////////////
    // CONSTRUCTOR//
    ///////////////

    public Capitan(String cantidadSoldadosBajoSuMnado,String nivel, String nombre, String id, String rango,String mision,String reporte) {
            super(nivel, nombre, id, rango);
            this.mision = mision;
            this.reporte = reporte;
            this.cantidadSoldadosBajoSuMnado = cantidadSoldadosBajoSuMnado;
    }    

    public Capitan() { // constructor vacio necesario para crear objetos de la clase

    }

    //////////
    // METODO//
    //////////

    // Metodo para verificar si el ID ya existe en la lista
    public static boolean idExisteEnLista(ArrayList<Capitan> lista, String id) {

        // Recorre la lista<Capitan> verificando si el id ya existe
        for (Capitan soldado : lista) {
            if (soldado.id.equals(id)) {
                return true;
            }
        }
        return false;
    }

    ////////////////////
    // METODO/ABSTRACTO//
    ////////////////////

    public void realizarAccion() {

        String accion = JOptionPane.showInputDialog(null, "Ingrese la accion del Capitan ", "Acción Capitan ",
                JOptionPane.QUESTION_MESSAGE);

        accionCapitan.add(accion);
        System.out.println("Acción: " + accion);
    }


    ////////////////
    // CREARSOLDADO//
    ////////////////

    @Override
    public void crearSoldado() {

        //Datos que se compararan con la lista 
        rango = "3";

        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado: ", "Crear Soldado", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null,"Ingrese el ID del soldado: ", "Crear Soldado", JOptionPane.QUESTION_MESSAGE);
        nivel = JOptionPane.showInputDialog(null,"Ingrese el nivel del soldado: ", "Crear Soldado", JOptionPane.QUESTION_MESSAGE); 
        
        //Asignamos una mision al soldado
        mision = JOptionPane.showInputDialog(null, "Asigne una misíon al soldado Raso: ", "Asignar Misión", JOptionPane.QUESTION_MESSAGE);
        
        //Reportamos el estado del soldado
        reporte = JOptionPane.showInputDialog(null, "Ingrese el reporte del soldado", "Reportar Estado", JOptionPane.QUESTION_MESSAGE);
        
        cantidadSoldadosBajoSuMnado = JOptionPane.showInputDialog(null, "Ingrese la cantidad de soldados bajo su mando: ","Crear Capitan ", JOptionPane.QUESTION_MESSAGE);

        realizarAccion();

        Capitan nuevoCapitan = new Capitan(cantidadSoldadosBajoSuMnado, nivel, nombre, id, rango,mision,reporte);

        // Verificacion si el ID existe en la lista
        if (!idExisteEnLista(listaCapitan, id)) {

            listaCapitan.add(nuevoCapitan); // Se cumple la condicion se agrega el soldado

            JOptionPane.showMessageDialog(null, "Soldado creado y agregado", "Crear Capitan ",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "El ID ya existe", "Crear Capitan ", JOptionPane.ERROR_MESSAGE);
        }

    }

    //////////////////////
    // MOSTRARINFORMACION//
    //////////////////////

    @Override
    public void mostrarInformacion() {

        // Variable para verificar si el soldado fue encontrado
        boolean encontrado = false;

        // Datos que se compararan con la lista
        rango = "3";
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del soldado:", "Información Capitan ",
                JOptionPane.QUESTION_MESSAGE);

        int contador = 0;
        // Siclo para recorrer la lista
        for (Capitan soldado : listaCapitan) {

            System.out.println(listaCapitan.size());
            // Condicion para verificar si el soldado existe comparando con los datos
            // ingresados
            if (/*nombre.equals(soldado.nombre) &&*/ rango.equals(soldado.rango) && id.equals(soldado.id)) {

                // Si se cumple muestra lo siguiente
                JOptionPane.showMessageDialog(null,
                        "Nombre: " + soldado.nombre + "\n" +
                                "ID: " + soldado.id + "\n" +
                                "Rango: " + soldado.rango + "\n" +
                                "Nivel: " + soldado.nivel + "\n" +
                                "Mision: " + soldado.mision  + "\n" +
                                "Reporte: " + soldado.reporte + "\n" +
                                "cantidadSoldadosBajoSuMnadoes del Capitan: " + soldado.cantidadSoldadosBajoSuMnado + "\n",
                        "Información Capitan ", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Acción: " + accionCapitan.get(contador), "Información Capitan", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("x");

                // Si el soldado fue encontrado la varieable se actualiza
                encontrado = true;
                break;
            } else {
                contador++;// incrementamos el contador para que este en el mismo indice que el soldado
            }
        }

        // Si el soldado no fue encontrado se muestra este mensaje
        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "No se encontró el Capitan ", "Información Capitan ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    ////////////////////
    // MODIFICARSOLDADO//
    ////////////////////

    @Override
    public void modificarSoldado() {

        // Variable para verificar si el soldado fue encontrado
        boolean encontrado = false;

        // Datos que se compararan con la lista
        rango = "3";
       // nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del soldado:", "Modificar Capitan ",
        //        JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del soldado:", "Modificar Capitan ",
                JOptionPane.QUESTION_MESSAGE);
        int contador = 0;
        // Siclo para recorrer la lista
        for (Capitan soldado : listaCapitan) {

            // Condicion para verificar si el soldado existe comparando con los datos
            // ingresados
            if (rango.equals(soldado.rango) && id.equals(soldado.id)) {

                // Recordatorio no se puede modificar Rangos ya que hace conflicto con la lista
                // donde se almacenan los soldados
                // Remplazo de datos
                JOptionPane.showMessageDialog(null, "Soldado encontrado", "Modificar Capitan ",JOptionPane.INFORMATION_MESSAGE);
                soldado.nivel = JOptionPane.showInputDialog(null, "Ingrese el nuevo nivel del Capitan: ","Modificar Nombre Capitan ", JOptionPane.QUESTION_MESSAGE);
                soldado.nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del Capitan: ","Modificar Nombre Capitan ", JOptionPane.QUESTION_MESSAGE);
                soldado.cantidadSoldadosBajoSuMnado = JOptionPane.showInputDialog(null, "Ingrese la nueva cantidad: ","Modificar Nombre Capitan ", JOptionPane.QUESTION_MESSAGE);

                // do while para evitar ids repetidos
                do {

                // Remplazamos el elemento de la posicion contador con su nueva mision,reprote y
                // accion
                mision = JOptionPane.showInputDialog(null, "Ingrese la nueva misión del Capitan: ","Modificar Misión", JOptionPane.QUESTION_MESSAGE);
                //misionCapitan.set(contador, mision);
                reporte = JOptionPane.showInputDialog(null, "Ingrese el nuevo reporte del Capitan: ","Modificar reporte", JOptionPane.QUESTION_MESSAGE);
                //reportarCapitan.set(contador, reporte);
                String accion = JOptionPane.showInputDialog(null, "Ingrese la nueva accion del Capitan: ",
                "Modificar acción", JOptionPane.QUESTION_MESSAGE);
                accionCapitan.set(contador, accion);

                JOptionPane.showMessageDialog(null, "Soldado Actualizado Con éxito", "Modificar Capitan ",
                        JOptionPane.INFORMATION_MESSAGE);

                 //Mostrar la informacion del soldado actualizada
                 JOptionPane.showMessageDialog(null, 
                 "Nombre: " + soldado.nombre + "\n" +
                 "ID: " + soldado.id + "\n" +
                 "Rango: " + soldado.rango + "\n" + 
                 "Nivel: " + soldado.nivel + "\n" +
                 "Mision: " + soldado.mision  + "\n" +
                 "Cantidad Soldados: " + soldado.mision  + "\n" +
                 "Reporte: " + soldado.reporte, "Modificar Soldado", JOptionPane.INFORMATION_MESSAGE);
                 System.out.println("FUNCIONA");
                 
                JOptionPane.showMessageDialog(null, "Acción: " + accionCapitan.get(contador), "Información Capitan ",
                        JOptionPane.INFORMATION_MESSAGE);

                        // Si el soldado fue encontrado la varieable se actualiza
                        encontrado = true;
                        
                        // Fin del siclo for
                        break;
                } while (true);
            {
                contador++;// incrementamos el contador para que este en el mismo indice que el soldado
            }
        }
        // Si el soldado no fue encontrado se muestra este mensaje
        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "No se encontró el Capitan ", "Información Capitan ",
                    JOptionPane.ERROR_MESSAGE);
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
}

}