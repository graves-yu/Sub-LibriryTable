/**
 * 
 */
package com.graves.sublibrarytable.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.graves.sublibrarytable.mapper.UserMapper;
import com.graves.sublibrarytable.model.User;

/**  
 * <p>Title: UserController</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年5月15日  
 */
@Controller
public class UserController {
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/user/save")
	@ResponseBody
	public String save() {
        for (int i = 0; i <10 ; i++) {
            User user=new User();
            user.setName("test"+i);
            user.setCityId(i%2==0?1:2);
            user.setCreateTime(new Date());
            
            int sex = 0;
            if (i%3==0) {
            	sex = 1;
			} 
            if (i%3==1) {
            	sex = 2;
			} 
            if (i%3==2) {
            	sex = 1;
			} 
            user.setSex(sex);
            user.setPhone("11111111"+i);
            user.setEmail("xxxxx");
            user.setCreateTime(new Date());
            user.setPassword("eeeeeeeeeeee");
            userMapper.save(user);
        }

		return "success";
	}
	
	@RequestMapping("/user/get/{id}")
	@ResponseBody
	public User get(@PathVariable Long id) {
		User user =  userMapper.get(id);
		System.out.println(user.getId());
		return user;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i <10 ; i++) {
			int cityId = i%2==0?1:2;
			int sex = 0;
            if (i%3==0) {
            	sex = 1;
			} 
            if (i%3==1) {
            	sex = 2;
			} else {
            	sex = 1;
			} 
            
            System.out.println(cityId + " ---" + sex);
		}
	}
}
