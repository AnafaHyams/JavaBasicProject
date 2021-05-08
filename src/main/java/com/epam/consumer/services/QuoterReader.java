package com.epam.consumer.services;

import com.epam.common.model.Quote;

import java.util.List;

public interface QuoterReader {

    List<Quote> readObjects();
}
