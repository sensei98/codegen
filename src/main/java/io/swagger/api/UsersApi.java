/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.25).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.InsertUser;
import io.swagger.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-01T11:41:56.516Z[GMT]")
@Validated
public interface UsersApi {

    @Operation(summary = "Create User", description = "This can be done by a new customer", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Employee" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "user created", content = @Content(schema = @Schema(implementation = User.class))) })
    @RequestMapping(value = "/Users",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<User> createUser(@Parameter(in = ParameterIn.DEFAULT, description = "Created User object", schema=@Schema()) @Valid @RequestBody InsertUser body);


    @Operation(summary = "Delete User Info", description = "Deleting customer information using the id", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Employee" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation"),
        
        @ApiResponse(responseCode = "400", description = "Id is invalid"),
        
        @ApiResponse(responseCode = "404", description = "Customer not found") })
    @RequestMapping(value = "/Users/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUserById(@Parameter(in = ParameterIn.PATH, description = "The Id of the customer to delete", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "Edit User Info", description = "Editing specific user information using id", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Employee" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Information changed"),
        
        @ApiResponse(responseCode = "400", description = "Id is invalid"),
        
        @ApiResponse(responseCode = "404", description = "Customer not found") })
    @RequestMapping(value = "/Users/{id}",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> editUserbyId(@Parameter(in = ParameterIn.PATH, description = "The Id of the customer to delete", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody InsertUser body);


    @Operation(summary = "Get all users", description = "This can be done by Employees", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Employee" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = User.class)))) })
    @RequestMapping(value = "/Users",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<User>> getUser(@Min(0) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "maximum number of records to return" ,schema=@Schema(allowableValues={  }, maximum="50"
, defaultValue="50")) @Valid @RequestParam(value = "limit", required = false, defaultValue="50") Integer limit, @Parameter(in = ParameterIn.QUERY, description = "get User by name" ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name);


    @Operation(summary = "Get user by ID", description = "This can be done by Employees", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Employee" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = User.class))),
        
        @ApiResponse(responseCode = "400", description = "Id is invalid"),
        
        @ApiResponse(responseCode = "404", description = "Customer not found") })
    @RequestMapping(value = "/Users/{id}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> getUserByID(@Parameter(in = ParameterIn.PATH, description = "The Id of the customer to delete", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Min(1) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "maximum number of records to return" ,schema=@Schema(allowableValues={  }, minimum="1", maximum="50"
, defaultValue="50")) @Valid @RequestParam(value = "limit", required = false, defaultValue="50") Integer limit);

}
