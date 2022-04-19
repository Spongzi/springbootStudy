package com.github.domain;

import lombok.Data;

/**
 *  lombok
 * @author lxlan
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
