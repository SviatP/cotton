package com.bionic.baglab.controllers;

import com.bionic.baglab.domains.ModelEntity;
import com.bionic.baglab.dto.ModelSetDto;
import com.bionic.baglab.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
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

   @RequestMapping(value = "/{modelId}/delete", method = RequestMethod.GET) //TODO change to POST method
    public ResponseEntity<?> delete(@PathVariable("modelId") long modelId) {
       ModelEntity model = modelService.findOne(modelId);
       model.setDeleted(true);
       modelService.save(model);
       return ResponseEntity.noContent().build();
   }

   @RequestMapping(value = "/{modelId}/save", method = RequestMethod.GET) //TODO change to POST method
   public void saveModel (ModelEntity newModel) {
       modelService.save(newModel);
   }

    @RequestMapping(value = "/{userId}/models", method = RequestMethod.GET)
    @ResponseBody
    public ModelSetDto findAllModelsByUserId(@PathVariable("userId") long userId){
        return new ModelSetDto(new HashSet<>(modelService.findAllModelsbyUserId(userId)));
    }

}
