package com.springbatch.skipfirstline.handler;

import org.springframework.batch.item.file.LineCallbackHandler;
import org.springframework.stereotype.Component;

@Component
public class SkipRecordCallback implements LineCallbackHandler {

    @Override
    public void handleLine(String s) {
        System.out.println("First Record\n"+s);
    }
}
