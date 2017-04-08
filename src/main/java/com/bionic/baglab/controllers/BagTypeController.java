package com.bionic.baglab.controllers;

import com.bionic.baglab.dao.BagTypeDao;
import com.bionic.baglab.dao.BagTypePriceDao;
import com.bionic.baglab.domains.BagTypeEntity;
import com.bionic.baglab.domains.BagTypePriceEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import org.hibernate.type.BagType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Api
@RestController
public class BagTypeController {
    @Autowired
    private BagTypeDao bagTypeDao;
@Autowired
private BagTypePriceDao bagTypePriceDao;
    /**
     *
     * @return List of bag types
     */
    @GetMapping(value = "/bag_type/list") //
    public ResponseEntity<List<BagTypeEntity>> listBagTypes(){
        List<BagTypeEntity> bagTypeEntityList = bagTypeDao.findExistent();
        return new ResponseEntity<>(bagTypeEntityList, HttpStatus.OK);
    }

    /**
     * Add new bag type
     */
//    @GetMapping(value = "/bag_type/add")
//    public ResponseEntity<?> addBagType(@RequestParam("script") String script,
//                                        @RequestParam("price") Integer price) {
//
//        BagTypeEntity bagTypeEntity = new BagTypeEntity();
//        bagTypeEntity.setScript(script);
//        List<BagTypePriceEntity> priceEntities = bagTypeEntity.getPriceEntities();
//        bagTypeEntity.setPriceEntities(priceEntities);
//        bagTypeDao.save(bagTypeEntity);
//
//        BagTypePriceEntity priceEntity = new BagTypePriceEntity();
//        priceEntity.setDate(Timestamp.valueOf(LocalDateTime.now()));
//        priceEntity.setBagTypeId(bagTypeEntity.getIdBagType());
//        priceEntity.setPrice(price);
//        bagTypePriceDao.save(priceEntity);
//
//        return ResponseEntity.noContent().build();
//    }

    @PostMapping(value = "/bag_type/add")
    @ResponseBody
    public void addBagTypePost(@PathVariable String script,
                               @PathVariable int price) {
        BagTypeEntity bagTypeEntity = new BagTypeEntity();
        bagTypeEntity.setScript(script);
        List<BagTypePriceEntity> priceEntities = bagTypeEntity.getPriceEntities();
        bagTypeEntity.setPriceEntities(priceEntities);
        bagTypeDao.save(bagTypeEntity);

        BagTypePriceEntity priceEntity = new BagTypePriceEntity();
        priceEntity.setDate(Timestamp.valueOf(LocalDateTime.now()));
        priceEntity.setBagTypeId(bagTypeEntity.getIdBagType());
        priceEntity.setPrice(price);
        bagTypePriceDao.save(priceEntity);

        bagTypeEntity.getPriceEntities().add(priceEntity);
        bagTypeDao.save(bagTypeEntity);
    }
}

