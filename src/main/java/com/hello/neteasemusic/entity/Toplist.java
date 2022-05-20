package com.hello.neteasemusic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Toplist {
    private String name;

    private String listId;

    private String imageUrl;

    private List<Music>musicList;

}