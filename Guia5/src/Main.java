import models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Spotify app = new Spotify();

        Artista artista = crearArtista("Astor Piazolla",74,"Argentina");
        Album album = crearAlbum("Grandes Exitos",1975,artista);
        Cancion cancion = crearCancion("Adios Nonino","5:05",Genero.JAZZ,artista,album,"");

        Artista artista1 = crearArtista("Edmundo Rivero",80,"Argentina");
        Album album1 = crearAlbum("Tangos Clasicos",1950,artista1);
        Cancion cancion1 = crearCancion("Chorra","2:59",Genero.CLASICA,artista1,album1,"Pichuco Troilo");

        app.agregarCancion(cancion);
        app.agregarCancion(cancion1);

        //recorrerCanciones(app);

        //app.getBase().agregarCancion(cancion);
        //app.getBase().agregarCancion(cancion1);
       // System.out.println(app.getBase().eliminarCancion(0));
        //System.out.println(app.getBase().verMiLista());

        app.getPremium().agregarCancion(cancion);
        app.getPremium().agregarCancion(cancion1);
       // System.out.println(app.getPremium().verMiLista());

        /// Reporoduccion Premium
        //System.out.println(app.getPremium().verMiLista());
        //System.out.println(app.getPremium().reproducirPremium(0));

        /// Eliminar Premium
        //System.out.println(app.getPremium().verMiLista());
        //System.out.println(app.getPremium().reproducirPremium(1));
        //System.out.println(app.getPremium().eliminarCancion(1));
        //System.out.println(app.getPremium().verMiLista());

        menuApp(app);
    }

    public static Artista crearArtista(String nombre,Integer edad,String nacionalidad){
        Artista artista = new Artista(nombre,edad,nacionalidad);
        return artista;
    }

    public static Album crearAlbum(String nombre,Integer publicacion,Artista artista){
        Album album = new Album(nombre,artista,publicacion);
        return album;
    }

    public static Cancion crearCancion(String nombre, String duracion, Genero genero,Artista artista,Album album,String artistaInvitado){
        Cancion cancion = new Cancion(nombre,duracion,genero,artista,album,artistaInvitado);
        return cancion;
    }

    public static void recorrerCanciones(Spotify app){
        for(Cancion c : app.getListaCanciones()){
            System.out.println(c.toString());
        }
    }

    public enum level {
        BASICO,
        PREMIUM

    }

    public static void menuApp(Spotify app){
        int n;
        String l = "";
        Scanner scan = new Scanner(System.in);


        System.out.println("Bienvenido a Spotify");
        System.out.println("Seleccione su paquete:\n1-"+level.BASICO+"\n2-"+level.PREMIUM);
        n = scan.nextInt();
        if(n == 1){
            int opcion;
            System.out.println("PAQUETE BASICO");
            System.out.println("1 - Agregar Cancion.\n2-Reproducir.\n3-Eliminar Cancion\n4-Ver Mi Lista");
            opcion = scan.nextInt();
            switch (opcion){
                case 1:{
                    System.out.println("Menu Agregar Cancion:");
                    System.out.println("Listado de Canciones Disponible");
                    recorrerCanciones(app);




                }
                break;
                case 2:{
                    app.getBase();
                }
            }

        }else if(n == 2){

        }else{
            System.out.println("ERROR DE PAQUETE.....");
        }





    }
}