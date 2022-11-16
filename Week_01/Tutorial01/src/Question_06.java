import java.util.*;
public class Question_06 {
    static int[] storage = new int[6];
    public static void main(String[] args) {
        Random random_generator = new Random();
        int count = 0;
        while (count < 6) {
            int randomNumber = 1 + random_generator.nextInt(49);
            if (!isItAlreadyThere(randomNumber)) {
                storage[count] = randomNumber;
                ++count;
            }
        }
        for (int x: storage)
            System.out.println(x);
    }
    static boolean isItAlreadyThere(int x) {
        for (int e: storage) {
            if (e == x)
                return true;
        }
        return false;
    }
}


