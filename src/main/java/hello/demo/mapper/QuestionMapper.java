package hello.demo.mapper;

import hello.demo.model.Question;
import hello.demo.model.QuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface QuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    long countByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    int deleteByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    int insert(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    int insertSelective(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    List<Question> selectByExampleWithBLOBsWithRowbounds(QuestionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    List<Question> selectByExampleWithBLOBs(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    List<Question> selectByExampleWithRowbounds(QuestionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    List<Question> selectByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    Question selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") Question record, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Question record, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    int updateByPrimaryKeySelective(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Fri Aug 09 20:41:45 CST 2019
     */
    int updateByPrimaryKey(Question record);
}