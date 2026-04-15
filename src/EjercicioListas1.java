import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EjercicioListas1 {
    public static void main(String[] args) {
        final var listaAlto = new ArrayList<String>();
        final var listaMedio = new ArrayList<String>();
        final var listaBajo = new ArrayList<String>();

        final var arrayNombre = crearArrayNombres();
        final var arrayImc = crearArrayImc();

        rellenarListasImc(listaAlto, listaMedio, listaBajo, arrayNombre, arrayImc);

        System.out.printf("Lista alto: %s%n", listaAlto);
        System.out.printf("Lista medio: %s%n", listaMedio);
        System.out.printf("Lista bajo: %s%n", listaBajo);
    }

    static String[] crearArrayNombres() {
        return new String[]{
                "Carlos","Antonio","Jorge","Ana","Mayra",
                "Julieta","Maria","Rodrigo","Anabel","Luz"
        };
    }

    // 🔥 MÉTODO CORREGIDO AQUÍ
    static double[] crearArrayImc() {
        return generarRandomDouble(10, 1, 50, new Random());
    }

    // 🔥 EL MÉTODO QUE TE FALTABA
    static double[] generarRandomDouble(int tam, int min, int max, Random random) {
        double[] array = new double[tam];

        for (int i = 0; i < tam; i++) {
            array[i] = min + (max - min) * random.nextDouble();
        }

        return array;
    }

    static void rellenarListasImc(
            List<String> listaAlto,
            List<String> listaMedio,
            List<String> listaBajo,
            String[] arrayNombre,
            double[] arrayImc
    ) {
        final var n = arrayImc.length;

        for (var i = 0; i < n; i++) {
            final var imc = arrayImc[i];
            final var nombre = arrayNombre[i];

            if (imc >= 40) {
                listaAlto.add(nombre);
            } else if (imc >= 25) {
                listaMedio.add(nombre);
            } else {
                listaBajo.add(nombre);
            }
        }
    }
}