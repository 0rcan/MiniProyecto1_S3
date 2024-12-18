package vista;
public abstract class Rango extends Soldado { // Esta es una clase abstracta, no puede instanciasrse como objeto 
    //Atributos abstractos
    String nivel;
    public Rango (String nivel, String nombre, String id, String rango){
        super(nombre,id,rango);
        this.nivel=nivel;
    }

    public Rango(){

    }

    //Metodo abstracto
    public abstract void realizarAccion();
}
