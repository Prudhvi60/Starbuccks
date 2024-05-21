package com.shop.Starbucks.reposirory;

import com.shop.Starbucks.entity.Entities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Entities,Long> {
}
