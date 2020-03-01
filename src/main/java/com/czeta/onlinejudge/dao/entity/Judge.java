package com.czeta.onlinejudge.dao.entity;

import lombok.Data;

/**
 * @ClassName Judge
 * @Description
 * @Author chenlongjie
 * @Date 2020/3/1 13:29
 * @Version 1.0
 */
@Data
public class Judge {
    private Long id;
    private Long problemId;
    private String code;
    private String time;
    private String memory;
    private String language;
    private String submitStatus;
    private Long sourceId;
    private String creator;
    private Short status;
    private String crtTs;
    private String lmTs;
}
