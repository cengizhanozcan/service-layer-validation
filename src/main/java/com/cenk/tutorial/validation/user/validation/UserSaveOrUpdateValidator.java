package com.cenk.tutorial.validation.user.validation;

import com.cenk.tutorial.validation.user.model.User;
import com.cenk.tutorial.validation.validator.CustomValidator;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Cengizhan Ozcan
 */
public class UserSaveOrUpdateValidator implements CustomValidator<User> {

    public static final String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

    @Override
    public void validate(User entity) {
        if (StringUtils.isEmpty(entity.getName())) {
            throw new RuntimeException("name not null");
        }
        if (StringUtils.isEmpty(entity.getSurname())) {
            throw new RuntimeException("name not null");
        }
        if (StringUtils.isEmpty(entity.getEmailAddress())) {
            throw new RuntimeException("emailAddress not null");
        }
        if (!entity.getEmailAddress().matches(EMAIL_REGEX)) {
            throw new RuntimeException("wrong email format");
        }
    }
}
