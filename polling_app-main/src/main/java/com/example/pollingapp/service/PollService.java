package com.example.pollingapp.service;

import com.example.pollingapp.model.Poll;
import java.util.List;

public interface PollService {
    List<Poll> getAllPolls();
    boolean isPollCodeValid(String code);
}
