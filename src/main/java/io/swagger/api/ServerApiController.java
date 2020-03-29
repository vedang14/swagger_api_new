package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse404;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
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
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-28T09:16:30.423Z[GMT]")
@Controller
public class ServerApiController implements ServerApi {

    private static final Logger log = LoggerFactory.getLogger(ServerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ServerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse200> serverByIdGet(@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\n  \"framework\" : \"framework\",\n  \"name\" : \"name\",\n  \"language\" : \"language\",\n  \"id\" : \"id\"\n}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> serverByNameGet(@ApiParam(value = "") @Valid @RequestParam(value = "name", required = false) String name
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> serverDelete(@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> serverGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Body1> serverPost(@ApiParam(value = ""  )  @Valid @RequestBody Body1 body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Body1>(objectMapper.readValue("{\n  \"framework\" : \"framework\",\n  \"name\" : \"name\",\n  \"language\" : \"language\",\n  \"id\" : \"id\"\n}", Body1.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Body1>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Body1>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Body> serverPut(@ApiParam(value = ""  )  @Valid @RequestBody Body body
,@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Body>(objectMapper.readValue("{\n  \"framework\" : \"framework\",\n  \"name\" : \"name\",\n  \"language\" : \"language\",\n  \"id\" : \"id\"\n}", Body.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Body>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Body>(HttpStatus.NOT_IMPLEMENTED);
    }

}
