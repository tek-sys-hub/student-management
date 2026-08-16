package com.cherry.stdmngt.repo;

import com.cherry.stdmngt.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users , Long> {
}
