
public class Dragon extends Personaje {
    public Dragon(String nombre) {
        super(nombre, 200, 50, 30);
    }

    @Override
    public void atacar(Personaje enemigo) {
        int danioInfligido = this.ataque - enemigo.defensa;
        if (danioInfligido > 0) {
            enemigo.salud -= danioInfligido;
        }
        System.out.println(this.getNombre() + " ha escupido fuego a " + enemigo.getNombre() + " infligiendo " + danioInfligido + " de daño.");
    }
}
