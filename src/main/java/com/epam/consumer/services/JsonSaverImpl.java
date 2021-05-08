package com.epam.consumer.services;

import com.epam.common.services.DirectoryPathGeneratorImpl;
import com.epam.common.services.ObjectSaver;
import com.epam.producer.services.InjectValue;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonSaverImpl implements JsonSaver {

    @InjectValue("consumer_output_location")
    private String locationDir;

    public JsonSaverImpl() {
    }


    @SneakyThrows
    @Override
    public void save(String jsonAsString, ObjectSaver objectSaver) {
        objectSaver.save(jsonAsString, locationDir);
//        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
//        DirectoryPathGeneratorImpl.createDirectoryPath(locationDir);
//        File file = new File(locationDir + "quote_" + timeStamp);
//        file.createNewFile();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
//        oos.writeObject(jsonAsString);
    }
}
