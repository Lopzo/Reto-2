abstract class Personaje {
    protected String nombre;
    protected int salud = 100;
    protected int defensa = 30;
    protected int ataque = 20;
    protected String raza;
    protected String clase;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.definirAtributosDeClase();
        this.definirAtributosDeRaza();
    }
    
    public String toString() {
        String Texto;
        Texto = "Hola, soy un " + this.raza + " " + this.clase + " y mi nombre es " + this.nombre + "\n";
        Texto += "Mis atributos son:\n"  + " salud: " + this.salud + "\n";
        Texto += " defensa: " + this.defensa + "\n";
        Texto += " ataque: " + this.ataque + "\n";
        return Texto;
    }

    protected abstract void definirAtributosDeRaza();

    protected abstract void definirAtributosDeClase();
}