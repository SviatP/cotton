package com.bionic.baglab.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;

@ApiModel
public class BagTypeDto {
    private String script;

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

}
