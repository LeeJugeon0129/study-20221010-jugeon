package com.jpstudio.study20221010jugeon.api;

import com.jpstudio.study20221010jugeon.aop.annotation.LogAspect;
import com.jpstudio.study20221010jugeon.dto.CMRespDto;
import com.jpstudio.study20221010jugeon.dto.MemberReqDto;
import com.jpstudio.study20221010jugeon.dto.validation.ValidationSequence;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Validation;


@RequestMapping("/api/member")
@RestController
public class memberApi {

    @LogAspect
    @PostMapping("/SignUp")
    public ResponseEntity<?> signup(@Validated(ValidationSequence.class) @RequestBody MemberReqDto memberReqDto, BindingResult bindingResult){
        return ResponseEntity.created(null).body(new CMRespDto<>("회원가입 성공", memberReqDto));
    }


}
