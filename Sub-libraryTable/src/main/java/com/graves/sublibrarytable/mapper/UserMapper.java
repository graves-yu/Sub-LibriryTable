/**
 * 
 */
package com.graves.sublibrarytable.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.graves.sublibrarytable.model.User;

/**  
 * <p>Title: UserMapper</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年5月15日  
 */
@Mapper
public interface UserMapper {

	void save(User user);
	
	
	User get(Long id);
}
