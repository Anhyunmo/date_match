package com.example.dating.repository;

import com.example.dating.domain.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatRepository extends JpaRepository<Chat, Integer> {

    List<Chat> findAllByMatchId(Integer matchId);
}
