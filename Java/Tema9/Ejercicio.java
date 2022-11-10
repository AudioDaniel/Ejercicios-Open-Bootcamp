public class MyClass {
    public static void main(String args[]) {
        
        Cliente cliente = new Cliente();
        cliente.nombre = "Nerea" ;
        cliente.edad = 25;
        cliente.telefono = 98655555;
        cliente.credito = 50.1;
        
        System.out.println (cliente.nombre);
        System.out.println (cliente.edad);
        System.out.println (cliente.telefono);
        System.out.println (cliente.credito);
        
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "María";
        trabajador.edad = 26;
        trabajador.telefono = 9888888;
        trabajador.salario = 1000;
        
        System.out.println (trabajador.nombre);
        System.out.println (trabajador.edad);
        System.out.println (trabajador.telefono);
        System.out.println (trabajador.salario);
        
    }
}

class Persona {
        int edad;
        int telefono;
        String nombre;
     
}
class Cliente extends Persona{
    double credito;
}
class Trabajador extends Persona{
    double salario;
}
