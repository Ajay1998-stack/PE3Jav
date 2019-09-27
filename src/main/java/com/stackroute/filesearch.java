package com.stackroute;
import java.io.File;


public class filesearch {
        private static final String PATH = "src/main/java/com/stackroute";
        public static void main(String[] args) {
            File directory = new File(PATH);
            File[] fileList = directory.listFiles((dir, name) -> name.endsWith(".java"));
            for (File file : fileList) System.out.println(file.getName());
        }
}

