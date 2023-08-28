package com.pablo.security.controllers.dto;

public record ResponseDTO<T>(String message, T data) {

}