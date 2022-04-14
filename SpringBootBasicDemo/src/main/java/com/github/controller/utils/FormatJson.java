package com.github.controller.utils;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author lxlan
 */
@Data
public class FormatJson {
    private Boolean flag;
    private Object data;
    private String message;

    public FormatJson() {
    }

    public FormatJson(Boolean flag) {
        this.flag = flag;
    }

    public FormatJson(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public FormatJson(Boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public FormatJson(String message) {
        this.flag = false;
        this.message = message;
    }
}
