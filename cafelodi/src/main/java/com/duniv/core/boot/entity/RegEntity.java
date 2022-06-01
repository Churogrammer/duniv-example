package com.duniv.core.boot.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@MappedSuperclass
public class RegEntity {
	private LocalDateTime regDt;
	private String regDay;
}
