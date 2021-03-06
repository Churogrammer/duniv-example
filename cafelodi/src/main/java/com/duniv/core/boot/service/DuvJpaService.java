package com.duniv.core.boot.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.duniv.core.boot.entity.RegEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class DuvJpaService<Entity extends RegEntity, Repository extends DuvJpaRepository<Entity>> {
	
	@Getter @Setter(onMethod_ = @Autowired)
	private Repository repository;
	
}
