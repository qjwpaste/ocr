package com.yaxi.ocr.ocr.bean;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class BodyInfoBean {

    private String config_str;
    private String address;
    private String nationality;
    private boolean success;
    private String num;
    private String sex;
    private String name;
    private int angle;
    private String birth;
    private boolean is_fake;
    private String request_id;
    private List<CardRegion> card_region;

}