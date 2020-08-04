package com.fuyi.myblog.repository;

import com.fuyi.myblog.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends CrudRepository<User, String> {
}
