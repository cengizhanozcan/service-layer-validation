package com.cenk.tutorial.validation.validator;

/**
 * @author Cengizhan Ozcan
 */
public interface CustomValidator<T> {

    void validate(T entity);
}
