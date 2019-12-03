package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        File fileName = new File("/Users/cmummery/Documents/Book1.csv");

        BufferedReader read = new BufferedReader(new FileReader(fileName));
        List line = new ArrayList();
        List tableLine = new ArrayList();
        String readLine;

        while((readLine = read.readLine()) !=null) {

            line.add(tableLine);

        }

        for (int i = 0; i < line.size(); i++) {
            tableLine.add(line.get(i));

        }
        System.out.println(line.get(1));


        //reading the csv file into a stream
//        try(Stream<String> stream = Files.lines(Paths.get(fileName))) {
//
//
//            stream.forEach(System.out::println);
//        }

    }
}