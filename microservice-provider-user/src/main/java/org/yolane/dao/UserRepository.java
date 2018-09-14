package org.yolane.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yolane.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
