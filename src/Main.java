public class Main {
    public static void main(String[] args) {
        MagicBox <String> boxOfString = new MagicBox<>(5);
        MagicBox <Number> boxOfNumber = new MagicBox<>(3);

        System.out.println(boxOfString.pick());
        boxOfNumber.add(1);
        boxOfNumber.add(2);
        boxOfNumber.add(3);

        System.out.println(boxOfNumber.add(4));

        System.out.println(boxOfNumber.pick());

    }
}
