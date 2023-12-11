package com.gm.VCoJa.repository;


import com.gm.VCoJa.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Integer>{


}
