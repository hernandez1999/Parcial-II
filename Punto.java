package principal;

public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x1) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(Punto parametros) {
        double cateto1 = x – parametros.getX();
        double cateto2 = y – parametros.getY();
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        return hipotenusa;
    }

    public double calcularArea(Punto parametros) {
        double areaTriangulo = ((y – parametros.getY())(x – parametros.getX()))/2;
        double areaRetangulo = (y) (x – parametros.getX()
        );
        double areaTotal = areaTriangulo + areaRetangulo;
        return areaTotal;
    }

    public String toString() {
        return "(x= " + getX() + ", y= " + getY() + " )";
    }
}
