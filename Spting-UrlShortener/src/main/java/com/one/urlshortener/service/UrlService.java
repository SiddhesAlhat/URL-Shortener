package com.one.urlshortener.service;

import org.springframework.stereotype.Service;

import com.one.urlshortener.util.UrlUtils;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UrlService {

	private final UrlUtils urlUtils ;
    public String shortenUrl (String url){
//    	validate URL
//    	generate unique short code 
//    	persist to database
//    	return meaningful data
        return null;
    }
    
}

