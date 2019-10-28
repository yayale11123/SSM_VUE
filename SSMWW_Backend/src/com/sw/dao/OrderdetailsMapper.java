package com.sw.dao;

import com.sw.model.Orderdetails;
import com.sw.model.OrderdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdetailsMapper {
	
	
	Integer orderdetailsMaxId();
	
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    long countByExample(OrderdetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int deleteByExample(OrderdetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int deleteByPrimaryKey(Integer orderdetailsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int insert(Orderdetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int insertSelective(Orderdetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    List<Orderdetails> selectByExample(OrderdetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    Orderdetails selectByPrimaryKey(Integer orderdetailsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") Orderdetails record, @Param("example") OrderdetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int updateByExample(@Param("record") Orderdetails record, @Param("example") OrderdetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int updateByPrimaryKeySelective(Orderdetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetails
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int updateByPrimaryKey(Orderdetails record);
}