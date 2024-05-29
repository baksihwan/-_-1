package com.example.demo;

import com.example.demo.Question.Question;
import com.example.demo.Question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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