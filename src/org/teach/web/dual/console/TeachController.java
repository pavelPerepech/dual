package org.teach.web.dual.console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.teach.web.dual.domain.DummyEntity;
import org.teach.web.dual.service.DummyService;

/**
 * Created by paul on 12/08/16.
 */
@Controller
public class TeachController {
    @Autowired
    private DummyService dummyService;


    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getIndex() {
        return "redirect:index";
    }

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String getDummy(ModelMap model) {
        model.addAttribute("dummyObject", dummyService.getMain());
        model.addAttribute("x", "XXX");
        model.put("x", "XXX1");

        return "dummy";
    }
}
