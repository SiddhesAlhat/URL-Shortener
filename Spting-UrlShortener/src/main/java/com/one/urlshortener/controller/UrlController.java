package com.one.urlshortener.controller;


import com.one.urlshortener.service.UrlService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UrlController {

    private final UrlService urlService;

//    IDEMPOTENCY -> the ability of an API to produce the exact same
//    when the exact same request is received more than once 
    @PostMapping // non-idempotent 
    // @PutMapping // idempotent 
    public String  shortenurl(String url){

        return  shortenurl(url);
    }
}
