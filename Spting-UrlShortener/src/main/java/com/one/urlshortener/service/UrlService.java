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
    	boolean isValid  =urlUtils.isValid(url) ;
    	if (!isValid) {
    		throw new RuntimeException("URL is invalid");
    		
    	}
//    	generate unique short code 
    	String shortendCode =  "TOO";
//    	persist to database
//    	return meaningful data
        return null;
    }
    
}

