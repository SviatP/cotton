package com.bionic.baglab.dto;

import com.bionic.baglab.domains.PagesEntity;
import com.bionic.baglab.domains.PagesTypeEntity;

import java.sql.Timestamp;

public class PagesDto {
    private int idnews;
    private String body;
    private String header;
    private Timestamp newsCreate;
    private Timestamp newsUpdate;
    private PagesTypeEntity pagesType;

    public PagesDto() {
    }

    public PagesDto(PagesEntity pagesEntity) {
        this.idnews = pagesEntity.getIdnews();
        this.body = pagesEntity.getBody();
        this.header = pagesEntity.getHeader();
        this.newsCreate = pagesEntity.getNewsCreate();
        this.newsUpdate = pagesEntity.getNewsUpdate();
        this.pagesType = pagesEntity.getPagesType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PagesDto)) return false;

        PagesDto pagesDto = (PagesDto) o;

        if (idnews != pagesDto.idnews) return false;
        if (header != null ? !header.equals(pagesDto.header) : pagesDto.header != null) return false;
        if (!newsCreate.equals(pagesDto.newsCreate)) return false;
        return newsUpdate.equals(pagesDto.newsUpdate) && pagesType.equals(pagesDto.pagesType);
    }

    @Override
    public int hashCode() {
        int result = idnews;
        result = 31 * result + (header != null ? header.hashCode() : 0);
        result = 31 * result + newsCreate.hashCode();
        result = 31 * result + newsUpdate.hashCode();
        result = 31 * result + pagesType.hashCode();
        return result;
    }
}
