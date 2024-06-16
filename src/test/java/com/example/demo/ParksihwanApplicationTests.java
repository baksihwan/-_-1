package com.example.demo;

import com.example.demo.Question.Question;
import com.example.demo.Question.QuestionRepository;
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
		Question q1 = new Question();
		q1.setSubject("sbb가 무엇인가요?");
		q1.setContent("sbb란 단어는 저 또한 모르겠습니다.");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);

		Question q2 = new Question();
		q2.setSubject("id는 자동으로 생성되나요?");
		q2.setContent("스프링부트 모델 질문입니다.");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);
	}
}
