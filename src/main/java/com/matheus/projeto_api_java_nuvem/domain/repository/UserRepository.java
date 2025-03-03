package com.matheus.projeto_api_java_nuvem.domain.repository;

import com.matheus.projeto_api_java_nuvem.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}