package com.epam.producer.flow;

import com.epam.common.model.Quote;
import com.epam.common.services.ObjectSaver;
import com.epam.producer.services.QuoteProducer;
import com.epam.producer.services.QuoterSaver;
import lombok.AllArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public class QuoterProducerFlowManager {
    private QuoteProducer producer;
    private QuoterSaver saver;
    private ObjectSaver objectSaver;

    public void saveQuote() {
        Quote quote = producer.generate();
        saver.save(quote, objectSaver);
    }

}
