
/**
 * Write a description of class OrcoGuerrero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrcoGuerrero extends Personaje {
    public OrcoGuerrero(String nombre) {
        super(nombre, 150, 80, 120);
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
