public class FabricaFormal implements FabricaZapatos {
    @Override
    public Zapato crearZapatoHombre() {
        return new ZapatoFormal("Hombre", "Negro", 43);
    }

    @Override
    public Zapato crearZapatoMujer() {
        return new ZapatoFormal("Mujer", "Beige", 37);
    }

    @Override
    public Zapato crearZapatoNino() {
        return new ZapatoFormal("Niño", "Marrón", 32);
    }
}
