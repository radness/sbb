package com.example.sbb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    public void log() {
        logger.trace("Trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }
}
