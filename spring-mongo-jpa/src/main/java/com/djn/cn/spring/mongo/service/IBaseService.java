package com.djn.cn.spring.mongo.service;

import java.util.List;

/**
 * 
 * <b>类 名：</b>ICommonService<br/>
 * <b>类描述：</b>通用service接口
 * <br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年1月28日 下午9:14:37<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年1月28日 下午9:14:37<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 *
 */
public interface IBaseService<T> {
	/**
	 * save   新增或者更新实体
	 *
	 * @param
	 * @return T
	 * @since 1.0.0
	 * @author op.nie-dongjia
	 */
	T save(T entity);
	/**
	 * findAll   查询所有
	 *        
	 * @param
	 * @return java.util.List<T> 
	 * @since 1.0.0
	 * @author op.nie-dongjia  
	 */
	List<T> findAll();
	/**
	 * findOne   通过id 查找
	 *
	 * @param
	 * @return T
	 * @since 1.0.0
	 * @author op.nie-dongjia
	 */
	T findOne(String id);
	/**
	 * delete   通过Id
	 *        
	 * @param
	 * @return int 
	 * @since 1.0.0
	 * @author op.nie-dongjia  
	 */
	void deleteById(String id);
	/**
	 * delete   删除  通过对象
	 *        
	 * @param
	 * @return int 
	 * @since 1.0.0
	 * @author op.nie-dongjia  
	 */
	void delete(T entity);



}
