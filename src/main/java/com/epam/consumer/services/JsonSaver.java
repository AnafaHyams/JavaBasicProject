package com.epam.consumer.services;

import com.epam.common.services.ObjectSaver;

public interface JsonSaver {
    void save(String jsonAsString, ObjectSaver objectSaver);
}
