/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.46).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.BodyProfesorPost;
import io.swagger.model.ExitoProfesorModificar;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-07-11T23:47:11.822377651Z[GMT]")
@Validated
public interface ModificarprofesorApi {

    @Operation(summary = "Modificar un profesor existente", description = "", tags={ "Profesores" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "(OK) La informacion se entrego correctamente.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExitoProfesorModificar.class))),
        
        @ApiResponse(responseCode = "400", description = "(BadRequest) Los datos enviados son incorrectos o hay datos obligatorios no enviados. La solicitud no fue válida. Este código se devuelve cuando el servidor ha intentado procesar la solicitud, pero algún aspecto de la solicitud no es válido; por ejemplo, un recurso formateado de forma incorrecta o un intento de despliegue de un proyecto de sucesos no válido en el tiempo de ejecución de sucesos. La información acerca de la solicitud se proporciona en el cuerpo de la respuesta e incluye un código de error y un mensaje de error."),
        
        @ApiResponse(responseCode = "403", description = "(Forbidden)Indica que el cliente ha intentado acceder a un recurso al que no tiene acceso. Podría producirse si el usuario que accede al recurso remoto no tiene privilegios suficientes; por ejemplo, con el rol WBERestApiUsers o WBERestApiPrivilegedUsers. Los usuarios que intenten acceder a proyectos de sucesos privados que son propiedad de otros podrían recibir también este error, pero solo si tienen el rol WBERestApiUsers en lugar de WBERestApiPrivilegedUsers."),
        
        @ApiResponse(responseCode = "404", description = "(NotFound) No se encontro la informacion. Indica que el recurso de destino no existe. Esto podría deberse a que el URI no está bien formado o a que se ha suprimido el recurso."),
        
        @ApiResponse(responseCode = "405", description = "(Entrada Invalida)"),
        
        @ApiResponse(responseCode = "500", description = "(ServerError) Error en el servidor. Se ha producido un error interno en el servidor. Esto podría indicar un problema con la solicitud o un problema en el código del lado del servidor. Se puede encontrar información acerca del error en el cuerpo de respuesta.") })
    @RequestMapping(value = "/modificarprofesor/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<ExitoProfesorModificar> modificarprofesorIdPut(@Parameter(in = ParameterIn.PATH, description = "ID del profesor a modificar", required=true, schema=@Schema()) @PathVariable("id") BigDecimal id, @Parameter(in = ParameterIn.DEFAULT, description = "Agregar Profesor.", required=true, schema=@Schema()) @Valid @RequestBody BodyProfesorPost body);

}

