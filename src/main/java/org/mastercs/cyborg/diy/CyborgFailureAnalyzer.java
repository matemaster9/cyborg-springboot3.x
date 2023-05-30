package org.mastercs.cyborg.diy;

import com.google.common.base.Throwables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * author: Syler
 * time: 2023/5/29 10:48
 */
public class CyborgFailureAnalyzer extends AbstractFailureAnalyzer<RuntimeException> {

    private static final Logger log = LoggerFactory.getLogger(CyborgFailureAnalyzer.class);

    public CyborgFailureAnalyzer() {
        super();
    }

    @Override
    public FailureAnalysis analyze(Throwable rootFailure, RuntimeException cause) {
        log.info("异常原因:{}", Throwables.getRootCause(cause).toString());
        return null;
    }
}
