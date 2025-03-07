package com.matheus.projeto_api_java_nuvem.service;

import com.matheus.projeto_api_java_nuvem.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}