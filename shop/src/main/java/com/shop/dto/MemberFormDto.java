package com.shop.dto;
//클라이언트쪽에서 서버로 입력을 보내주는곳 
//memberForm쪽으로 보내주는곳임.
import org.hibernate.validator.constraints.Length;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberFormDto {
    @NotBlank(message = "이름은 필수 입력값 입니다.") //이름을 입력을 하지않으면 오류가 나게하는것
	private String name;
    
    @NotEmpty(message = "이메일은 필수 입력값 입니다.")
    @Email(message = "이메일형식으로 입력해 주세요.")
    private String email;
    
    @NotEmpty(message = "비밀번호는 필수 입력값 입니다.")
    @Length(min = 2 , max= 16 , message = "비밀번호는 2글자이상부터 입력이 가능합니다.") //비밀번호는 최소 2글자부터 최대 16글자까지만 입력가능하게 하는것
    
    private String password;
    
    @NotEmpty(message = "주소는 필수 입력값 입니다.")
    private String address;
}
