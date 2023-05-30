package org.mastercs.cyborg.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SysLogger {

    private static final Logger log = LoggerFactory.getLogger(SysLogger.class);

    private SysLogger() {
    }

    public static void info(Object arg) {
        log.info(String.valueOf(arg));
    }

    public static void info(String msg, Object arg) {
        log.info(msg, arg);
    }

    public static void info(String msg, Object... args) {
        log.info(msg, args);
    }
}
