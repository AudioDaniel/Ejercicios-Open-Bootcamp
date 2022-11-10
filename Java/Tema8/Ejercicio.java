class Persona{
    private String nombre;
    private int edad;
    private int telefono;


    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad (int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public void setTelefono (int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return telefono;
    }
}
public class Main {

    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setNombre("Albert");
        System.out.println("Nombre de usuario: " + persona.getNombre());
        persona.setEdad(25);
        System.out.println("Edad: " + persona.getEdad());
        persona.setTelefono(9000000);
        System.out.println("Telefono: " + persona.getTelefono());
    }
}
