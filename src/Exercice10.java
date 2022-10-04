import javax.naming.LimitExceededException;

public class Exercice10 {
    public static void main(String[] args) {
        char[] array = {'A', 'B', 'B', 'C', 'D', 'A', 'D', 'C', 'D' };
        int counter, freq = 0;
        char candidate = array[0];

        for (int i = 0; i < array.length; i++) {
            counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    counter++;
                }
            }
            if (counter > freq) {
                candidate = array[i];
                freq = counter;
            }
        }
        System.out.println(candidate);
        System.out.println(freq);

    }
}