package haihuanguser.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HaihuangController {
    private static Logger logger = Logger.getLogger(HaihuangController.class);

    @RequestMapping("")
    public String index() {
        return "index";
    }



}
