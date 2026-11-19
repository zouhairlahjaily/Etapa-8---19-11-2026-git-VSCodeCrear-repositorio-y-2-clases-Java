import java.util.Scanner;
public class Etapa8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase o palabra: ");
        String frase = teclado.nextLine();
        System.out.println("Elige una opción: ");
        System.out.println("1. Convertir a mayúsculas");
        System.out.println("2. Convertir a minúsculas");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(Mayuscula.ConvertirAMayusculas(frase));
                break;
            case 2:
                System.out.println(Minuscula.ConvertirAMinusculas(frase));
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}