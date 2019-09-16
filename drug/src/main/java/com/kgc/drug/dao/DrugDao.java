package com.kgc.drug.dao;

import java.util.List;

import com.kgc.drug.entity.Drug;
import com.kgc.drug.entity.Mintype;
import com.kgc.drug.entity.Order;
import com.kgc.drug.entity.Order1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface DrugDao {
	int addDrug(Drug drug);
    List<Mintype> getAllMin();
    List<Drug> getAllDrug(@Param("num") Integer num, @Param("pageSize") Integer pageSize, @Param("id") Integer id);
    int updateCount(@Param("id") Integer id, @Param("count") Integer count, @Param("price") double price);
    List<Drug> getAllDrug1(int id);
    int deleteDrug(int id);
    Drug getDrugById(int id);
	List<Order1> getTimeOrder(@Param("uid") int id, @Param("goTime") String goTime, @Param("toTime") String toTime, @Param("xuanze") Integer xuanze);
	List<Order1> getTimeOrder1(@Param("uid") int id, @Param("goTime") String goTime, @Param("toTime") String toTime, @Param("xuanze") Integer xuanze, @Param("num") Integer num, @Param("pageSize") Integer pageSize);
	List<Order1> getTimeOrder2(@Param("uid") int id, @Param("goTime") String goTime, @Param("toTime") String toTime, @Param("xuanze") Integer xuanze);
	List<Order1> getTimeOrder3(@Param("uid") int id, @Param("goTime") String goTime, @Param("toTime") String toTime, @Param("xuanze") Integer xuanze, @Param("num") Integer num, @Param("pageSize") Integer pageSize);
	List<Order1> getTimeOrder5(@Param("goTime") String goTime, @Param("toTime") String toTime);
	List<Order1> getTimeOrder6(@Param("goTime") String goTime, @Param("toTime") String toTime, @Param("num") Integer num, @Param("pageSize") Integer pageSize);

}
