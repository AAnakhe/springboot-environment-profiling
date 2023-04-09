package com.springboot.environmentprofiling.repository;

import com.springboot.environmentprofiling.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
