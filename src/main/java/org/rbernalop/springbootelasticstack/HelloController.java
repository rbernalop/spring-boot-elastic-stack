package org.rbernalop.springbootelasticstack;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @GetMapping("/")
    public String hello() {
        log.info("User requested hello");
        return "Hello World!";
    }

    @GetMapping("/error")
    public String error() {
        log.error("User requested error");
        return "Error!";
    }

    @GetMapping("/warn")
    public String warn() {
        log.warn("User requested warn");
        return "Warn!";
    }

    @GetMapping("/debug")
    public String debug() {
        log.debug("User requested debug");
        return "Debug!";
    }
}
