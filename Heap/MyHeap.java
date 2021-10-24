package com.company.Heap;

public class MyHeap<T> {
    private final int[] MyHeap;
    private int size;

    public MyHeap(){
        int capacity = 20;
        MyHeap=new int[capacity];
    }
    //Method 1
    public boolean empty(){
        return size() == 0;
    }

    //Method 2
    public int size() {
        return size;
    }

    //Method 3
    public int getMax(){
        return get(0);
    }

    //Method 4
    public void extractMax() {
        MyHeap[0] = MyHeap[size--];
        heapify(0);
    }

    private void heapify(int index){
        if (MyHeap[index] < MyHeap[leftChild(index)]
                || MyHeap[index] < MyHeap[rightChild(index)]) {

            if (MyHeap[leftChild(index)] <= MyHeap[rightChild(index)]) {
                swap(index, rightChild(index));
                heapify(rightChild(index));
            }

            swap(index, leftChild(index));
            heapify(leftChild(index));
        }
    }

    //Method 5
    public void insert(int newItem) {
        MyHeap[++size] = newItem;
        int current = size;
        while (MyHeap[current] > MyHeap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    private void swap(int index1, int index2) {
        int temp = MyHeap[index1];
        MyHeap[index1] = MyHeap[index2];
        MyHeap[index2] = temp;
    }

    public int get(int index){
        return  MyHeap[index];
    }

    private int parent(int index) {
        return index / 2;
    }

    private int leftChild(int index){
        return 2*index;
    }

    private int rightChild(int index){
        return 2*index+1;
    }


    public static void main(String[] args) {
        MyHeap<Integer> heap = new MyHeap<>();
        System.out.println("Heap operation: ");
        System.out.println("Add elements: ");
        heap.insert(6);
        heap.insert(9);
        heap.insert(13);
        heap.insert(20);
        heap.insert(15);
        heap.insert(7);
        heap.insert(8);

        for(int i =0; i< heap.size(); i++) {
            System.out.print(heap.get(i) + " ");
        }

        System.out.println();
        System.out.print("Maximum element: ");
        System.out.println(heap.getMax());


        System.out.print("Extract Max: ");
        heap.extractMax();
        for(int i =0; i< heap.size(); i++){
            System.out.print(heap.get(i) + " ");
        }

        System.out.println();
        System.out.print("Size of heap: ");
        System.out.println(heap.size());

        System.out.print("Check is it empty or not: ");
        System.out.println(heap.empty());
    }

}
