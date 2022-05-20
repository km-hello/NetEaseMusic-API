package com.hello.neteasemusic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Video {
    private String title;
    private String videoId;
    private String groupId;
    private String imageUrl;
    private String videoUrl;
    private String creatorName;
    private String creatorImageUrl;
    private String likeCount;
    private String commentCount;
}
