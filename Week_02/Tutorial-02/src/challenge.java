public class challenge {
    public static void main(String[] args) {
        boolean birthdayroom[] = new boolean[365];
        int number_of_people = 0;
        while (true) {
            ++number_of_people;
            int day = (int) (365*Math.random());
            if (birthdayroom[day])
                break;
            else
                birthdayroom[day] = true;
        }
        System.out.println(number_of_people);
    }
}
