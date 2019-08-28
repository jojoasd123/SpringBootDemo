

## Deploy on linux
1. Install JDK, Maven
2. get the source code
3. get the jar file

``` sh
mvn package
```

4. Run
``` sh
java -jar target/demo-0.0.1-SNAPSHOT.jar
```




## Documents
[Spring 文档](https://spring.io/guides)    
[Spring Web](https://spring.io/guides/gs/serving-web-content/)   
[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-values)   
[Github OAuth](https://developer.github.com/apps/quickstart-guides/)
[Lombok](https://www.projectlombok.org) 
[Postman](https://chrome.google.com/webstore/detail/coohjcphdfgbiolnekdpbcijmhambjff) 
[Markdown plugin](http://editor.md.ipandao.com/)  
[MyBatis](http://www.mybatis.org/mybatis-3/)

##Script
MyBatis generator
``` bash
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
``` 