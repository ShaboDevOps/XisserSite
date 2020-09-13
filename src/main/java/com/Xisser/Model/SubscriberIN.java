package com.Xisser.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface SubscriberIN extends JpaRepository<Subscriber, String>{

}
