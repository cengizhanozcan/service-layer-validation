package com.cenk.tutorial.validation.user.validation;

import com.cenk.tutorial.validation.validator.CustomValidator;

/**
 * @author Cengizhan Ozcan
 */
public class DeleteValidator implements CustomValidator<Long> {

    @Override
    public void validate(Long entity) {
        if (entity == null) {
            throw new RuntimeException("id not null");
        }
    }
}
