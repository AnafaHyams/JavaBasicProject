package com.epam.consumer.flow;

import com.epam.common.model.Quote;
import com.epam.common.services.ObjectSaver;
import com.epam.consumer.services.JsonSaver;
import com.epam.consumer.services.QuoterReader;
import com.epam.consumer.utils.JsonUtil;
import com.epam.producer.services.InjectValue;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.List;

@AllArgsConstructor
public class QuoterConsumerFlowManager {

    @InjectValue("milliseconds_delay")
    private static String millisecondsDelay;

    private JsonSaver saver;
    private JsonUtil jsonUtil;
    private ObjectSaver objectSaver;
    private QuoterReader quoterReader;


    @SneakyThrows
    public void saveQuoteFilesAsJson() {
        List<Quote> quotesList = quoterReader.readObjects();

        for (Quote quote : quotesList) {
            String jsonQuoteAsString = jsonUtil.makeJsonString(quote);
            saver.save(jsonQuoteAsString, objectSaver);
        }

        Thread.sleep(Long.parseLong(millisecondsDelay));
    }
}
