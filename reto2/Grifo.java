
/**
 * Write a description of class Grifo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grifo extends Personaje {
    public Grifo(String nombre) {
        super(nombre, 180, 40, 35);
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
