class ElfoGuerrero extends Personaje {
    public ElfoGuerrero(String nombre) {
        super(nombre);
    }

    @Override
    protected void definirAtributosDeRaza() {
        Elfo elfo = new Elfo();
        this.raza = elfo.getClass().getSimpleName();
        this.salud+=elfo.getSalud();
        this.defensa+=elfo.getDefensa();
        this.ataque+=elfo.getAtaque();
        elfo = null;
    }

    @Override
    protected void definirAtributosDeClase() {
        Guerrero guerrero = new Guerrero();
        this.clase = guerrero.getClass().getSimpleName();
        this.salud+=guerrero.getSalud();
        this.defensa+=guerrero.getDefensa();
        this.ataque+=guerrero.getAtaque();
        guerrero = null;
    }
}