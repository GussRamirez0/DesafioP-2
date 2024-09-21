public class Tienda {
    private FabricaZapatos fabrica;

    public Tienda(FabricaZapatos fabrica) {
        this.fabrica = fabrica;
    }

    public void mostrarZapatos() {
        Zapato zapatoHombre = fabrica.crearZapatoHombre();
        zapatoHombre.mostrarDetalles();

        Zapato zapatoMujer = fabrica.crearZapatoMujer();
        zapatoMujer.mostrarDetalles();

        Zapato zapatoNino = fabrica.crearZapatoNino();
        zapatoNino.mostrarDetalles();
    }

    public static void main(String[] args) {
        Tienda tiendaDeportiva = new Tienda(new FabricaDeportiva());
        System.out.println("Zapatos Deportivos:");
        tiendaDeportiva.mostrarZapatos();

        Tienda tiendaFormal = new Tienda(new FabricaFormal());
        System.out.println("\nZapatos Formales:");
        tiendaFormal.mostrarZapatos();
    }
}
