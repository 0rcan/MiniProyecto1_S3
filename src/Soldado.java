<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a4e71552db734f4da4e62b97e2c2dd4f36058596
=======
>>>>>>> caa6ccb4adfdd03bb480a3cf3a014a444c373ab9
import javax.swing.JOptionPane;
public class Soldado{ //Clase Principal Soldado 
    
    /////////////
    //ATRIBUTOS//
    /////////////

    String nombre;
    String id;
    String rango;
    
    ///////////////
    //CONSTRUCTOR//
    ///////////////

    public Soldado(String nombre, String id, String rango) {
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
    }
    
    public Soldado() {
        
    }
}


    /////////
    //CREAR//
    /////////

    public static void crear(){ 

        //Variable que almacena en que rango nos encontramos
        String rango = JOptionPane.showInputDialog(null,
        "[1] SoldadoRaso \n" +
        "[2] Teniente \n" +
        "[3] Capitan \n" +
        "[4] Coronel \n" +
        "\nIngrese el rango del soldado:", "Crear Soldado", JOptionPane.QUESTION_MESSAGE);
        
        //Dependiendo del rango ejecuta un metodo en una clase diferente
        //En este caso se crea un soldado
        switch (rango) {
            case "1":
                SoldadoRaso nuevoSoldadoRaso = new SoldadoRaso();
                nuevoSoldadoRaso.crearSoldado();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Rango no valido", "Crear Soldado", JOptionPane.ERROR_MESSAGE);

                break;
        }
        
    }

    ///////////
    //MOSTRAR//
    ///////////

    public static void mostrar(){

        //Variable que almacena en que rango nos encontramos
        String rango = JOptionPane.showInputDialog(null,
            "[1] SoldadoRaso \n" +
            "[2] Teniente \n" +
            "[3] Capitan \n" +
            "[4] Coronel \n" +
            
        "\nIngrese el rango del soldado:", "Información Soldado", JOptionPane.QUESTION_MESSAGE);
        
        //Dependiendo del rango ejecuta un metodo en una clase diferente
        //En este caso se muestra la informacion de un soldado
        switch (rango) {
            case "1":
                SoldadoRaso nuevoSoldadoRaso = new SoldadoRaso();
                nuevoSoldadoRaso.mostrarInformacion();
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Rango no valido", "Mostrar Soldado", JOptionPane.ERROR_MESSAGE);

                break;
        }

    }

    /////////////
    //MODIFICAR//
    /////////////

    public static void modificar() {
        
        //Variable que almacena en que rango nos encontramos
        String rango = JOptionPane.showInputDialog(null,
            "[1] SoldadoRaso \n" +
            "[2] Teniente \n" +
            "[3] Capitan \n" +
            "[4] Coronel \n" +
        
        "\nIngrese el rango del soldado:", "Modificar Soldado", JOptionPane.QUESTION_MESSAGE);

        //Dependiendo del rango ejecuta un metodo en una clase diferente
        //En este caso se modifica la información de un soldado
        switch (rango) {
            case "1":
                SoldadoRaso nuevoSoldadoRaso = new SoldadoRaso();
                nuevoSoldadoRaso.modificarSoldado();
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Rango no valido", "Modificar Soldado", JOptionPane.ERROR_MESSAGE);

                break;
        }



    }


}
<<<<<<< HEAD
<<<<<<< HEAD


=======
=======
public class Soldado {
    
}
>>>>>>> a4b080c79c2258554f842a0a6e3b962a0220aff5
>>>>>>> a4e71552db734f4da4e62b97e2c2dd4f36058596
=======


>>>>>>> caa6ccb4adfdd03bb480a3cf3a014a444c373ab9
