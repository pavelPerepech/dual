package org.teach.web.dual.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.teach.web.dual.domain.DummyEntity;
import org.teach.web.dual.service.DummyService;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * Created by paul on 12/08/16.
 */
@Component
public class SimpleDummyService implements DummyService {
    private static Logger LOG = LoggerFactory.getLogger(SimpleDummyService.class);

    @PostConstruct
    public void init() {
        LOG.info("SimpleDummyService is initialized...");
    }

    @Override
    public DummyEntity getMain() {
        DummyEntity res = new DummyEntity();
        res.setId(System.currentTimeMillis());
        res.setName((new Date(res.getId())).toString());
        return res;
    }
}
