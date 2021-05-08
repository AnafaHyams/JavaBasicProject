package com.epam.consumer.services;

import com.epam.common.services.ObjectSaver;
import com.epam.producer.services.InjectValue;
import lombok.SneakyThrows;

public class JsonSaverImpl implements JsonSaver {

    @InjectValue("consumer_output_location")
    private String locationDir;

    public JsonSaverImpl() {
    }


    @SneakyThrows
    @Override
    public void save(String jsonAsString, ObjectSaver objectSaver) {
        objectSaver.save(jsonAsString, locationDir);
    }
}
