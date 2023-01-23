package com.example.spring_mvc_study.web.frontcontroller.v2.controller;

import com.example.spring_mvc_study.domain.member.Member;
import com.example.spring_mvc_study.domain.member.MemberRepository;
import com.example.spring_mvc_study.web.frontcontroller.MyView;
import com.example.spring_mvc_study.web.frontcontroller.v2.ControllerV2;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class MemberListControllerV2 implements ControllerV2 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Member> members = memberRepository.findAll();
        request.setAttribute("members", members);
        return new MyView("WEB-INF/views/members.jsp");
    }
}
