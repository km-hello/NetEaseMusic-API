package com.hello.neteasemusic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Playlist {
    private String listId;
    private String name;
    private String imageUrl;

    private List<Music>musicList;

}