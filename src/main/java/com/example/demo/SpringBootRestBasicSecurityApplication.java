package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.model.Role;
import com.example.demo.model.Users;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class SpringBootRestBasicSecurityApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestBasicSecurityApplication.class, args);
	}

	@Bean
    BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	GrantedAuthorityDefaults grantedAuthorityDefaults() {
	    return new GrantedAuthorityDefaults(""); // Remove the ROLE_ prefix
	}
	@Autowired
	private UserRepository repo;
	
	@Override
	public void run(String... arg0) throws Exception {
//		Role roleAdmin = new Role("ADMIN");
//		Role roleSuperAdmin = new Role("SUPER_ADMIN");
//		Role roleUser = new Role("USER");
//		
//		Set<Role> rolesOne = new HashSet();
//		rolesOne.add(roleAdmin);
//		rolesOne.add(roleSuperAdmin);
//		Users users = new Users("Orkhan", bCryptPasswordEncoder().encode("merhaba"), rolesOne);
//		repo.save(users);
		
	}
}
