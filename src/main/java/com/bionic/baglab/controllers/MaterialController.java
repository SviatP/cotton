package com.bionic.baglab.controllers;

import com.bionic.baglab.dao.MaterialDao;
import com.bionic.baglab.dao.MaterialPriceDao;
import com.bionic.baglab.domains.MaterialEntity;
import com.bionic.baglab.domains.MaterialPriceEntity;
import com.bionic.baglab.dto.MaterialDto;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class MaterialController {
    @Autowired
    private MaterialDao materialDao;

    @Autowired
    MaterialPriceDao materialPriceDao;

    /**
     * @return List of materials
     */
    @GetMapping(value = "/material/list") //
    public ResponseEntity<List<MaterialEntity>> listBagTypes() {
        List<MaterialEntity> materialEntityList = materialDao.findExistent();
        return new ResponseEntity<>(materialEntityList, HttpStatus.OK);
    }

    @PostMapping(value = "/material/change_price")
    @ResponseBody
    public ResponseEntity<?> changePrice(@PathVariable long id,
                                         @PathVariable int newPrice) {
        MaterialEntity bag = materialDao.findOne(id);
        MaterialPriceEntity price = new MaterialPriceEntity();
        price.setPrice(newPrice);
        price.setMaterialId(id);
        price.setDate(Timestamp.valueOf(LocalDateTime.now()));
        List<MaterialPriceEntity> priceEntities = bag.getPriceEntities();
        priceEntities.add(price);
        materialDao.save(bag);
        materialPriceDao.save(price);
        return ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/material/add")
    public ResponseEntity<?> addMaterial(@ApiParam @RequestBody MaterialDto materialDto) {
        MaterialEntity materialEntity = new MaterialEntity();
        materialEntity.setName(materialDto.getName());
        materialDao.save(materialEntity);

        MaterialPriceEntity priceEntity = new MaterialPriceEntity();
        priceEntity.setDate(Timestamp.valueOf(LocalDateTime.now()));
        priceEntity.setMaterialId(materialEntity.getIdmaterial());
        priceEntity.setPrice(materialDto.getPrice());
        materialPriceDao.save(priceEntity);

        return ResponseEntity.noContent().build();
    }
}
