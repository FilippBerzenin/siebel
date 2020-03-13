package ch.synergysoft.siebel.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

@Service
public class ServiceHandlingError {
	
	//404
	 @ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Order")
	 public class OrderNotFoundException extends RuntimeException {

		private static final long serialVersionUID = 1L;

	 }
	 
	 //204
	 @ResponseStatus(value=HttpStatus.NO_CONTENT, reason="No Content")
	 public class noContentException extends RuntimeException {

		private static final long serialVersionUID = 1L;

	 }
	 
	 //	401
	 @ResponseStatus(value=HttpStatus.UNAUTHORIZED, reason="No unauthorized")
	 public class notUnauthorized extends RuntimeException {

		private static final long serialVersionUID = 1L;

	 }
	 
	 //405
	 @ResponseStatus(value=HttpStatus.METHOD_NOT_ALLOWED, reason="Not Allowed")
	 public class not extends RuntimeException {

		private static final long serialVersionUID = 1L;

	 }
	 
	 //406
	 @ResponseStatus(value=HttpStatus.NOT_ACCEPTABLE, reason="Not Acceptable")
	 public class notAcceptable extends RuntimeException {

		private static final long serialVersionUID = 1L;

	 }
	 
	 //415
	 @ResponseStatus(value=HttpStatus.UNSUPPORTED_MEDIA_TYPE, reason="Unsupported Media Type")
	 public class unsupportedediaType extends RuntimeException {

		private static final long serialVersionUID = 1L;

	 }
	 
	 //500
	 @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR, reason="Internal Server Error")
	 public class internalServerError extends RuntimeException {

		private static final long serialVersionUID = 1L;

	 }
}
