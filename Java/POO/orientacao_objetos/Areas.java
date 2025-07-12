public class Areas {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5.5);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());

        Retangulo retangulo = new Retangulo(3, 4);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}
