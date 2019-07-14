package hello.demo.model;



import lombok.Data;

import java.time.format.DateTimeFormatter;

@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;



}
