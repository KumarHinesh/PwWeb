package com.vpt.pw.demo.repository;

import com.vpt.pw.demo.model.Followups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowupRepository extends JpaRepository<Followups, Integer> {
}
