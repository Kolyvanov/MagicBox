public class Main {
    public static void main(String[] args) {
        MagicBox <String> boxOfString = new MagicBox<>(7);
        MagicBox <Number> boxOfNumber = new MagicBox<>(3);

        System.out.println(boxOfNumber.add(1));//кладём числа в коробку
        System.out.println(boxOfNumber.add(2));
        System.out.println(boxOfNumber.add(3));
        System.out.println(boxOfNumber.add(4));//попытка положить в числовую коробку предмет сверх её размера

        System.out.println(boxOfNumber.pick()); //выбор случайного числа из коробки с числами
        System.out.println(boxOfNumber.pick());
        System.out.println(boxOfNumber.pick());
        System.out.println(boxOfNumber.pick());
        System.out.println(boxOfNumber.pick());

        System.out.println(boxOfString.add("Енисей"));// кладём строковые данные в коробку со строками
        System.out.println(boxOfString.add("Лена"));
        System.out.println(boxOfString.add("Кама"));
        System.out.println(boxOfString.add("Амур"));
        System.out.println(boxOfString.add("Хопёр"));
        System.out.println(boxOfString.add("долото"));

        System.out.println(boxOfString.pick());// пытаемся выбрать случайный строковый элемент при незаполненной коробке

    }
}
