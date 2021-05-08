package com.epam.producer.services;

import com.epam.common.model.Quote;
import com.epam.common.services.DirectoryPathGeneratorImpl;
import com.epam.common.services.ObjectSaver;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Evgeny Borisov
 */

public class QuoterSaverImpl implements QuoterSaver {

    @InjectValue("producer_output_location")
    private String locationDir;

    public QuoterSaverImpl() {
    }

    @SneakyThrows
    @Override
    public void save(Quote quote, ObjectSaver objectSaver) {
        objectSaver.save(quote, locationDir);
//        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
//        DirectoryPathGeneratorImpl.createDirectoryPath(locationDir);
//        File file = new File(locationDir + "quote_" + timeStamp);
//        file.createNewFile();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
//        oos.writeObject(quote);
    }
}
