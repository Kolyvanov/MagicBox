public class MagicBox <T>{
    protected int sizeBox;
    protected T [] items;

    public MagicBox (int sizeBox) {
        this.sizeBox = sizeBox;
        items = (T[]) new Object[sizeBox];
    }

    
}
