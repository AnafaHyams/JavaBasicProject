package com.epam.producer.services;

import com.epam.common.model.Quote;
import com.epam.common.services.ObjectSaver;

/**
 * @author Evgeny Borisov
 */
public interface QuoterSaver {
    void save(Quote quote, ObjectSaver objectSaver);
}
