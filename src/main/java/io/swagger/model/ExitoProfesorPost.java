package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExitoProfesorPost
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-07-11T23:47:11.822377651Z[GMT]")


public class ExitoProfesorPost   {
  /**
   * ID  que le corresponde al profesor por usuario
   */
  public enum IdProfesorEnum {
    NUMBER_1(1);

    private Integer value;

    IdProfesorEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IdProfesorEnum fromValue(String text) {
      for (IdProfesorEnum b : IdProfesorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("id_profesor")
  private IdProfesorEnum idProfesor = null;

  /**
   * Primer nombre del profesor
   */
  public enum NombreEnum {
    NOMBRE("nombre");

    private String value;

    NombreEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NombreEnum fromValue(String text) {
      for (NombreEnum b : NombreEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("nombre")
  private NombreEnum nombre = null;

  /**
   * Primer apellido del profesor
   */
  public enum ApellidoEnum {
    APELLIDO("apellido");

    private String value;

    ApellidoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApellidoEnum fromValue(String text) {
      for (ApellidoEnum b : ApellidoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("apellido")
  private ApellidoEnum apellido = null;

  /**
   * E-Mail del Profesor
   */
  public enum EmailEnum {
    EMAIL("email");

    private String value;

    EmailEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EmailEnum fromValue(String text) {
      for (EmailEnum b : EmailEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("email")
  private EmailEnum email = null;

  /**
   * Id de la tabla carreras, relacion con carrera en donde realiza funciones el profesor.
   */
  public enum IdCarreraEnum {
    NUMBER_1(1);

    private Integer value;

    IdCarreraEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IdCarreraEnum fromValue(String text) {
      for (IdCarreraEnum b : IdCarreraEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("id_carrera")
  private IdCarreraEnum idCarrera = null;

  public ExitoProfesorPost idProfesor(IdProfesorEnum idProfesor) {
    this.idProfesor = idProfesor;
    return this;
  }

  /**
   * ID  que le corresponde al profesor por usuario
   * @return idProfesor
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "ID  que le corresponde al profesor por usuario")
  
    public IdProfesorEnum getIdProfesor() {
    return idProfesor;
  }

  public void setIdProfesor(IdProfesorEnum idProfesor) {
    this.idProfesor = idProfesor;
  }

  public ExitoProfesorPost nombre(NombreEnum nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Primer nombre del profesor
   * @return nombre
   **/
  @Schema(description = "Primer nombre del profesor")
  
    public NombreEnum getNombre() {
    return nombre;
  }

  public void setNombre(NombreEnum nombre) {
    this.nombre = nombre;
  }

  public ExitoProfesorPost apellido(ApellidoEnum apellido) {
    this.apellido = apellido;
    return this;
  }

  /**
   * Primer apellido del profesor
   * @return apellido
   **/
  @Schema(description = "Primer apellido del profesor")
  
    public ApellidoEnum getApellido() {
    return apellido;
  }

  public void setApellido(ApellidoEnum apellido) {
    this.apellido = apellido;
  }

  public ExitoProfesorPost email(EmailEnum email) {
    this.email = email;
    return this;
  }

  /**
   * E-Mail del Profesor
   * @return email
   **/
  @Schema(description = "E-Mail del Profesor")
  
    public EmailEnum getEmail() {
    return email;
  }

  public void setEmail(EmailEnum email) {
    this.email = email;
  }

  public ExitoProfesorPost idCarrera(IdCarreraEnum idCarrera) {
    this.idCarrera = idCarrera;
    return this;
  }

  /**
   * Id de la tabla carreras, relacion con carrera en donde realiza funciones el profesor.
   * @return idCarrera
   **/
  @Schema(description = "Id de la tabla carreras, relacion con carrera en donde realiza funciones el profesor.")
  
    public IdCarreraEnum getIdCarrera() {
    return idCarrera;
  }

  public void setIdCarrera(IdCarreraEnum idCarrera) {
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
    ExitoProfesorPost exitoProfesorPost = (ExitoProfesorPost) o;
    return Objects.equals(this.idProfesor, exitoProfesorPost.idProfesor) &&
        Objects.equals(this.nombre, exitoProfesorPost.nombre) &&
        Objects.equals(this.apellido, exitoProfesorPost.apellido) &&
        Objects.equals(this.email, exitoProfesorPost.email) &&
        Objects.equals(this.idCarrera, exitoProfesorPost.idCarrera);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProfesor, nombre, apellido, email, idCarrera);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExitoProfesorPost {\n");
    
    sb.append("    idProfesor: ").append(toIndentedString(idProfesor)).append("\n");
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
