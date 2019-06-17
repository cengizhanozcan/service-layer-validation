package com.cenk.tutorial.validation.user.model;

import lombok.*;

/**
 * @author Cengizhan Ozcan
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String name;

    private String surname;

    private String emailAddress;
}
