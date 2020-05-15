/**
 * 
 */
package com.graves.sublibrarytable.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.graves.sublibrarytable.model.Address;

/**  
 * <p>Title: AddressMapper</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年5月15日  
 */
@Mapper
public interface AddressMapper {

	void save(Address address);
	
	Address get(Long id);
}
