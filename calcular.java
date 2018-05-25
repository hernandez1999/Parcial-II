package principal;

public class calcular extends Punto {

    public static void main(String[] args) {
// Cualquier Double 
        Punto p1 = new Punto(1.0, 2.0);
        Punto p2 = new Punto(3.0, 7.0);

//Proceso para realizar el calculo de distancia 
        double distancia = p1.calcularDistancia(p2);
        System.out.println("La distancia de" p1 "a" p2 "es:" ” + distancia;
        );

    public calcular(double x, double y) {
        super(x, y);
    }
}
