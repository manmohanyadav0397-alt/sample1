package com.kodewala.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodewala.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

}
