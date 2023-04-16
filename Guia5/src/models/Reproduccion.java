package models;

public interface Reproduccion {

    public abstract String reproducir();
    public abstract void agregarCancion(Cancion c);
    public abstract String eliminarCancion(Integer pos);
    public abstract String verMiLista();

}
