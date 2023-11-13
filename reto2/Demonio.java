
/**
 * Write a description of class Demonio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demonio extends Personaje {
    public Demonio(String nombre) {
        super(nombre, 120, 30, 25);
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
