import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContainerRect contenedor = new ContainerRect(10); // capacidad 10

        for (int i = 0; i < 2; i++) {  // puedes aumentar la cantidad
            System.out.println("Ingrese esquina 1 del rectángulo " + (i+1) + ":");
            Coordenada c1 = new Coordenada(sc.nextDouble(), sc.nextDouble());

            System.out.println("Ingrese esquina 2 del rectángulo " + (i+1) + ":");
            Coordenada c2 = new Coordenada(sc.nextDouble(), sc.nextDouble());

            Rectangulo r = new Rectangulo(c1, c2);
            contenedor.addRectangulo(r);
        }
        System.out.println("\nContenido del contenedor");
        System.out.println(contenedor);
    }
}