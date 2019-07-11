package hello.demo.mapper;

import hello.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserMapper {

    @Insert("INSERT INTO user(account_id,name,token,gmt_create,gmt_modified) VALUES(#{accountId},#{name},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);

}