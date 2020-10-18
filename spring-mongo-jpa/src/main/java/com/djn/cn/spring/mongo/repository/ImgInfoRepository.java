/**
 * Copyright (c) 2020-2025. www.zntie.com All Rights Reserved.
 * 项目名称：隧道监控平台
 * 类名称：ImgInfoRepository.java
 * 创建人：nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 项目官网:
 */
package com.djn.cn.spring.mongo.repository;

import com.djn.cn.spring.mongo.entity.ImgInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * <b>接口名：</b>com.djn.cn.spring.mongo.repository.ImgInfoRepository<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>nie-dongjia<br/>
 * <b>创建时间：</b>2020/10/13 22:36<br/>
 * <b>修改人：</b>nie-dongjia<br/>
 * <b>修改时间：</b>2020/10/13 22:36<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0<br />
 *
 */
@Repository
public interface ImgInfoRepository extends MongoRepository<ImgInfo,String> {

}
