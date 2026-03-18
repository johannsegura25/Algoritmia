public class ContainerRect {
    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;
    private static int numRec = 0;

    public ContainerRect(int n) {
        this.n = n;
        rectangulos = new Rectangulo[n];
        distancias = new double[n];
        areas = new double[n];
    }
    public void addRectangulo(Rectangulo r) {
        if (numRec >= n) {
            System.out.println("No se puede agregar más rectángulos, contenedor lleno.");
            return;
        }

        rectangulos[numRec] = r;
        distancias[numRec] = Coordenada.distancia(r.getEsquina1(), r.getEsquina2());
        areas[numRec] = r.calcularArea();
        numRec++;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-15s %-30s %-15s %-10s\n", "Rectangulo", "Coordenadas", "Distancia", "Area"));
        for (int i = 0; i < numRec; i++) {
            sb.append(String.format("%-15d %-30s %-15.3f %-10.2f\n",
                        i+1, rectangulos[i], distancias[i], areas[i]));
        }
        return sb.toString();
    }
}