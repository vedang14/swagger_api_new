/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse404;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-28T09:16:30.423Z[GMT]")
@Api(value = "server", description = "the server API")
public interface ServerApi {

    @ApiOperation(value = "", nickname = "serverByIdGet", notes = "Get server object by Id", response = InlineResponse200.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "get req successfull", response = InlineResponse200.class),
        @ApiResponse(code = 404, message = "return_404 if object doesn't exists", response = InlineResponse404.class) })
    @RequestMapping(value = "/server/byId",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> serverByIdGet(@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) String id
);


    @ApiOperation(value = "", nickname = "serverByNameGet", notes = "Get server object by Name", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "get request successfull", response = Object.class) })
    @RequestMapping(value = "/server/byName",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> serverByNameGet(@ApiParam(value = "") @Valid @RequestParam(value = "name", required = false) String name
);


    @ApiOperation(value = "", nickname = "serverDelete", notes = "delete server object by id", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "object deleted", response = String.class) })
    @RequestMapping(value = "/server/",
        produces = { "text/plain;charset=UTF-8" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<String> serverDelete(@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) String id
);


    @ApiOperation(value = "", nickname = "serverGet", notes = "get list of all server objects", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "get list successfull", response = Object.class) })
    @RequestMapping(value = "/server/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> serverGet();


    @ApiOperation(value = "", nickname = "serverPost", notes = "adding a server object", response = Body1.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "erver object generated successfully", response = Body1.class) })
    @RequestMapping(value = "/server/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Body1> serverPost(@ApiParam(value = ""  )  @Valid @RequestBody Body1 body
);


    @ApiOperation(value = "", nickname = "serverPut", notes = "modify server object by its id", response = Body.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "server object modified", response = Body.class) })
    @RequestMapping(value = "/server/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Body> serverPut(@ApiParam(value = ""  )  @Valid @RequestBody Body body
,@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) String id
);

}
