import java.util.Random;

public class RandomUtilities {

    // ✔ genera UN número
    static int generarRandomInt(int min, int max, Random random) {
        return random.nextInt(max - min + 1) + min;
    }

    // ✔ genera UN array
    static int[] generarRandomInt(int tam, int min, int max, Random random) {
        int[] array = new int[tam];

        for (int i = 0; i < tam; i++) {
            array[i] = generarRandomInt(min, max, random);
        }

        return array;
    }

    static double generarRandomDouble(int min, int max, Random random) {
        return (max - min) * random.nextDouble() + min;
    }
}