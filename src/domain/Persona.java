package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    static {
        System.out.println("Ejecucion bloque estático");
        ++Persona.contadorPersonas;
    }

    {
        System.out.println("Ejecucion bloque no estático");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona(){
        System.out.println("Ejecucion del contructor");
    }

    public int getIdPersona() {
        return idPersona;
    }
}
