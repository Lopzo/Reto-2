class OrcoGuerrero extends Personaje {
    public OrcoGuerrero(String nombre) {
        super(nombre);
    }

    @Override
    protected void definirAtributosDeRaza() {
        Orco orco = new Orco();
        this.raza = orco.getClass().getSimpleName();
        this.salud+=orco.getSalud();
        this.defensa+=orco.getDefensa();
        this.ataque+=orco.getAtaque();
        orco = null;
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