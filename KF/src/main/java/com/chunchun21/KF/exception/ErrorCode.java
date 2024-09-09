package com.chunchun21.KF.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@AllArgsConstructor
public enum ErrorCode {

    USER_INVALID(1000, "User information invalid"),
    USER_EXISTED(1001, "User has existed"),
    PASSWORD_UNCHANGED(1003, "Password expired"),
    ;
  int code;
  String message;

}
