package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BodyProfesorPost
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-07-11T23:47:11.822377651Z[GMT]")


public class BodyProfesorPost   {
  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("apellido")
  private String apellido = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("id_carrera")
  private Integer idCarrera = null;

  public BodyProfesorPost nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Primer nombre del profesor.
   * @return nombre
   **/
  @Schema(description = "Primer nombre del profesor.")
  
    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public BodyProfesorPost apellido(String apellido) {
    this.apellido = apellido;
    return this;
  }

  /**
   * Primer apellido del profesor.
   * @return apellido
   **/
  @Schema(description = "Primer apellido del profesor.")
  
    public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public BodyProfesorPost email(String email) {
    this.email = email;
    return this;
  }

  /**
   * E-Mail del Profesor.
   * @return email
   **/
  @Schema(description = "E-Mail del Profesor.")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BodyProfesorPost idCarrera(Integer idCarrera) {
    this.idCarrera = idCarrera;
    return this;
  }

  /**
   * Id de la tabla carreras, relacion con carrera en donde realiza funciones el profesor.
   * @return idCarrera
   **/
  @Schema(description = "Id de la tabla carreras, relacion con carrera en donde realiza funciones el profesor.")
  
    public Integer getIdCarrera() {
    return idCarrera;
  }

  public void setIdCarrera(Integer idCarrera) {
    this.idCarrera = idCarrera;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BodyProfesorPost bodyProfesorPost = (BodyProfesorPost) o;
    return Objects.equals(this.nombre, bodyProfesorPost.nombre) &&
        Objects.equals(this.apellido, bodyProfesorPost.apellido) &&
        Objects.equals(this.email, bodyProfesorPost.email) &&
        Objects.equals(this.idCarrera, bodyProfesorPost.idCarrera);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre, apellido, email, idCarrera);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyProfesorPost {\n");
    
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    apellido: ").append(toIndentedString(apellido)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    idCarrera: ").append(toIndentedString(idCarrera)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
