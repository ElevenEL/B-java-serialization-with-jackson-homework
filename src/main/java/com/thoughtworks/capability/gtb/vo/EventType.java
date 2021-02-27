package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EventType {
    UPLOAD("U"), DOWNLOAD("D");

    private final String code;

    EventType(String code) {
        this.code = code;
    }

    @JsonValue
    public String getOrdinal() {
        return code;
    }
}
