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
}
