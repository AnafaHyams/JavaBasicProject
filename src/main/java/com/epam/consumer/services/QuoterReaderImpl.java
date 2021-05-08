package com.epam.consumer.services;

import com.epam.common.model.Quote;
import com.epam.producer.services.InjectValue;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class QuoterReaderImpl implements QuoterReader {

    @InjectValue("consumer_input_location")
    private String locationDir;


    @SneakyThrows
    @Override
    public List<Quote> readObjects(){
        File dir = new File(locationDir);
        List<Quote> quotesList = new ArrayList<>();

        if (dir.exists()){
            if(dir.isDirectory()) {
                File[] files = dir.listFiles();

                for(File file : files) {
                    FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream oos = new ObjectInputStream(fis);

                    Quote quote = (Quote) oos.readObject();

                    quotesList.add(quote);

                    fis.close();
                    oos.close();
                }
            }
        }

        return quotesList;
    }
}
