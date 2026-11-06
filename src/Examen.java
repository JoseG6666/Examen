public class Examen {
    public static void main(String[] args) {
        double precio1 = 12.5;
        double unidades1 = 4; // aqui le he cambiado de int a double
        double total1 = getTotal(precio1, unidades1);
        double descuento1 = getDescuento(total1);
        double final1 = getFinal(total1, descuento1);
        System.out.println("Pedido 1: " + final1 + " euros");

        double precio2 = 8.0;
        double unidades2 = 5; // aqui le he cambiado de int a double
        double total2 = getTotal(precio2, unidades2); // tenia p2+u2, ahora lo he puesto bien, multiplicandolo.
        double descuento2 = getDescuento(total2);
        double final2 = getFinal(total2, descuento2);
        System.out.println("Pedido 2: " + final2 + " euros");


        double plazo = (final1 + final2) / 3; // aqui se hacia la division primero por lo que se arruinaba la operacion, al ponerlo ente parentesis, primero se hace la suma y luego la division, dando el resultado sin problemas.
        System.out.println("Pago de cada plazo (3 plazos): " + plazo + " euros");
        double m = (unidades1 + unidades2) / 2;
        System.out.println("Media de unidades por pedido: " + m); // he cambiado ambos valores a double para que el resultado me pueda dar en decimales y no como antes que solamente podia darmelo como un valor entero

    }

    private static double getFinal(double total1, double descuento1) {
        return total1 - descuento1;
    }

    private static double getDescuento(double total1) {
        return total1 * 10 / 100;
    }

    private static double getTotal(double precio1, double unidades1) {
        return precio1 * unidades1;
    }
}   // aqui he puesto todas las funciones, ademas, con nombres "generales" para poder ser reutilizadas las veces que hagan falta.
