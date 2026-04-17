import java.util.Map;
import java.util.Scanner;

public class EjercicioMaps1 {
    public static void main(String[] args) {
        final var mapUusario = crearMap();
        final var scanner = new Scanner(System.in);

        int idLeido;
        System.out.printf("Escriba un id del 1 al 6, presione -1 para salir");

        do{
            idLeido = ScannerManager.leerInt(scanner, "Ingrese el id deseado");
            if (idLeido != -1){
                mostrarUsuario(mapUusario, idLeido);
            }
        }while (idLeido != -1);

        scanner.close();
    }
    static Map<Integer, String> crearMap(){
        return Map.of(
                1, "Melman",
                2,"Marty",
                3, "Alex",
                4, "Gloria"
        );
    }
    static void mostrarUsuario(Map<Integer, String> mapUsuario, int id){
        if (mapUsuario.containsKey(id)){
            System.out.printf("Para el ID %d existe un username %s%n", id, mapUsuario.get(id));
        }else {
            System.out.printf("ID %d no encontrado en la base de datos%n", id);

        }
    }
}
