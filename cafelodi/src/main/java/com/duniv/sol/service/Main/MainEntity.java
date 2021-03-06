package com.duniv.sol.service.Main;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.duniv.core.boot.entity.RegEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "main")
public class MainEntity extends RegEntity{

	@Id
	String id;
	
	String name;
}
