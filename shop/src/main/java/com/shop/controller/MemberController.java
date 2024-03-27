package com.shop.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.dto.MemberFormDto;
import com.shop.entity.Member;
import com.shop.service.MemberService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping(value="/members")
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;
	private final PasswordEncoder passwordEncoder; 
	
	
	@GetMapping(value="/new")
	public String memberForm( Model model) {
		model.addAttribute( "memberFormDto", new MemberFormDto());
		return "member/memberForm"; // src/main/resources/templates/member/memberForm.html 응답한다
		
	}
	
	@PostMapping( value="/new")
	public String memberFrom(@Valid MemberFormDto memberFormDto , BindingResult bindingResult , Model model) {
		
		if(bindingResult.hasErrors() ) { //만약 에러가나면 그에러를 memberForm으로 보내라
			return "member/memberForm";
			
		}
		try {
			Member member = Member.createMember(memberFormDto, passwordEncoder);
			memberService.saveMember(member);
		}catch(IllegalStateException e){
			model.addAttribute("errorMessage", e.getMessage());
		}
		return "redirect:/";
	}
	
	//memberLoginForm에서 받아와서 처리되는곳 
	@GetMapping(value = "/login")
	public String loginMember() {
		return "member/memberLoginForm";
	}
	
	//login의 에러가 되는곳
	@GetMapping(value = "/login/error")
	public String loginError(Model model) {
		model.addAttribute("loginErrorMsg", "아이디 또는 비밀번호를 확인해 주세요");
		return "/member/memberLoginForm";
	}
	
	//로그인이 성공되면 넘어가는곳
	@PostMapping(value ="/login")
	public String loginMember1() {
		return "main";
	}
	
}
