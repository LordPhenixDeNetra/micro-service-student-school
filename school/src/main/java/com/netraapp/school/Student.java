package com.netraapp.school;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    private String firstname;
    private String lastname;
    private String email;
}
