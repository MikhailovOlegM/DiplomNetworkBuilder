package mikhailov.diplom.ae.NetworkBuilderApp.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/test")
public class Main {

    private static final Logger logger = Logger
            .getLogger(Main.class.getName());

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView index(@RequestParam(value = "name") String name) {
        Map<String, String> model = new HashMap<>();
        model.put("name", name);
        return new ModelAndView("hello", model);
    }

}
