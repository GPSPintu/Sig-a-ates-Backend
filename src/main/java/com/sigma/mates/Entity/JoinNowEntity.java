package com.sigma.mates.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
public class JoinNowEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int joinId;
	String name;
	String email;
	String username;
	String password;
}
