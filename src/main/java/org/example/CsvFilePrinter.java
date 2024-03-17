package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;
import java.nio.file.Paths;

public class CsvFilePrinter {
    private String fileName;

    public CsvFilePrinter(String fileName){
        this.fileName = fileName;
        try {
            clearFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clearFile() throws IOException {
        File file = new File(Paths.get(fileName).toUri());
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
    }

    public void log(double x, double y) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(fileName, true))) {
            printWriter.printf("%s, %s\n", x, y);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}