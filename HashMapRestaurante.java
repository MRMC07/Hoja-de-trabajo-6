class HashMapRestaurante {

    Nodo[] buckets;
    int tamaño;

    public HashMapRestaurante(int tamaño) {
        this.tamaño = tamaño;
        buckets = new Nodo[tamaño];
    }

    public int generarHash(String key) {

        int suma = 0;

        for (int i = 0; i < key.length(); i++) {
            suma = suma + key.charAt(i);
        }

        return suma % tamaño;
    }
    
    public void put(String key, double precio) {

        int indice = generarHash(key);

        Nodo nuevo = new Nodo(key, precio);

       
        if (buckets[indice] == null) {
            buckets[indice] = nuevo;
        } else {

            Nodo actual = buckets[indice];

            
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
    }
    
    public void mostrar() {

        for (int i = 0; i < tamaño; i++) {

            System.out.print("[" + i + "] ");

            Nodo actual = buckets[i];

            while (actual != null) {
                System.out.print(actual.key + " $" + actual.precio + " -> ");
                actual = actual.siguiente;
            }

            System.out.println("null");
        }
    }
}