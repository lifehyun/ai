package com.shop.controller;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers;
import org.springframework.test.web.servlet.MockMvc;

import com.shop.dto.MemberFormDto;
import com.shop.entity.Member;
import com.shop.service.MemberService;

public class MemberControllerTest {

	@Autowired
	private MemberService memberService;
	
	@Autowired
	private MockMvc mockMvc;//가짜객체 선언
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public Member createMember(String email, String password) {
		MemberFormDto memberFormDto = new MemberFormDto();
		memberFormDto.setEmail(email);
		memberFormDto.setName("홍길동");
		memberFormDto.setAddress("서울시");
		memberFormDto.setPassword(password);
		Member member = Member.createMember(memberFormDto, passwordEncoder);
		return memberService.saveMember(member);
	}
	

	
	@Test
	@DisplayName("로그인 성공 테스트")
	public void loginSuccessTest() throws Exception{//throws 해서 예외처리해준다.
		String email = "test@email.com";
		String password = "1234";
		this.createMember(email, password);//위에 만들어놓은 메소드를 호출한다
		mockMvc.perform(formLogin().userParameter("email") 
				.loginProcessingUrl("/members/login") 
		        .user(email).password(password))
		        .andExpect(SecurityMockMvcResultMatchers.authenticated()); //로그인이 성공이 인증되면 테스트코드가 mysql에 연동될것이다.
	}


}