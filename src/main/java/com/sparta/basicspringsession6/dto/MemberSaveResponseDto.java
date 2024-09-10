package com.sparta.basicspringsession6.dto;

import lombok.Getter;

@Getter
public class MemberSaveResponseDto {
    private Long id;
    private String name;
    public MemberSaveResponseDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
