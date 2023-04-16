package models;

public class Cancion {

    private String titulo;
    private String duracion;
    private Genero genero;
    private Artista artista;
    private Album album;
    private String artistaInvitado;

    public Cancion() {
    }

    public Cancion(String titulo, String duracion, Genero genero,Artista artista, Album album,String artistaInvitado) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.artista = artista;
        this.album = album;
        this.artistaInvitado = artistaInvitado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getArtistaInvitado() {
        return artistaInvitado;
    }

    public void setArtistaInvitado(String artistaInvitado) {
        this.artistaInvitado = artistaInvitado;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", duracion='" + duracion + '\'' +
                ", genero=" + genero +
                ", artista=" + artista +
                ", album=" + album +
                ", artistaInvitado='" + artistaInvitado + '\'' +
                '}';
    }
}
