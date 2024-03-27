package com.shop.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.entity.Member;
import com.shop.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {
  
	private final MemberRepository memberRepository; 
	
	public Member saveMember( Member member) {
		validateDuplivatedMember( member);
		return memberRepository.save( member );
	}

	private void validateDuplivatedMember(Member member) {
		Member findMember = memberRepository.findByEmail( member.getEmail() );
		if( findMember != null) {
			 throw new IllegalStateException( "이미 가입된 회원입니다." );
		}
		
	}
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// memberRepository객체화한것을 가져온다
		Member member = memberRepository.findByEmail(email); //해당하는 이메일이 들어있는지 확인하는것
		if(member == null) {
			throw new UsernameNotFoundException(email);
		}
		return User.builder()
				.username(member.getEmail()) //member안에 있는 이메일로 쓰겠다
				.password(member.getPassword())//member안에 있는 비밀번호로 쓰겠다
				.roles(member.getRole().toString())//member안에 roles로 쓰겟다 
				.build();
	}
	
}
