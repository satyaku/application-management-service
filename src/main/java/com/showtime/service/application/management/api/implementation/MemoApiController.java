package com.showtime.service.application.management.api.implementation;

import com.showtime.service.application.management.generated.api.MemoApi;
import com.showtime.service.application.management.generated.model.UserMemo;
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
public class MemoApiController implements MemoApi {

    private static final Logger log = LoggerFactory.getLogger(MemoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MemoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<UserMemo>> getMemo(@ApiParam(value = "username of the user ",required=true) @PathVariable("username") String username,@ApiParam(value = "The locale of the client " ) @RequestHeader(value="Accept-Language", required=false) String acceptLanguage,@ApiParam(value = "The fields by which the response is sorted. The supported value is - priority. ") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "Requested number of resources to be provided in the response requested by the client ") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "Requested index for start of resources to be provided in the response requested by the client  ") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Query mask, which is a set of flags that impact the returned fields. The supported values are&#58; - *returnPolicies* - Once set, the API returns additional policy information for the catalog promotions.  <i>Example&#58; mask=returnPolicies</i> ") @Valid @RequestParam(value = "mask", required = false) String mask) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json;charset=utf-8")) {
            try {
                return new ResponseEntity<List<UserMemo>>(objectMapper.readValue("[ {  \"acitivityTimeStamp\" : \"2000-01-23T04:56:07.000+00:00\",  \"acitivityType\" : \"acitivityType\",  \"memoSequenceId\" : 0,  \"activityDescription\" : {    \"longDescription\" : \"longDescription\",    \"memoSequenceId\" : 6,    \"action\" : \"action\",    \"activitySubType\" : \"activitySubType\"  },  \"username\" : \"username\"}, {  \"acitivityTimeStamp\" : \"2000-01-23T04:56:07.000+00:00\",  \"acitivityType\" : \"acitivityType\",  \"memoSequenceId\" : 0,  \"activityDescription\" : {    \"longDescription\" : \"longDescription\",    \"memoSequenceId\" : 6,    \"action\" : \"action\",    \"activitySubType\" : \"activitySubType\"  },  \"username\" : \"username\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json;charset=utf-8", e);
                return new ResponseEntity<List<UserMemo>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UserMemo>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
