package com.simplize.javaschema.domain.repository.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.simplize.javaschema.domain.model.user.User;
import com.simplize.javaschema.domain.repository.user.custom.UserRepositoryCustom;

public interface UserRepository
        extends JpaRepository<User, Long>, UserRepositoryCustom, JpaSpecificationExecutor<User> {

    Optional<User> findOneByEmail(String email);

}
