public class MyClass {


        // Definimos la función "Suma" que realiza la suma de las integrales a + b + c
    
    public static int Suma(int a,int b,int c) {
        return a + b + c;
        
    }    
    
 public static void main(String[] args) {
        
        // Llamamos a la función en el main y le damos los valores a=10 b=20 y c=30
        
      int resultado = Suma(10,20,30);
      
        //Impresión en consola del resultado
      
      System.out.println(resultado);
      
    }
}