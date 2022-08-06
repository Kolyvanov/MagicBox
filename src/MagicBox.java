import java.util.Random;

public class MagicBox<T> {
    protected int sizeBox;
    protected T[] items;

    public MagicBox(int sizeBox) {
        this.sizeBox = sizeBox;
        items = (T[]) new Object[sizeBox];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        Random random = new Random();
        int n = 0; // счётчик пустых ячеек массива items
        for (T item : items) {
            if (item == null) {
                n++;
            }
        }
        if (n != 0) {
            throw new RuntimeException("Волщебная коробка ещё не заполнена. Осталось " + n + " мест");
        }
        int randomInt = random.nextInt(sizeBox);
        return items[randomInt];
    }
}
