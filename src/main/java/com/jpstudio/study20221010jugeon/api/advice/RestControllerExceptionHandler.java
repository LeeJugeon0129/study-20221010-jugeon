package com.jpstudio.study20221010jugeon.api.advice;

import com.jpstudio.study20221010jugeon.dto.CMRespDto;
import com.jpstudio.study20221010jugeon.dto.exception.CustomValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestController
@RestControllerAdvice
public class RestControllerExceptionHandler {
    @ExceptionHandler(CustomValidationException.class)
    public ResponseEntity<?> validationErrorException(CustomValidationException e) {

        return ResponseEntity.badRequest().body(new CMRespDto<>(e.getMessage(), e.getErrorMap()));
        //api : 위 방식대로 받으면 json 형식으로 받아 올수있다. { 안에 msg : ----, data : ---- 형식 안깨진다. }
        //badRequest() or ok() 둘 중에 하나
        //e.getMessage(), e.getErrorMap()는 고정
    }
}
