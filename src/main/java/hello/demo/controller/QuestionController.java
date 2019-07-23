package hello.demo.controller;

import hello.demo.dto.QuestionDTO;
import hello.demo.mapper.QuestionExtMapper;
import hello.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuestionExtMapper questionExtMapper;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name ="id") Integer id,
                           Model model){
        QuestionDTO questionDTO = questionService.getById(id);

        //累加阅读数
        questionService.incView(id);
        model.addAttribute("question",questionDTO);
        return "question";
    }
}
