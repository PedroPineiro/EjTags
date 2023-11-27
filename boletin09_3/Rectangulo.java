package boletin09_3;
//Version Final
import javax.swing.JOptionPane;

public class Rectangulo {

    public void calcularArea() {
        float base = lerDatos.lerFloatPositivo("Introduce base: ");
        float altura = lerDatos.lerFloatPositivo("Introduce altura: ");
        System.out.println("area:"+(base*altura));
    }

}
