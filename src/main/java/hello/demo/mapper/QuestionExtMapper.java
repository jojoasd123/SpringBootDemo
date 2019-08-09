package hello.demo.mapper;

import hello.demo.model.Question;


public interface QuestionExtMapper {
    int incView(Question record);

    int incCommentCount(Question record);

    ;
}