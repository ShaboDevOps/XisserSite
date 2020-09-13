package com.Xisser.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface MessageIN extends JpaRepository<Message, String>{
	

}
