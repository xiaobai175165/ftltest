package com.kgc.drug.service;

import java.util.List;

import com.kgc.drug.entity.DrugTable;
import com.kgc.drug.entity.Users;
import org.apache.ibatis.annotations.Param;




public interface UsersService {
	
	/**
	 * 查询所有已审核用户
	 * @param page
	 * @param size
	 * @return
	 */
	List<Users> getCheckedUsers(@Param("page") Integer page, @Param("size") Integer size);
	
	/**
	 * 查询用户总数量
	 * @return
	 */
	int getUserCount();

	/**
	 * 查询所有待审核用户
	 * @param page
	 * @param size
	 * @return
	 */
	List<Users> getUnCheckedUsers(@Param("page") Integer page, @Param("size") Integer size);
	
	

	/**
	 * 查询所有已审核药品
	 * @param begin
	 * @param size
	 * @return
	 */
	List<DrugTable> getCheckedDrug(@Param("page") Integer page, @Param("size") Integer size);
	
	/**
	 * 查询所有未审核药品
	 * @param begin
	 * @param size
	 * @return
	 */
	List<DrugTable> getUnCheckedDrug(@Param("page") Integer page, @Param("size") Integer size);
	
	
	
	/**
	 * 查询药品总数
	 * @return
	 */
	int getDrugCount();
	
	
	/**
	 * 同意后 通过 uid 修改 状态
	 * @param uid
	 * @return
	 */
	int updateByIdUserYes(@Param("uid") Integer uid);
	
	
	/**
	 * 驳回后 通过 uid 修改 状态
	 * @param uid
	 * @return
	 */
	int updateByIdUserNo(@Param("uid") Integer uid);
	
	/**
	 * 同意后 通过 didi 修改药品 状态
	 * @param didi
	 * @return
	 */
	int updateByIdDrugYes(@Param("didi") Integer didi);
	
	/**
	 * 驳回后 通过 didi 修改药品 状态
	 * @param didi
	 * @return
	 */
	int updateByIdDrugNo(@Param("didi") Integer didi);
	
	/**
	 * 通过 uid  删除用户 
	 * @param uid
	 * @return
	 */
	int deleteByIdUser(@Param("uid") Integer uid);
	
	/**
	 * 通过 didi 删除药品
	 * @param didi
	 * @return
	 */
	int deleteByIdDrug(@Param("didi") Integer didi);
	Users getByUidUser(@Param("uid") Integer uid);
	public DrugTable queryDrug(Integer id);
}
