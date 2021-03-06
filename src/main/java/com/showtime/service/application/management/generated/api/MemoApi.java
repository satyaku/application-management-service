/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.showtime.service.application.management.generated.api;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.showtime.service.application.management.generated.model.UserMemo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-12T21:36:58.218Z")

@Api(value = "memo", description = "the memo API")
@RequestMapping(value = "/applicationManagement/v1")
public interface MemoApi {
	
	Logger log = LoggerFactory.getLogger(MemoApi.class);

	default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Retrieve memo", nickname = "getMemo", notes = "", response = UserMemo.class, responseContainer = "List", tags={ "Admin", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "*OK* - The memos were retrieved successfully. ", response = UserMemo.class, responseContainer = "List") })
    @RequestMapping(value = "/memo/{username}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    default ResponseEntity<List<UserMemo>> getMemo(@ApiParam(value = "username of the user ",required=true) @PathVariable("username") String username,@ApiParam(value = "The locale of the client " ) @RequestHeader(value="Accept-Language", required=false) String acceptLanguage,@ApiParam(value = "The fields by which the response is sorted. The supported value is - priority. ") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "Requested number of resources to be provided in the response requested by the client ") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "Requested index for start of resources to be provided in the response requested by the client  ") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Query mask, which is a set of flags that impact the returned fields. The supported values are&#58; - *returnPolicies* - Once set, the API returns additional policy information for the catalog promotions.  <i>Example&#58; mask=returnPolicies</i> ") @Valid @RequestParam(value = "mask", required = false) String mask) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json;charset=utf-8")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"acitivityTimeStamp\" : \"2000-01-23T04:56:07.000+00:00\",  \"acitivityType\" : \"acitivityType\",  \"memoSequenceId\" : 0,  \"activityDescription\" : {    \"longDescription\" : \"longDescription\",    \"memoSequenceId\" : 6,    \"action\" : \"action\",    \"activitySubType\" : \"activitySubType\"  },  \"username\" : \"username\"}, {  \"acitivityTimeStamp\" : \"2000-01-23T04:56:07.000+00:00\",  \"acitivityType\" : \"acitivityType\",  \"memoSequenceId\" : 0,  \"activityDescription\" : {    \"longDescription\" : \"longDescription\",    \"memoSequenceId\" : 6,    \"action\" : \"action\",    \"activitySubType\" : \"activitySubType\"  },  \"username\" : \"username\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json;charset=utf-8", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default MemoApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
