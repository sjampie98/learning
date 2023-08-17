package com.hillel.course2.lesson6.homework;

import java.io.File;
import java.io.IOException;

public class FileOrder extends File {

    public FileOrder(String pathname) throws IOException {
        super(pathname);
        checkIfExistAndCreate();
    }

    public boolean checkIfExistAndCreate() throws IOException {
        if (!this.exists()) {
            try {
                this.createNewFile();
            } catch (IOException e) {
                System.out.println("Error : " + e.getMessage());
                checkIfExistAndCreate();
            }
        }
        return true;
    }
}
