package vista;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import controlador.OperacionesMilitares;

public class Coronel extends Rango implements OperacionesMilitares {

    /////////////
    // ATRIBUTOS//
    /////////////

    String mision;
    String reporte;
    String cantidadSoldadosBajoSuMnado;

    static ArrayList<Coronel> listaCoronel = new ArrayList<>();
    static List<String> accionCoronel = new ArrayList<>();
//     static List<String> misionCoronel = new ArrayList<>();
//     static List<String> reportarCoronel = new ArrayList<>();

    ///////////////
    // CONSTRUCTOR//
    ///////////////

    public Coronel(String cantidadSoldadosBajoSuMnado,String nivel, String nombre, String id, String rango,String mision,String reporte) {
            super(nivel, nombre, id, rango);
            this.mision = mision;
            this.reporte = reporte;
            this.cantidadSoldadosBajoSuMnado = cantidadSoldadosBajoSuMnado;
    }    

    public Coronel() { // constructor vacio necesario para crear objetos de la clase

    }

    //////////
    // METODO//
    //////////

    // Metodo para verificar si el ID ya existe en la lista
    public static boolean idExisteEnLista(ArrayList<Coronel> lista, String id) {

        // Recorre la lista<Coronel> verificando si el id ya existe
        for (Coronel soldado : lista) {
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

        String accion = JOptionPane.showInputDialog(null, "Ingrese la accion del Coronel ", "Acción Coronel ",
                JOptionPane.QUESTION_MESSAGE);

        accionCoronel.add(accion);
        System.out.println("Acción: " + accion);
    }


    ////////////////
    // CREARSOLDADO//
    ////////////////

    @Override
    public void crearSoldado() {

        //Datos que se compararan con la lista 
        rango = "4";

        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado: ", "Crear Soldado", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null,"Ingrese el ID del soldado: ", "Crear Soldado", JOptionPane.QUESTION_MESSAGE);
        nivel = JOptionPane.showInputDialog(null,"Ingrese el nivel del soldado: ", "Crear Soldado", JOptionPane.QUESTION_MESSAGE); 
        
        //Asignamos una mision al soldado
        mision = JOptionPane.showInputDialog(null, "Asigne una misíon al soldado Raso: ", "Asignar Misión", JOptionPane.QUESTION_MESSAGE);
        
        //Reportamos el estado del soldado
        reporte = JOptionPane.showInputDialog(null, "Ingrese el reporte del soldado", "Reportar Estado", JOptionPane.QUESTION_MESSAGE);
        
        cantidadSoldadosBajoSuMnado = JOptionPane.showInputDialog(null, "Ingrese la cantidad de soldados bajo su mando: ","Crear Coronel ", JOptionPane.QUESTION_MESSAGE);

        realizarAccion();

        Coronel nuevoCoronel = new Coronel(cantidadSoldadosBajoSuMnado, nivel, nombre, id, rango,mision,reporte);

        // Verificacion si el ID existe en la lista
        if (!idExisteEnLista(listaCoronel, id)) {

            listaCoronel.add(nuevoCoronel); // Se cumple la condicion se agrega el soldado

            JOptionPane.showMessageDialog(null, "Soldado creado y agregado", "Crear Coronel ",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "El ID ya existe", "Crear Coronel ", JOptionPane.ERROR_MESSAGE);
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
        rango = "4";
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del soldado:", "Información Coronel ",
                JOptionPane.QUESTION_MESSAGE);

        int contador = 0;
        // Siclo para recorrer la lista
        for (Coronel soldado : listaCoronel) {

            System.out.println(listaCoronel.size());
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
                                "cantidadSoldadosBajoSuMnadoes del Coronel: " + soldado.cantidadSoldadosBajoSuMnado + "\n",
                        "Información Coronel ", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Acción: " + accionCoronel.get(contador), "Información Coronel", JOptionPane.INFORMATION_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "No se encontró el Coronel ", "Información Coronel ",
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
        rango = "4";
       // nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del soldado:", "Modificar Coronel ",
        //        JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del soldado:", "Modificar Coronel ",
                JOptionPane.QUESTION_MESSAGE);
        int contador = 0;
        // Siclo para recorrer la lista
        for (Coronel soldado : listaCoronel) {

            // Condicion para verificar si el soldado existe comparando con los datos
            // ingresados
            if (/*nombre.equals(soldado.nombre) && */rango.equals(soldado.rango) && id.equals(soldado.id)) {

                // Recordatorio no se puede modificar Rangos ya que hace conflicto con la lista
                // donde se almacenan los soldados
                // Remplazo de datos
                JOptionPane.showMessageDialog(null, "Soldado encontrado", "Modificar Coronel ",JOptionPane.INFORMATION_MESSAGE);
                soldado.nivel = JOptionPane.showInputDialog(null, "Ingrese el nuevo nivel del Coronel: ","Modificar Nombre Coronel ", JOptionPane.QUESTION_MESSAGE);
                soldado.nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del Coronel: ","Modificar Nombre Coronel ", JOptionPane.QUESTION_MESSAGE);
                soldado.cantidadSoldadosBajoSuMnado = JOptionPane.showInputDialog(null, "Ingrese la nueva cantidad: ","Modificar Nombre Coronel ", JOptionPane.QUESTION_MESSAGE);

                // do while para evitar ids repetidos
                do {

                // Remplazamos el elemento de la posicion contador con su nueva mision,reprote y
                // accion
                mision = JOptionPane.showInputDialog(null, "Ingrese la nueva misión del Coronel: ","Modificar Misión", JOptionPane.QUESTION_MESSAGE);
                //misionCoronel.set(contador, mision);
                reporte = JOptionPane.showInputDialog(null, "Ingrese el nuevo reporte del Coronel: ","Modificar reporte", JOptionPane.QUESTION_MESSAGE);
                //reportarCoronel.set(contador, reporte);
                String accion = JOptionPane.showInputDialog(null, "Ingrese la nueva accion del Coronel: ",
                "Modificar acción", JOptionPane.QUESTION_MESSAGE);
                accionCoronel.set(contador, accion);

                JOptionPane.showMessageDialog(null, "Soldado Actualizado Con éxito", "Modificar Coronel ",
                        JOptionPane.INFORMATION_MESSAGE);

                 //Mostrar la informacion del soldado actualizada
                 JOptionPane.showMessageDialog(null, 
                 "Nombre: " + soldado.nombre + "\n" +
                 "ID: " + soldado.id + "\n" +
                 "Rango: " + soldado.rango + "\n" + 
                 "Nivel: " + soldado.nivel + "\n" +
                 "Mision: " + soldado.mision  + "\n" +
                 "cantidadSoldadosBajoSuMnado: " + soldado.mision  + "\n" +
                 "Reporte: " + soldado.reporte, "Modificar Soldado", JOptionPane.INFORMATION_MESSAGE);
                 System.out.println("FUNCIONA");
                 
                JOptionPane.showMessageDialog(null, "Acción: " + accionCoronel.get(contador), "Información Coronel ",
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
            JOptionPane.showMessageDialog(null, "No se encontró el Coronel ", "Información Coronel ",
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