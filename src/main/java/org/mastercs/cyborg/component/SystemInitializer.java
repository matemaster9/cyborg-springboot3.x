package org.mastercs.cyborg.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * author: Syler
 * time: 2023/5/30 9:35
 */
@Component
public class SystemInitializer implements ApplicationRunner {

    private final Logger log = LoggerFactory.getLogger(SystemInitializer.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("命令行参数：{}", args.toString());
        log.info("SystemInitializer在SpringApplication#run执行完毕之前，完成系统初始化任务");
    }
}
