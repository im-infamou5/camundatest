package com.test.camundatest.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SampleTask implements JavaDelegate {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleTask.class);

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.debug("it works");
    }
}
