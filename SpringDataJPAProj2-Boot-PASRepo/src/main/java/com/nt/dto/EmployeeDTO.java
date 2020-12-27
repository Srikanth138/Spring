package com.nt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @Data
 * @see Getter
 * @see Setter
 * @see RequiredArgsConstructor
 * @see ToString
 * @see EqualsAndHashCode
 * @see lombok.Value
 */
@Data // All the setter, getter, equals(object),hashCode,ToString
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class EmployeeDTO {

	private Integer eno;

	@NonNull //->RequiredArgsConstructor
	private String ename;
	@NonNull
	private String eadd;
	@NonNull
	private String eSalary;

	public EmployeeDTO(int eno) {
		this.eno = eno;
	}

}
