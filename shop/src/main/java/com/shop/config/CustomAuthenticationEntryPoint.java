package com.shop.config;

import java.io.IOException;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CustomAuthenticationEntryPoint extends BasicAuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException {
		
		response.sendError( HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized"); //응답할때 인증이 되지않은것들(권한이 없는 회원들은) , " 에러메시지가 뜰것으로 예상" 
	
	}
}

//인증되지 않은 사용자가 요청할때 뜨는 메시지 ex)상품관리 , 상품등록 탭을 누르면 그럴것이다


