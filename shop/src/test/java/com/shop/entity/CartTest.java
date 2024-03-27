package com.shop.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.TestPropertySource;

import com.shop.dto.MemberFormDto;
import com.shop.repository.CartRepository;
import com.shop.repository.MemberRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
@TestPropertySource( locations="classpath:application.properties")
public class CartTest {

	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@PersistenceContext
	EntityManager em;  // entity 객체를 관리해 주는 객체
	
	public Member createMember() {
		MemberFormDto memberFormDto = new MemberFormDto();
		memberFormDto.setEmail("test@email.com");
		memberFormDto.setName("홍길동");
		memberFormDto.setAddress("서울시마포구합정동");
		memberFormDto.setPassword("1234");
		return Member.createMember(memberFormDto, passwordEncoder);
	}
	
	@Test
	@DisplayName("장바구니 회원 엔티티 매핑 조회 테스트")
	public void findCartAndMemberTest() {
		Member member = createMember();
		memberRepository.save( member ); //mysql에 insert해 줌 
		
		Cart cart = new Cart();
		cart.setMember(member);
		cartRepository.save( cart ); //mysql cart 테이블에 insert해 줌 
		
		em.flush(); //트랜잭션이 끝날때 flush()호출해서 데이터베이스에 반영해라 
		em.clear();// JPA 영속성 컨텐트를 비워라
		
		Cart savedCart = cartRepository.findById(cart.getId())
				        .orElseThrow(  EntityNotFoundException::new ) ;
		
		System.out.println(  "savedCart.getId() ==>"  + savedCart.getId() );
		System.out.println(  "member.getId() ==>"  + member.getId() );
		
		assertEquals(savedCart.getId(), member.getId() );
		            //기대값,             실제값 
		 //데이터베이스에서 추출할 Id와 member 객체에 있는 id가 같으면 테스트를 통과한 것을 인정해 줄께
		
	}
}
