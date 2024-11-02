<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2512db5d0b7457a537ebb8aeae209dc0e3f02711
<<<<<<< HEAD
>>>>>>> 95efb20a7b4a604bb548b20916476d6a73ce5b01
=======
=======
=======
<<<<<<< HEAD
>>>>>>> a4e71552db734f4da4e62b97e2c2dd4f36058596
>>>>>>> 0b6817cb4a3a48b5e68884081d776d2003b8dfdb
>>>>>>> 123f07e25b0220ee714aaf789ef96dea7b1ce9fb
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

            case "4":
                Coronel nuevoCoronel = new Coronel();
                nuevoCoronel.crearSoldado();
            break;

            default:
                JOptionPane.showMessageDialog(null, "Rango no valido", "Crear Soldado", JOptionPane.ERROR_MESSAGE);

                break;
        }
        
    }
<<<<<<< HEAD
    
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

            case "4":
                Coronel nuevoCoronel = new Coronel();
                nuevoCoronel.mostrarInformacion();
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

            case "4":
                Coronel nuevoCoronel = new Coronel();
                nuevoCoronel.modificarSoldado();
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "Rango no valido", "Modificar Soldado", JOptionPane.ERROR_MESSAGE);

                break;
        }



    }

}
=======


}
<<<<<<< HEAD
<<<<<<< HEAD
=======


=======
>>>>>>> 0b6817cb4a3a48b5e68884081d776d2003b8dfdb
=======
public class Soldado {
    
}
>>>>>>> a4b080c79c2258554f842a0a6e3b962a0220aff5
<<<<<<< HEAD
=======


>>>>>>> 2512db5d0b7457a537ebb8aeae209dc0e3f02711
<<<<<<< HEAD
>>>>>>> 95efb20a7b4a604bb548b20916476d6a73ce5b01
=======
=======
>>>>>>> a4e71552db734f4da4e62b97e2c2dd4f36058596
>>>>>>> 0b6817cb4a3a48b5e68884081d776d2003b8dfdb
>>>>>>> 123f07e25b0220ee714aaf789ef96dea7b1ce9fb
