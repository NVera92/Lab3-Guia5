package models;

import java.util.LinkedList;

public class ListaPremium implements Reproduccion{

    private String nombre;
    private LinkedList<Cancion> miLista;

    public ListaPremium() {
        this.nombre = "Lista Premium";
        this.miLista = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Cancion> getMiLista() {
        return miLista;
    }

    public void setListaCanciones(LinkedList<Cancion> miLista) {
        this.miLista = miLista;
    }

    @Override
    public String reproducir() {

        return null;
    }

    @Override
    public void agregarCancion(Cancion c) {
        this.miLista.add(c);
    }

    @Override
    public String eliminarCancion(int pos) {
        String l = "Cancion eliminada: "+this.miLista.get(pos).getTitulo();
        this.miLista.remove(pos);
        return l;
    }

    @Override
    public String verMiLista() {
        int i = 0;
        String s = "";
        if(!miLista.isEmpty()){
            while(i < miLista.size()){
                s += miLista.get(i).getTitulo()+"\n";
                i++;
            }
        }
        return s;
    }

    public String reproducirPremium(Integer pos){
        String s = "";
        if(!miLista.isEmpty()){
            s = miLista.get(pos).toString();
        }
        return s;
    }
}
