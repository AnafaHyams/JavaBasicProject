package com.epam.consumer.flow;

import com.epam.common.model.Quote;
import com.epam.consumer.services.JsonSaver;
import com.epam.consumer.utils.JsonUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class QuoterConsumerFlowManager {

    private JsonSaver saver;
    private JsonUtil jsonUtil;


    public void saveQuoteAsJson(Quote quote) {
        String jsonQuoteAsString = jsonUtil.makeJsonString(quote);
        saver.save(jsonQuoteAsString);
    }
}
