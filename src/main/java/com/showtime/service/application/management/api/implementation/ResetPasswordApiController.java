package com.showtime.service.application.management.api.implementation;

import com.showtime.service.application.management.generated.api.ResetPasswordApi;
import com.showtime.service.application.management.generated.model.Credentials;
import com.showtime.service.application.management.generated.model.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-12T21:36:58.218Z")

@Controller
public class ResetPasswordApiController implements ResetPasswordApi {

    private static final Logger log = LoggerFactory.getLogger(ResetPasswordApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ResetPasswordApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Response> userResetpassword(@ApiParam(value = "User signing in Details " ,required=true )  @Valid @RequestBody Credentials credentials,@ApiParam(value = "The locale of the client " ) @RequestHeader(value="Accept-Language", required=false) String acceptLanguage) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json;charset=utf-8")) {
            try {
                return new ResponseEntity<Response>(objectMapper.readValue("{  \"description\" : \"description\",  \"status\" : \"status\"}", Response.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json;charset=utf-8", e);
                return new ResponseEntity<Response>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Response>(HttpStatus.NOT_IMPLEMENTED);
    }

}
