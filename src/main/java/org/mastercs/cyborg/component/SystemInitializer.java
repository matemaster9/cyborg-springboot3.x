package org.mastercs.cyborg.component;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * author: Syler
 * time: 2023/5/30 9:35
 */
@Component
public class SystemInitializer implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        SysLogger.info("命令行参数：{}", args.toString());
        SysLogger.info("SystemInitializer在SpringApplication#run执行完毕之前，完成系统初始化任务");
    }
}
