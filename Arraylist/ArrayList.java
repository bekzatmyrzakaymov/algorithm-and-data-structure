package com.company.Arraylist;

public class ArrayList<T> {
    private Object[] array;
    private int size=0;
    private int capacity=5;

    public ArrayList(){
        array=new Object[capacity];
    }

    public T get(int index){
        return (T) array[index];
    }

    public void add(T newItem){
        if(size==capacity){
            increaseBuffer();
        }

        array[size++]=newItem;
    }
                //Method 1
    public void addWithElement(T newItem, int index) {
        Object[] array1 = new Object[array.length+1];
        for (int i = 0; i < index; i++) {
            array1[i] = array[i];
        }
        array1[index]=newItem;
        for(int i=index; i<array.length; i++)
            array1[i+1]=array[i];
        array=array1;
    }
    //Method 2
    public int find(T keyItem) {

        for (int i = 0; i < array.length; i++){
            if (array[i] == keyItem) {
                return i + 1;
            }
        }
        return -1;
    }

    //Method 3
    public T remove(int index) {
        Object[] arr = new Object[array.length - 1];
        for (int i = 0; i < array.length; ++i) {
            if(i<index)
                arr[i]=array[i];
            if(i>index)
                arr[i-1]=array[i];
        }
        array = arr;
        return null;
    }

    //Method 4
    public void reverse(){
        int i=0;
        while (i<array.length/2) {
            int temp = (int) array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
            i++;
        }
    }


    private void increaseBuffer(){
        capacity = (int) (1.5*capacity);
        Object[] array2=new Object[capacity];
        for(int i =0; i<size; i++){
            array2[i]=array[i];
        }

        array=array2;

    }

    public int getSize() {
        return size;
    }

    public boolean hasItem(T item){
        int current = 0;

        while(current<size){
            if(array[current].equals(item))
                return true;

            current++;
        }

        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Arraylist operation: ");

        System.out.println("Add elements: ");
        for(int i=0; i<4; i++){
            list.add(i);
        }

        for(int i=0; i< list.getSize(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        System.out.println("Add With element:");
        list.addWithElement(2,1);
        for(int i=0; i< list.getSize(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        System.out.println("Find index of element: ");
        System.out.println("index:" +list.find(3));

        System.out.println("Remove element by index: ");
        list.remove(3);
        for(int i=0; i< list.getSize(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        System.out.println("Reverse: ");
        list.reverse();
        for(int i=0; i< list.getSize(); i++){
            System.out.print(list.get(i) + " " );
        }
    }

}
