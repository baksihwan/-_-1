package com.example.demo.Answer;

import com.example.demo.Question.Question;
import com.example.demo.Question.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
@RequestMapping("/answer")
public class AnswerController {
    private final QuestionService questionService;
    private final AnswerService answerService;

    @PostMapping("/create/{id}")
    public String createAnswer(Model model, @PathVariable("id")Integer id
    , @RequestParam(value="content") String content){
        Question question = this. questionService.getQuestion(id);
        this.answerService.create(question,content);
        return String.format("redirect:/question/detail/$s",id);
    }

}
