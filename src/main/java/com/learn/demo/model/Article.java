package com.learn.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
@JsonPropertyOrder(value={"content","title"})
public class Article {
    @JsonIgnore
    private Long id;

    @JsonProperty("auther")
    private String author;
    private String title;
    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date createTime;



}
