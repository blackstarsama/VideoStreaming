package com.sama.streaming.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Video with this name not found")
public class VideoNotFoundException extends RuntimeException{
}
