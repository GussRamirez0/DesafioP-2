public class FabricaDeportiva implements FabricaZapatos {
    @Override
    public Zapato crearZapatoHombre() {
        return new ZapatoDeportivo("Hombre", "Azul", 42);
    }

    @Override
    public Zapato crearZapatoMujer() {
        return new ZapatoDeportivo("Mujer", "Rojo", 38);
    }

    @Override
    public Zapato crearZapatoNino() {
        return new ZapatoDeportivo("Niño", "Verde", 30);
    }
}
