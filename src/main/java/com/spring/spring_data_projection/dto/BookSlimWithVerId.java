package com.spring.spring_data_projection.dto;

public interface BookSlimWithVerId {
    Long getId();

    String getTitle();

    String getVerboseCode();

    //@Value("#{target.id.toString() + ' ' + target.verboseCode}")
    //String getVerId();

    default String getVerId() {
        return getId().toString().concat(" ").concat(getVerboseCode());
    }
}
