package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<Integer>();

        heap.insert(0);
        heap.insert(18);
        heap.insert(29);

        System.out.println(heap.extractMin());
        System.out.println(heap.getMin());
        System.out.println( heap.size());
        System.out.println( heap);

    }
}
public class Heap<T extends Comparable<T>> {
    private int index;
    private int size;
    private boolean min;
    private T [] heap ;
    public Heap() {
        heap = (T[]) new Comparable[index];
        min = true;
        size = 0;
    }
    public Heap(boolean min) {

        size = 0;
        this.min = min;
        heap = (T[]) new Comparable[index];
    }

    public boolean empty() {
        return size() == 0;
    }

    public int size (){
        return size;
    }

    public T getMin() {
        if (empty());
        return heap[0];
    }

    public T extractMin(){

        T result = getMin();

        swap(1, size);
        heap[size] = null;
        return result;
    }

    public void insert(T index) {
        index++;
        heap[size++] = index;
        if(size == (index+1)){
            System.out.println("Wrong");
        }

        private void swap(int parent, int child) {
            T temp = heap[parent];
            heap[parent] = heap[child];
            heap[child] = temp;
            child = parent;
            parent = (child - 1) / 2;
            this.swap(parent, child);
        }
    }
    private void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap);
        }
    }
