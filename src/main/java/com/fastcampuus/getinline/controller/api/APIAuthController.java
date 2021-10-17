package com.fastcampuus.getinline.controller.api;

import com.fastcampuus.getinline.dto.APIDataResponse;
import com.fastcampuus.getinline.dto.AdminRequest;
import com.fastcampuus.getinline.dto.LoginRequest;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class APIAuthController {

    @PostMapping("/sign-up")
    public APIDataResponse<String> signUp(@RequestBody AdminRequest adminRequest) {
        return APIDataResponse.empty();
    }

    @PostMapping("/login")
    public APIDataResponse<String> login(@RequestBody LoginRequest loginRequest) {
        return APIDataResponse.empty();
    }
}
