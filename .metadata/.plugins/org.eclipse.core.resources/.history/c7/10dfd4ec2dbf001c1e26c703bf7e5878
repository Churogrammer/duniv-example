package com.duniv.sol.service.Main;

import org.springframework.stereotype.Repository;

import com.duniv.core.boot.service.DuvJpaQueryDslSupport;

@Repository
public class MainRepositoryImpl extends DuvJpaQueryDslSupport implements MainRepositoryCustom{

	public MainRepositoryImpl() {
		super(MainEntity.class);
	}
	
	
	// 여기서 선언된 메소드 구현
	public String mainExampleMethod() {
		return "index-hello";
	}
/*
	private QMainEntity mainEntity;
	public List<MainEntity> getList(){
		return from(mainEntity)
				.select(Projections.fields(MainEntity.class
						,mainEntity.id
						, mainEntity.regDay))
				.fetch();
	}
	*/
	
}
