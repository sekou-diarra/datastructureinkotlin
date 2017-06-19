package stackArray;

/**
 * Created by sekou_diarra on 19/06/17.
 */
public class Stack<T> {

    private T[] stack;
    private int numOfItems;

    public Stack() {
        this.stack = (T[]) new Object[1];

    }

    //O(1) si pas de redimensionnement
    public void push(T newData) {
        if (numOfItems == this.stack.length) {
            resize(2 * this.stack.length);
        }

        this.stack[numOfItems++] = newData;
    }

    //O(1) si pas de redimensionnement
    public T pop() {
        T itemToPop = this.stack[--numOfItems];

        //si la capacité est à 25% on redimensionne le tableau, avec la moitié de sa taille
        if (numOfItems > 0 && numOfItems == this.stack.length / 4) {
            resize(this.stack.length / 2);
        }
        return itemToPop;
    }

    public boolean isEmpty() {
        return this.numOfItems == 0;
    }

    public int size() {
        return this.numOfItems;
    }

    //O(N) linear time complexity
    private void resize(int capacity) {
        T[] stackCopy = ((T[]) new Object[capacity]);

        for (int i = 0; i < numOfItems; i++)
            stackCopy[i] = this.stack[i];


        this.stack = stackCopy;

    }
}
