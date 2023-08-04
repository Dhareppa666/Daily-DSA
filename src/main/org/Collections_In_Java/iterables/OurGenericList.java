package org.Collections_In_Java.iterables;

import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T>{
    private T[] items;

    private int size;

    public OurGenericList () {
        this.size = 0;
        this.items = (T[]) new Object[100];
    }

    public void addItem (T item){
        this.items[size++] = item;
    }

    public T getItem (int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new OurIterator(this);
    }

    private class OurIterator implements Iterator<T> {

        private OurGenericList<T> list;

        private int index;

        public OurIterator(OurGenericList<T> list){
            this.list = list;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
