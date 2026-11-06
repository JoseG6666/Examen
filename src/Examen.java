public class Examen {
    public static void main(String[] args) {
        double p1 = 12.5;
        double u1 = 4; // aqui le he cambiado de int a double
        double t1 = p1 * u1;
        double d1 = t1 * 10 / 100;
        double f1 = t1 - d1;
        System.out.println("Pedido 1: " + f1 + " euros");
        double p2 = 8.0;
        double u2 = 5; // aqui le he cambiado de int a double
        double t2 = p2 * u2; // tenia p2+u2, ahora lo he puesto bien, multiplicando.
        double d2 = t2 * 10 / 100;
        double f2 = t2 - d2;
        System.out.println("Pedido 2: " + f2 + " euros");
        double plazo = (f1 + f2) / 3; // aqui se hacia la division primero por lo que se arruinaba la operacion, al ponerlo ente parentesis, primero se hace la suma y luego la division, dando el resultado sin problemas.
        System.out.println("Pago de cada plazo (3 plazos): " + plazo + " euros");
        double m = (u1 + u2) / 2;
        System.out.println("Media de unidades por pedido: " + m); // he cambiado ambos valores a double para que el resultado me pueda dar en decimales y no como antes que solamente podia darmelo como un valor entero

    }
}