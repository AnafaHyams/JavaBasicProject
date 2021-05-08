package com.epam.consumer;

import com.epam.common.model.Quote;
import com.epam.consumer.flow.QuoterConsumerFlowManager;
import com.epam.consumer.services.QuoterReader;
import com.epam.consumer.services.QuoterReaderImpl;
import com.epam.infra.ApplicationContext;
import com.epam.infra.JavaConfig;
import lombok.SneakyThrows;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainConsumer {
    @SneakyThrows
    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext(JavaConfig.builder().packagesToScan("com.epam").build());
        QuoterConsumerFlowManager flowManager = context.getObject(QuoterConsumerFlowManager.class);
        QuoterReader quoterReader = context.getObject(QuoterReaderImpl.class);
        /*
        while(true) {
            flowManager.saveQuoteAsJson();
            delayXSec();
        }
*/
        List<Quote> quotesList = quoterReader.readObjects();

        for (Quote quote : quotesList) {
            flowManager.saveQuoteAsJson(quote);
            delayXSec();
        }
    }

    private static void delayXSec() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
    }
}
