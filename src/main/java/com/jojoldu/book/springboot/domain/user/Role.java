package com.jojoldu.book.springboot.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),

    @Builder.Default
    USER("ROLE_USER", "일반 사용자");

    private final String key;
    private final String title;

}
