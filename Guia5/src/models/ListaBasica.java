package models;

import java.util.Stack;

public class ListaBasica implements Reproduccion{

    private String nombre;
    private Stack<Cancion> miLista;

    public ListaBasica() {
        this.nombre = "Lista Basica";
        this.miLista = new Stack<>();
    }

    @Override
    public String reproducir() {
        Stack<Cancion> aux = new Stack<>();
        String s = this.miLista.peek().toString();

        /// Capturo el primer elemento
        Cancion c = this.miLista.pop();

        /// Pasaje de la pila original a auxiliar
        pasajePila(this.miLista,aux);

        /// Coloco el capturado y lo coloco en la pila origen
        this.miLista.push(c);

        /// Vuelvo a pasar de aux a origen
        pasajePila(aux,this.miLista);


        return s;
    }

    @Override
    public void agregarCancion(Cancion c) {
        this.miLista.push(c);
    }

    @Override
    public String eliminarCancion(Integer pos) {
        return "Para acceder a estas opciones, compre el paquete PREMIUM.";
    }

    @Override
    public String verMiLista() {
        Stack<Cancion> aux = new Stack<>();
        String s = "";
        if(!this.miLista.empty()){

            while(!this.miLista.empty()){
                s += this.miLista.peek().getTitulo()+"\n";
                aux.push(this.miLista.pop());
            }
            pasajePila(aux,this.miLista);

        }

        return s;
    }

    public void pasajePila(Stack<Cancion> origen, Stack<Cancion> destino){
        if(!origen.empty()){
            while(!origen.empty()){
                destino.push(origen.pop());
            }
        }
    }
}
