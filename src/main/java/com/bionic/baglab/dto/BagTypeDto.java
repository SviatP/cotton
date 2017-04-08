package com.bionic.baglab.dto;

import io.swagger.annotations.ApiModel;

@ApiModel
public class BagTypeDto {
    private String script;
    private Integer price;

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
