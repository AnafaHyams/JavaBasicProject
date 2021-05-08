package com.epam.producer.services;

import com.epam.common.model.Quote;
import com.epam.common.services.ObjectSaver;
import lombok.SneakyThrows;

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
    }
}
