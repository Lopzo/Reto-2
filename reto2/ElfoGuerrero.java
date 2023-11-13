
/**
 * Write a description of class ElfoGuerrero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElfoGuerrero extends Personaje {
    public ElfoGuerrero(String nombre) {
        super(nombre, 110, 10, 20);
    }

    @Override
    public void atacar(Personaje enemigo) {
        int danioInfligido = this.ataque - enemigo.defensa;
        if (danioInfligido > 0) {
            enemigo.salud -= danioInfligido;
        }
        System.out.println(this.getNombre() + " ha atacado a " + enemigo.getNombre() + " infligiendo " + danioInfligido + " de daño.");
    }
}
