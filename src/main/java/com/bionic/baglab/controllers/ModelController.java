package com.bionic.baglab.controllers;

import com.bionic.baglab.dto.ModelSetDto;
import com.bionic.baglab.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;


/**
 * Created by nicot on 4/1/2017.
 */
@RestController
@RequestMapping("/models")
@Order(1)
//@RepositoryRestController
public class ModelController {

    @Autowired
    private ModelService modelService;

   @RequestMapping(value = "/{modelId}/delete", method = RequestMethod.POST)
    public ResponseEntity<?> delete(@PathVariable("modelId") long modelId) {
        ModelEntity model = modelDao.findOne(modelId);
        model.setDeleted(true);
        modelDao.save(model);
        return ResponseEntity.noContent().build();

    @RequestMapping(value = "/{userId}/models", method = RequestMethod.GET)
    @ResponseBody
    public ModelSetDto findAllModelsbyUserId(@PathVariable("userId") long userId){
        return new ModelSetDto(new HashSet<>(modelService.findAllModelsbyUserId(userId)));
    }

}
