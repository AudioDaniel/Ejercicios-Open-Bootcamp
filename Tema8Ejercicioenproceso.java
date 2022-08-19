public class Myclass {
    
    public static void main(String[] args){
    Persona persona = new Persona();
    int setEdad = 25;
    System.out.println(edad);
    }
}

public class Persona {
    private int edad;
    private int telefono;
    private String nombre; 
    
    //Setter
    public void setEdad (int edad){
        this.edad = edad;
    }
    public void setTelefono (int telefono){
        this.telefono = telefono;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    //Getter
    public int getEdad (int edad){
        return edad;
    }
    public int getTelefono (int telefono){
        return telefono;
    }
    public String getNombre (String nombre){
        return nombre;
    }
}
