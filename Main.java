public class Main {

    public static void main(String[] args) {

        HashMapRestaurante menu = new HashMapRestaurante(10);

        menu.put("Risotto de Trufa", 125.50);
        menu.put("Salmon Teriyaki", 98.00);
        menu.put("Pulpo a la Parrilla", 150.00);
        menu.put("Filete Wagyu", 250.75);
        menu.put("Pizza Margarita", 80.00);
        menu.put("Cheesecake de Pistacho", 45.25);
        menu.put("Langosta Mantequilla", 300.00);

        menu.mostrar();
    }
}