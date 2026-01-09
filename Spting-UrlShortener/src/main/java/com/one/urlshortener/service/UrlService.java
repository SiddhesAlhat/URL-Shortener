package com.one.urlshortener.service;

import org.springframework.stereotype.Service;

import com.one.urlshortener.entity.UrlEntity;
import com.one.urlshortener.repository.UrlRepository;
import com.one.urlshortener.util.UrlUtils;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UrlService {

	private final UrlRepository urlRepository;
	
	private final UrlUtils urlUtils ;
	
    public String shortenUrl (String url){
//    	validate URL
    	boolean isValid  =urlUtils.isValid(url) ;
    	if (!isValid) {
    		throw new RuntimeException("URL is invalid");
    		
    	}
//    	generate unique short code 
    	String shortCode =  "TOO";
    	UrlEntity urlEntity = new UrlEntity();
//    	persist to database
    
    	urlEntity.setMainUrl(url);
    	urlEntity.setShortCode(shortCode);
    	urlRepository.save(urlEntity);
//    	return meaningful data
        return shortCode;
    }
    
}

