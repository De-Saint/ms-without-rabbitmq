package com.stlemmy.currencyexchangeservice.repository;

import com.stlemmy.currencyexchangeservice.entity.ExchangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRepository extends JpaRepository<ExchangeEntity, Long> {

    ExchangeEntity findByFromAndTo(String from, String to);
}
