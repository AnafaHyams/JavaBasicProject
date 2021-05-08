package com.epam.producer.services;

import java.io.File;

public class DirectoryPathGeneratorImpl implements DirectoryPathGenerator{

    public static void createDirectoryPath(String dirPath) {
        File dir = new File(dirPath);

        if (!dir.exists()){
            dir.mkdirs();
        }
    }
}
