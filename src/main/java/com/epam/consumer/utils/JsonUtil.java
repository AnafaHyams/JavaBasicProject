package com.epam.consumer.utils;

import com.epam.common.model.Quote;
import com.epam.consumer.services.JsonMapper;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JsonUtil {
    private JsonMapper jsonMapper;

    public String makeJsonString(Quote quote) {
        String objectAsJson = jsonMapper.convertToJson(quote);
        System.out.println(objectAsJson);

        return objectAsJson;
    }
}
