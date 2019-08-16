package hello.demo.controller;

import hello.demo.dto.CommentCreateDTO;
import hello.demo.dto.CommentDTO;
import hello.demo.dto.ResultDTO;
import hello.demo.enums.CommentTypeEnum;
import hello.demo.exception.CustomizeErrorCode;
import hello.demo.model.Comment;
import hello.demo.model.User;
import hello.demo.service.CommentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @ResponseBody
    @RequestMapping(value = "/comment",method = RequestMethod.POST)
    public Object post(@RequestBody CommentCreateDTO commentCreateDTO,
                       HttpServletRequest request){
        User user=(User) request.getSession().getAttribute("user");
        if(user ==null){
            return ResultDTO.errorOf(2002,"未登录,不能进行评论,请先登陆");
        }

        if (commentCreateDTO ==null || StringUtils.isBlank(commentCreateDTO.getContent())){
            return ResultDTO.errorOf(CustomizeErrorCode.CONTENT_IS_EMPTY);
        }

        Comment comment = new Comment();
        comment.setCommentator(user.getId());
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setType(commentCreateDTO.getType());
        comment.setParentId(commentCreateDTO.getParentId());
        comment.setContent(commentCreateDTO.getContent());
        comment.setLikeCount(0L);

        commentService.insert(comment, user);

        return ResultDTO.okOf();
    }

    @ResponseBody
    @RequestMapping(value = "/comment/{id}", method = RequestMethod.GET)
    public ResultDTO<List<CommentDTO>> comments(@PathVariable(name = "id") Long id) {
        List<CommentDTO> commentDTOS = commentService.listByTargetId(id, CommentTypeEnum.COMMENT);
        return ResultDTO.okOf(commentDTOS);
    }
}
