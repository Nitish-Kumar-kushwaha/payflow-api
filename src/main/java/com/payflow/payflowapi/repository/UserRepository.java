package com.payflow.payflowapi.repository;

import com.payflow.payflowapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUpiId(String upiId);

}