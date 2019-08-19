package hello.demo.mapper;

import hello.demo.dto.QuestionQueryDTO;
import hello.demo.model.Question;
import hello.demo.model.QuestionExample;
import org.apache.ibatis.session.RowBounds;

import java.util.List;


public interface QuestionExtMapper {
    int incView(Question record);

    int incCommentCount(Question record);

    List<Question> selectRelated(Question question);

    Integer countBySearch(QuestionQueryDTO questionQueryDTO);

    List<Question> selectBySearch(QuestionQueryDTO questionQueryDTO);
}