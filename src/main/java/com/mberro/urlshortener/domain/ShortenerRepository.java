package com.mberro.urlshortener.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by Marcus Berro on 24/10/15.
 */
public interface ShortenerRepository extends JpaRepository<ShortenUrl, Long> {

    Optional<ShortenUrl> findByCode(String code);
}
