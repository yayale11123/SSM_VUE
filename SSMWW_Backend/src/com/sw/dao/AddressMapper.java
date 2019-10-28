package com.sw.dao;

import com.sw.model.Address;
import com.sw.model.AddressExample;
import com.sw.util.Page;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressMapper {
	
	List<Address> addressALL();
	List<Address> addressALLByPage(@Param("page") Page page);
	Integer addressMaxId();//获取当前最大的addresssMaxId
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    long countByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int deleteByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int deleteByPrimaryKey(Integer addressid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int insert(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int insertSelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    List<Address> selectByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    Address selectByPrimaryKey(Integer addressid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int updateByPrimaryKeySelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    int updateByPrimaryKey(Address record);
    
    
}