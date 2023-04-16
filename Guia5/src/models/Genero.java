package models;

public enum Genero {
    ROCK("ROCK"),TRAP("TRAP"),JAZZ("JAZZ"),HIPHOP("HIP HOP"),POP("POP"),METAL("METAL"),CLASICA("CLASICA");

    private String name;

    private Genero(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
