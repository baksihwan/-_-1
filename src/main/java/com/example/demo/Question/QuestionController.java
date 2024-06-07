package com.example.demo.Question;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@RequiredArgsConstructor

@Controller
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping("/question/list")
    public String question(Model model) {
        List<Question> questionlist = this.questionService.getList();
        model.addAttribute("questionlist", questionlist);
        return "question_list";

    }
}

