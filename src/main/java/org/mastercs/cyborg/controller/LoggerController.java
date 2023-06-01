package org.mastercs.cyborg.controller;

import org.mastercs.cyborg.component.SysLogger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * author: Syler
 * time: 2023/5/31 16:18
 */
@RestController
@RequestMapping("/logger")
public class LoggerController {

    @GetMapping("/log")
    public void get() {
        SysLogger.info(LocalDateTime.now());
        SysLogger.error(LocalDateTime.now());
        SysLogger.warn(LocalDateTime.now());
    }
}
