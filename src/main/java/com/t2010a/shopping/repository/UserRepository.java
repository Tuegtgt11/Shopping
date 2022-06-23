package com.t2010a.shopping.repository;

import com.t2010a.shopping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
