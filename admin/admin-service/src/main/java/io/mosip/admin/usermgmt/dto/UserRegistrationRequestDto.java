package io.mosip.admin.usermgmt.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationRequestDto {

	@NotBlank
	private String userName;
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	@NotBlank
	private String contactNo;
	@NotBlank
	private String emailID;
	@NotBlank
	private LocalDate dateOfBirth;
	@NotBlank
	private String gender;
	@NotBlank
	private String role;
}
