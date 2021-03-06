package com.duniv.core.boot.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.duniv.core.boot.entity.RegEntity;

@NoRepositoryBean
public interface DuvJpaRepository<Entity extends RegEntity> extends JpaRepository<Entity, String> {

}
