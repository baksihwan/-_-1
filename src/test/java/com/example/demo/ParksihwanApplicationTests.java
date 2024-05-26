package com.example.demo;

import org.antlr.v4.runtime.misc.LogManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ParksihwanApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;


	@Test
	void testJpa() {
		Question q = this. questionRepository.findBySubject("sbb가 무엇인가요?");
		assertEquals(1,q.getId());
	}
}