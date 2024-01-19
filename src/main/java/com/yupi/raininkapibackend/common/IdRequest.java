package com.yupi.raininkapibackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: yumo
 * @create: 2024-01-19 12:39
 **/
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
