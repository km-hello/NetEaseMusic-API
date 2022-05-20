package com.hello.neteasemusic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String phone;
    private String password;
    private String nickName;
    private String imageUrl;

    private boolean success;
}
