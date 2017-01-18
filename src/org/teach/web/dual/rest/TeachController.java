package org.teach.web.dual.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.teach.web.dual.domain.DummyEntity;
import org.teach.web.dual.service.DummyService;

/**
 * Created by paul on 12/08/16.
 */
@Controller
public class TeachController {
    @Autowired
    private DummyService dummyService;

    @RequestMapping(path = "/dummy", method = RequestMethod.GET)
    public @ResponseBody
    DummyEntity getDummy() {
        return dummyService.getMain();
    }
}
