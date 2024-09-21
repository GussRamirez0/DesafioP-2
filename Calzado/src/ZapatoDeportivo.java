public class ZapatoDeportivo implements Zapato {
    private String categoria;
    private String color;
    private int tamaño;

    public ZapatoDeportivo(String categoria, String color, int tamaño) {
        this.categoria = categoria;
        this.color = color;
        this.tamaño = tamaño;
    }

    @Override
    public String getTipo() {
        return "Deportivo";
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getTamaño() {
        return tamaño;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Zapato Deportivo para " + categoria + " | Color: " + color + " | Tamaño: " + tamaño);
    }
}
