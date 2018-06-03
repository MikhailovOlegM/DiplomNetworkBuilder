package mikhailov.diplom.ae.NetworkBuilderApp.controllers;

import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/generate")
public class Main {

    private static final Logger logger = Logger
            .getLogger(Main.class.getName());

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public ModelAndView index(@RequestParam(value = "name") String name) {
//        Map<String, String> model = new HashMap<>();
//        model.put("name", name);
//        return new ModelAndView("hello", model);
//    }

//    @RequestMapping(value = "/page", method = RequestMethod.GET)
//    public ModelAndView page() {
//        return new ModelAndView("places");
//    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public
    @ResponseBody
    String saveElement(@RequestBody String element) {
        System.out.println(element);
        String responseStructure = null;

        responseStructure = ParserJSON.refactorString(element);

        return responseStructure;
    }

}
