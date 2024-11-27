public abstract class Rango extends Soldado { // Esta es una clase abstracta, no puede instanciasrse como objeto 
    //Atributos abstractos
    //int nivel;
    public Rango (int nivel, String nombre, String id, String rango){
        super(nombre,id,rango);
        this.nivel=nivel;
    }

    public Rango(){

    }
   
        protected String nombre;
        protected String id;
        protected int nivel;
        protected String rango;
    
        // Getters
        public String getNombre() {
            return nombre;
        }
    
        public String getId() {
            return id;
        }
    
        public int getNivel() {
            return nivel;
        }
    
        public String getRango() {
            return rango;
        }
    
    

    //Metodo abstracto
    public abstract void realizarAccion();
}
