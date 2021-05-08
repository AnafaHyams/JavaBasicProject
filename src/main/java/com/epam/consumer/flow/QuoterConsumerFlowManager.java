package com.epam.consumer.flow;

import com.epam.common.model.Quote;
import com.epam.common.services.ObjectSaver;
import com.epam.consumer.services.JsonSaver;
import com.epam.consumer.utils.JsonUtil;
import com.epam.producer.services.QuoterSaver;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class QuoterConsumerFlowManager {

    private JsonSaver saver;
    private JsonUtil jsonUtil;
    private ObjectSaver objectSaver;


    public void saveQuoteAsJson(Quote quote) {
        String jsonQuoteAsString = jsonUtil.makeJsonString(quote);
        saver.save(jsonQuoteAsString, objectSaver);
    }
}
