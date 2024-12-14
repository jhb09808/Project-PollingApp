package com.example.pollingapp.repository;

import com.example.pollingapp.model.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PollRepository extends JpaRepository<Poll, Long> {
    Optional<Poll> findByCode(String code);
    List<Poll> findByCreatedBy(String createdBy);
}