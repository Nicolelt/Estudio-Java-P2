import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjercicioSets2 {
    public static void main(String[] args) {
        final var set1 = crearSetUtiles1();

        final var scanner = new Scanner(System.in);
        final var set2 = crearSetUtiles2(scanner);
        scanner.close();

        set1.removeAll(set2); // A-B y se guarda en el set1

        imprimirSet(set1);
    }
    static Set<String> crearSetUtiles1(){
        return new HashSet<>(Arrays.asList("Lapiz","cuadernos","lonchera","mochila",
                "goma","corrector","tijera"));

    }
    static Set<String>crearSetUtiles2(Scanner scanner){
        final var set = new HashSet<String>();
        String utilEscolar;//iterador
        do{
            utilEscolar=ScannerManager.leerString(scanner, "Ingrese util escolar");
            if (!utilEscolar.equals("salida")){
                set.add(utilEscolar);
            }
        }while(!utilEscolar.equals("salida"));
        return set;
    }
    static void imprimirSet(Set<String> set){
        System.out.printf("Los utiles faltantes para su 2do hijo son: %s%n", set);
    }
}
