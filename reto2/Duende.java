
public class Duende extends Personaje {
    public Duende(String nombre) {
        super(nombre, 90, 10, 15);
    }

    @Override
    public void atacar(Personaje enemigo) {
        int danioInfligido = this.ataque - enemigo.defensa;
        if (danioInfligido > 0) {
            enemigo.salud -= danioInfligido;
        }
        System.out.println(this.getNombre() + " JAJAJA " + this.getClass().getSimpleName() + " ataca a " + enemigo.getNombre() + " infligiendo " + danioInfligido + " de daño.");
    }
}
