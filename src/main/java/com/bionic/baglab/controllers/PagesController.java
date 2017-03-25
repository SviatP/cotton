package com.bionic.baglab.controllers;

import com.bionic.baglab.dao.PagesDao;
import com.bionic.baglab.domains.PagesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by username on 3/21/17.
 */

@RestController
public class PagesController {

    @Autowired
    private PagesDao pagesDaoRepo;

    @RequestMapping("/pages")
    public Set<PagesEntity> showPages(){
        HashSet<PagesEntity> pagesSet = null;
        try {
            pagesSet = new HashSet<PagesEntity>((List<PagesEntity>)pagesDaoRepo.findAll());
        }
        catch (Exception ex){
            System.out.println("error, no pages found: " + ex); //todo: logging
        }
        return  pagesSet;
    }

}
