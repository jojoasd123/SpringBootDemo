package hello.demo.dto;

import hello.demo.model.User;
import lombok.Data;

@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;

}
