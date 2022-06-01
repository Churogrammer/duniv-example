package com.duniv.sol.service.Main;

import org.springframework.stereotype.Service;

import com.duniv.core.boot.service.DuvJpaService;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@Service
public class MainService extends DuvJpaService<MainEntity, MainRepository>{

	public void methodName() {
		System.out.println("this is mainService");
		String str = this.getRepository().mainExampleMethod();
		
	}
	
	
}
