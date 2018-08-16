package com.ruoyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author Rimon
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan("com.ruoyi.project.*.*.mapper")
public class Application
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(Application.class, args);
        System.out.println("  ____    _____      _      ____    _____     ____    _   _    ____    ____   _____   ____    ____      _   _   _ \n" +
                " / ___|  |_   _|    / \\    |  _ \\  |_   _|   / ___|  | | | |  / ___|  / ___| | ____| / ___|  / ___|    | | | | | |\n" +
                " \\___ \\    | |     / _ \\   | |_) |   | |     \\___ \\  | | | | | |     | |     |  _|   \\___ \\  \\___ \\    | | | | | |\n" +
                "  ___) |   | |    / ___ \\  |  _ <    | |      ___) | | |_| | | |___  | |___  | |___   ___) |  ___) |   |_| |_| |_|\n" +
                " |____/    |_|   /_/   \\_\\ |_| \\_\\   |_|     |____/   \\___/   \\____|  \\____| |_____| |____/  |____/    (_) (_) (_)\n" +
                "                                                                                                                  ");
    }
}