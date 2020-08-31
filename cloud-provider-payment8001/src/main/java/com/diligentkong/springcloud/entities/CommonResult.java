package com.diligentkong.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author diligentkong
 * @date 2020/8/7 0007 10:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

   public CommonResult(Integer code,String message){
       this(code,message,null);
   }
}
