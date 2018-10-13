package com.vpt.pw.demo.repository;

import com.vpt.pw.demo.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {

    Team findByUserNameAndPassword(String userName, String password);
//     @Query(nativeQuery = true, value = "SELECT * FROM team t WHERE t.userName = ");
}
