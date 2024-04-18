package org.example.catalog.exception;

import java.io.Serializable;
import java.util.Date;

public record ExceptionResponse(Date timestamp, String errorMessage, String errorDatails) implements Serializable {

}
