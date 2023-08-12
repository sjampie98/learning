package com.hillel.course2.lesson3.homework;

public class MyArrayList implements MyArrayListInterface {

    private String[] arrays;

    public MyArrayList() {
        this.arrays = new String[]{};
    }

    @Override
    public String get(int index) {
        return this.arrays[index];
    }

    @Override
    public void set(int index, String string) {
        if (this.arrays.length <= index) {
            this.arrays = copyOf(this.arrays, index);
        }
        this.arrays[index] = string;
    }

    @Override
    public void remove(int index) {
        this.arrays[index] = null;
        String[] string = new String[this.arrays.length - 1];
        for (int i = 0; i < this.arrays.length - 1; i++) {
            if (i >= index) {
                string[i] = this.arrays[i + 1];
                continue;
            }
            string[i] = this.arrays[i];
        }
        this.arrays = string;
    }

    @Override
    public void add(int index, String string) {
        if (this.arrays.length - 1 < index) {
            this.arrays = copyOf(this.arrays, index);
            this.arrays[index] = string;
            return;
        }

        this.arrays = copyOf(this.arrays, this.arrays.length);
        for (int i = this.arrays.length - 1; i >= index; i--) {
            this.arrays[i] = this.arrays[i - 1];
        }
        this.arrays[index] = string;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i <= this.arrays.length - 1; i++) {
            if (i == 0) {
                result += "[";
                continue;
            } else if (i == this.arrays.length - 1) {
                result += this.arrays[i] + "]";
                continue;
            }
            result += this.arrays[i] + ", ";
        }
        return result;
    }

    private String[] copyOf(String[] array, int index) {
        String[] string = new String[index + 1];
        for (int i = 0; i < array.length; i++) {
            string[i] = array[i];
        }
        return string;
    }
}
