package com.github.dao;

import lombok.Data;

/**
 * @author lxlan
 */
@Data
public class FormatJson {
    private Boolean flag;
    private Object data;

    public FormatJson() {
    }

    public FormatJson(Boolean flag) {
        this.flag = flag;
    }

    public FormatJson(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
