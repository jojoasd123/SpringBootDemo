package hello.demo.controller;

import hello.demo.dto.AccessTokenDTO;
import hello.demo.dto.GithubUser;
import hello.demo.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;
    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_url("http://localhost:8080/callback");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setClient_id("caa2b1b5506321db89cb");
        accessTokenDTO.setClient_secret("46d83840955361e66c5135f35ec28db59680328a");

        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser user = githubProvider.getUser(accessToken);
        System.out.println(user.getName());


        return "index";
    }
}

