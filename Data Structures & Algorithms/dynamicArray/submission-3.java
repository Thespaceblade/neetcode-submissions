class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;


    public DynamicArray(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity){
            resize();
        }
        arr[size] = n;
        size++;

    }

    public int popback() {
        int val = arr[size - 1];
        size --;
        return val;

    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        System.arraycopy(arr,0, newArr, 0, size);
        arr = newArr;
    }

    public int getSize() {
        return size;

    }

    public int getCapacity() {
        return capacity;

    }
}
