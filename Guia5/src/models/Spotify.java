package models;

import java.util.ArrayList;

public class Spotify {

    private ArrayList<Cancion> listaCanciones;
    private ListaBasica base;
    private ListaPremium premium;



    public Spotify() {
        this.listaCanciones = new ArrayList<>();
        this.base = new ListaBasica();
        this.premium = new ListaPremium();
    }

    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    public ListaBasica getBase() {
        return base;
    }

    public void setBase(ListaBasica base) {
        this.base = base;
    }

    public ListaPremium getPremium() {
        return premium;
    }

    public void setPremium(ListaPremium premium) {
        this.premium = premium;
    }

    public void agregarCancion(Cancion c){
        this.listaCanciones.add(c);
    }


}
