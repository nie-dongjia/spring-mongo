/**
 * Copyright (c) 2020-2025. www.zntie.com All Rights Reserved.
 * 项目名称：隧道监控平台
 * 类名称：ImgInfoController.java
 * 创建人：nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 项目官网:
 */
package com.djn.cn.spring.mongo.controller;

import com.djn.cn.spring.mongo.entity.ImgInfo;
import com.djn.cn.spring.mongo.service.IImgInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>类  名：</b>com.djn.cn.spring.mongo.controller.ImgInfoController<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>nie-dongjia<br/>
 * <b>创建时间：</b>2020/10/13 22:48<br/>
 * <b>修改人：</b>nie-dongjia<br/>
 * <b>修改时间：</b>2020/10/13 22:48<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0<br />
 *
 */
@RestController
@RequestMapping("/img/")
public class ImgInfoController {
    @Autowired
    private IImgInfoService iImgInfoService;
    @PostMapping(value = "add")
    public Object add(@RequestBody final ImgInfo imgInfo){
        try {
            return iImgInfoService.save(imgInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }
    @PostMapping(value = "list-all")
    public Object listAll(@RequestBody final ImgInfo imgInfo){
        try {
            return iImgInfoService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }
    @GetMapping(value = "find-one")
    public Object findOne(){
        try {
            String id = "5f85cd1fe8dee402a0a5177c";
            ImgInfo imgInfo = iImgInfoService.findOne(id);
            return imgInfo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }

}
