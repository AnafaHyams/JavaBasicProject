package com.epam.common.services;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ObjectSaverImpl implements ObjectSaver {
    @SneakyThrows
    @Override
    public void save(Object obj, String locationDir) {
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        DirectoryPathGeneratorImpl.createDirectoryPath(locationDir);
        File file = new File(locationDir + "quote_" + timeStamp);
        file.createNewFile();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(obj);
    }
}
