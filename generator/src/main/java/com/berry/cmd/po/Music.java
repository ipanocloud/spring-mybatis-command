package com.berry.cmd.po;

import java.util.Date;

/**
 * Database Table Remarks:
 *   音乐
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table music
 *
 * @mbg.generated do_not_delete_during_merge Tue Apr 24 15:28:11 CST 2018
 */
public class Music {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music.keyid
     *
     * @mbg.generated Tue Apr 24 15:28:11 CST 2018
     */
    private Integer keyid;

    /**
     * Database Column Remarks:
     *   名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music.name
     *
     * @mbg.generated Tue Apr 24 15:28:11 CST 2018
     */
    private String name;

    /**
     * Database Column Remarks:
     *   作者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music.author
     *
     * @mbg.generated Tue Apr 24 15:28:11 CST 2018
     */
    private String author;

    /**
     * Database Column Remarks:
     *   发行时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music.pub_date
     *
     * @mbg.generated Tue Apr 24 15:28:11 CST 2018
     */
    private Date pubDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music.keyid
     *
     * @return the value of music.keyid
     *
     * @mbg.generated Tue Apr 24 15:28:11 CST 2018
     */
    public Integer getKeyid() {
        return keyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music.keyid
     *
     * @param keyid the value for music.keyid
     *
     * @mbg.generated Tue Apr 24 15:28:11 CST 2018
     */
    public void setKeyid(Integer keyid) {
        this.keyid = keyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music.name
     *
     * @return the value of music.name
     *
     * @mbg.generated Tue Apr 24 15:28:11 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music.name
     *
     * @param name the value for music.name
     *
     * @mbg.generated Tue Apr 24 15:28:11 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music.author
     *
     * @return the value of music.author
     *
     * @mbg.generated Tue Apr 24 15:28:11 CST 2018
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music.author
     *
     * @param author the value for music.author
     *
     * @mbg.generated Tue Apr 24 15:28:11 CST 2018
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music.pub_date
     *
     * @return the value of music.pub_date
     *
     * @mbg.generated Tue Apr 24 15:28:11 CST 2018
     */
    public Date getPubDate() {
        return pubDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music.pub_date
     *
     * @param pubDate the value for music.pub_date
     *
     * @mbg.generated Tue Apr 24 15:28:11 CST 2018
     */
    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }
}