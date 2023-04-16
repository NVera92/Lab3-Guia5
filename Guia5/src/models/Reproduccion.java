package models;

public interface Reproduccion {

    public abstract String reproducir();
    public abstract void agregarCancion(Cancion c);
    public abstract String eliminarCancion(int pos);
    public abstract String verMiLista();

}
