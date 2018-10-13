package com.vpt.pw.demo.repository;

import com.vpt.pw.demo.model.Site;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteRepository extends JpaRepository<Site, Integer> {
}
