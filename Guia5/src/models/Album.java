package models;

public class Album {

    private String titulo;
    private Artista artista;
    private Integer publicacion;

    public Album() {
    }

    public Album(String titulo, Artista artista, Integer publicacion) {
        this.titulo = titulo;
        this.artista = artista;
        this.publicacion = publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Integer getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Integer publicacion) {
        this.publicacion = publicacion;
    }

    @Override
    public String toString() {
        return "Album{" +
                "titulo='" + titulo + '\'' +
                ", artista=" + artista +
                ", publicacion=" + publicacion +
                '}';
    }
}
