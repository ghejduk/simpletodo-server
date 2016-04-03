package pl.ghejduk.application.task;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskList {

    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public String hello() {
        return "Kiss my ass";
    }
}
