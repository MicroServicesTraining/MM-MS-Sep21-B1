/**
 * 
 */
package com.mm.dms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;*/

/**
 * @author USER
 *
 */

@Data // includes @EqualsAndHashCode, @Getter and @Setter
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode
//@Getter
//@Setter
public class Product {

	private Long prodId;
	private String prodName;
	private String category;
	private Double price;
	
}
