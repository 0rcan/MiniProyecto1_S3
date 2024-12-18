import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        //////////////////
        //MENU/PRINCIPAL//
        //////////////////

        //Ciclo para que el programa no se cierre
        while (true) {
            
            //Opcion de las acciones que se pueden realizar
            String opcion = JOptionPane.showInputDialog(null,
                "[1] Crear soldado \n" +
                "[2] Mostrar informacion del soldado \n" +
                "[3] Modificar soldado \n" +
                "[0] Cerrar programa  \n\n", "Base Militar De Colombia", JOptionPane.QUESTION_MESSAGE);

                //Dependiendo de la opcion se ejecuta el metodo correspondiente
                switch(opcion){
                    case "1":
                        Soldado.crear();
                        break;
                    case "2":
                        Soldado.mostrar();
                        break;
                    case "3":
                        Soldado.modificar();
                        break;
                    case "0":
                        System.exit(0);
                        break;
                    default:
                    JOptionPane.showMessageDialog(null, "No se encontró el soldado", "Base Militar De Colombia", JOptionPane.ERROR_MESSAGE);
                        break;
            }
        
        }

    }
}
