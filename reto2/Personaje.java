public abstract class Personaje {
    protected String nombre;
    protected int salud;
    protected int defensa;
    protected int ataque;

    public Personaje(String nombre, int salud, int defensa, int ataque) {
        this.nombre = nombre;
        this.salud = salud;
        this.defensa = defensa;
        this.ataque = ataque;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getSalud() {
        return this.salud;
    }

    public boolean estaVivo() {
        return this.salud > 0;
    }

    public abstract void atacar(Personaje enemigo);

    public String toString() {
        return String.format("Hola, soy un %s y mi nombre es %s%nMis atributos son:%n salud: %d%n defensa: %d%n ataque: %d%n",
                this.getClass().getSimpleName(), this.nombre, this.salud, this.defensa, this.ataque);
    }
}
