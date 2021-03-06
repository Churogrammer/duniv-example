package com.duniv.sol.service.Main;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.duniv.core.boot.service.DuvJpaRepository;

@Repository
public interface MainRepository extends DuvJpaRepository<MainEntity>, MainRepositoryCustom{

	// 여기서는 기본 이름으로 메소드 호출
	public List<MainEntity> findAll();
	public Optional<MainEntity> findById(String key);
}
