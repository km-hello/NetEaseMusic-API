package com.hello.neteasemusic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Music {
    private String name;
    private String author;
    private String musicUrl;
    private String imageUrl;
    private String musicId;
    private String listId;
    public String time;
}