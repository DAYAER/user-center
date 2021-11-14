package com.itmuch.usercenter;


import lombok.Data;

public class LomBokTest {

    public static void main(String[] args) {
    }
}

@Data
class UserRegisterDto {
    private String email;
    private String username;
    private String password;

}
