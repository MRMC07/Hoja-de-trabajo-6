class Nodo {

    String key;       
    double precio;    
    Nodo siguiente;   

    public Nodo(String key, double precio) {
        this.key = key;
        this.precio = precio;
        this.siguiente = null;
    }
}