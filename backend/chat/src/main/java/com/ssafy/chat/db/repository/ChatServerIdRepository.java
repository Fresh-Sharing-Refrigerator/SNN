package com.ssafy.chat.db.repository;

import com.ssafy.chat.config.ChatServerInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class ChatServerIdRepository {
    @Value("${CHAT_SERVER_ID_REPOSITORY_PREFIX}")
    String chatServerIdPrefix;

    private final ChatServerInfo chatServerInfo;
    private final RedisTemplate<String,Long> redisTemplate;


    public void saveByMemberId(Long memberId){
        redisTemplate.opsForValue().set(chatServerIdPrefix+chatServerInfo.getId(),memberId);
    }

    public void deleteByMemberId(Long memberId){
        redisTemplate.opsForValue().getAndDelete(chatServerIdPrefix+memberId);
    }

    public boolean isEnteredMemberId(Long memberId){
        return Optional.ofNullable(redisTemplate.opsForValue().get(memberId)).isPresent();
    }
}
