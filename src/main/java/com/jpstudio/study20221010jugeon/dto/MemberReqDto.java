package com.jpstudio.study20221010jugeon.dto;

import com.jpstudio.study20221010jugeon.dto.validation.ValidationGroups;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class MemberReqDto {

    @NotBlank(message = "아이디는 비워둘 수 없습니다.", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 4, max = 16, message = "이름은 3글자까지만 입력가능합니다", groups = ValidationGroups.SizeGroup.class)
    @Pattern(regexp = "^[a-z\\d]*$", message = "영어소문자/숫자, 4~16자만 입력 가능합니다", groups = ValidationGroups.PatternCheckGroup.class)
    private String userName;
    private String password;
    private String passwordCheck;
    private String name;
    private String resNumber;
    private String postNumber;
}
