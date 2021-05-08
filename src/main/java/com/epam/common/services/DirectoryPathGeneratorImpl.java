package com.epam.common.services;

import com.epam.common.services.DirectoryPathGenerator;

import java.io.File;

public class DirectoryPathGeneratorImpl implements DirectoryPathGenerator {

    public static void createDirectoryPath(String dirPath) {
        File dir = new File(dirPath);

        if (!dir.exists()){
            dir.mkdirs();
        }
    }
}
