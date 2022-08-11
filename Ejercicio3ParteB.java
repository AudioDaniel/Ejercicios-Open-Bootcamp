//Creamos la clase coche y la función SumarPuertas
class coche {
    public int puertas = 4;
    
    public void SumarPuertas() {
        this.puertas++;
    }
}

//Creamos el objeto miCoche y realizamos la función SumarPuertas en el
public class Main  {
    public static void main(String[] args) {
    coche miCoche = new coche();
    
    miCoche.SumarPuertas();
 //Mostramos el número de puertas que tiene el objeto miCoche tras la suma   
    System.out.println(miCoche.puertas);
    }
}

