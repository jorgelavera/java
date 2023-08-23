package clase_1;

public class NumeroFlotanteLavera {

  public static void main(String[] args) {
    // defino un número cualquiera que contenga decimales
    float numero1 = 25.33f;
    // calculo las partes entera y decimal
    int parteEntera = (int) numero1 ;
    float parteDecimal = numero1 - parteEntera;
    // muestro los resultados en la consola
    System.out.println("Parte entera: " + parteEntera);
    System.out.println("Parte decimal: " + parteDecimal);
  }
}
