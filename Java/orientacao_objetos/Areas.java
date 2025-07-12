
import java.util.ArrayList;
import java.util.List;

public class Areas {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5.5);
        //System.out.println("Área do quadrado: " + quadrado.calcularArea());

        Retangulo retangulo = new Retangulo(3, 4);
        //System.out.println("Área do retângulo: " + retangulo.calcularArea());

        List<Quadrilatero> figuras = new ArrayList<>();
        figuras.add(quadrado);
        figuras.add(retangulo);
        
        for (Quadrilatero figura : figuras) {
            System.out.println("Área: " + figura.calcularArea()); 
        }
    }
}
