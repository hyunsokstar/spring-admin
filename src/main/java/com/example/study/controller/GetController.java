package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api") // localhost;8080/api
public class GetController {
    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")
    public String getRequest() {
        return "Hi getMehod";
    }

    // 파라미터 받기
    // localhost:8080/api/getParameter?id=1234&password=abcd
    @GetMapping("/getParameter")
    public String getParameter(@RequestParam String id, @RequestParam(name="password")String pwd) {
        String password = "12341234";
        System.out.println("id : " + id);
        System.out.println("password : " + pwd);
        return id + password;
    }

    // 인자가 여러개일 경우 객체로 받을수 있다.
    // ex)
    // localhost:8080/api/getMultiParameter?account=abcd&email=study@gmail.com&page=10
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam) {
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        // 객체를 리턴하면 json으로 반환 한다.
        return searchParam;
    }
}
