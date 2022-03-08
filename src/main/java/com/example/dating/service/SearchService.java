package com.example.dating.service;

import com.example.dating.domain.Search;
import com.example.dating.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    @Autowired
    SearchRepository searchRepository;

    public Search saveSearch(Search search){
        return searchRepository.save(search);
    }
}
