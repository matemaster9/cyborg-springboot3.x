package org.mastercs.cyborg.diy;

import com.google.common.base.Throwables;
import org.mastercs.cyborg.component.SysLogger;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * author: Syler
 * time: 2023/5/29 10:48
 */
public class CyborgFailureAnalyzer extends AbstractFailureAnalyzer<RuntimeException> {

    public CyborgFailureAnalyzer() {
        super();
    }

    @Override
    public FailureAnalysis analyze(Throwable rootFailure, RuntimeException cause) {
        SysLogger.info("异常原因:{}", Throwables.getRootCause(cause).toString());
        return null;
    }
}
