package com.example.pollingapp.service;

import com.example.pollingapp.model.Poll;
import com.example.pollingapp.repository.PollRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PollServiceImpl implements PollService {

    private final PollRepository pollRepository;

    public PollServiceImpl(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    @Override
    public List<Poll> getAllPolls() {
        return pollRepository.findAll();
    }

    @Override
    public boolean isPollCodeValid(String code) {
        return pollRepository.findByCode(code).isPresent();
    }

    public List<Poll> findPollsByCreatedBy(String username) {
        return pollRepository.findByCreatedBy(username);
    }
}
