package com.berry.cmd.dao;

import com.berry.cmd.po.Music;

public interface MusicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    int deleteByPrimaryKey(Integer keyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    int insert(Music record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    int insertSelective(Music record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    Music selectByPrimaryKey(Integer keyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    int updateByPrimaryKeySelective(Music record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table music
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    int updateByPrimaryKey(Music record);
}