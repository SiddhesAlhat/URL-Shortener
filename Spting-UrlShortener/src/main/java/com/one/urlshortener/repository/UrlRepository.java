package com.one.urlshortener.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one.urlshortener.entity.UrlEntity;

public interface UrlRepository extends JpaRepository<UrlEntity, Long>{

}
