package com.school.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class ProfileLogger implements ApplicationRunner {

	@Value("${spring.profiles.active:default}")
    private String activeProfile;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("Active Profile is ::"+activeProfile);
	}

}
