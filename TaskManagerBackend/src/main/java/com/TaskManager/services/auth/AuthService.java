package com.TaskManager.services.auth;

import com.TaskManager.dto.SignupRequest;
import com.TaskManager.dto.UserDto;

public interface AuthService {

    UserDto  signupUser(SignupRequest signupRequest);
    boolean hasUserWithEmail(String email);

}
