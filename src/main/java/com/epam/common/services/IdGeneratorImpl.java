package com.epam.common.services;

/**
 * @author Evgeny Borisov
 */
public class IdGeneratorImpl implements IdGenerator {
    @Override
    public long getNewId() {
        return System.nanoTime();
    }
}
