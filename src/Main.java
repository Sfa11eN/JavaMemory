import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Память в Java");
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();


    }

    public static void task5() {
        int value = 33;
        changeValue(value);
        System.out.println(value);
    }

    public static void changeValue(int value) {

        value = 22;
    }

    private static void task6() {
        Integer value = 33;
        changeValueInteger(value);
        System.out.println(value);
    }

    private static void changeValueInteger(Integer value) {
        value = 22;
    }

    private static void task7() {
        Integer[] value = {3, 4};
        changeValueArray(value);
        System.out.println(Arrays.toString(value));

    }

    private static void changeValueArray(Integer[] value) {
        value = new Integer[]{1, 2};
    }

    private static void task8() {
        Integer[] value = {3, 4};
        changeValueArray2(value);
        System.out.println(Arrays.toString(value));
    }

    private static void changeValueArray2(Integer[] value) {
        value[0] = 99;
    }

    private static void task9() {
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);

    }

    private static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
    }

    private static void task10() {
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson2(person);
        System.out.println(person);
    }

    private static void changePerson2(Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}