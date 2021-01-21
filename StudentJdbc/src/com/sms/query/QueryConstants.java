package com.sms.query;

public interface QueryConstants {
String INSERT_QUERY="insert into Student values(?,?,?)";
String SELECT_QUERY="select * from Student";
String SELECT_SPECIFIC_QUERY="select * from Student where sno=?";
String DELETE_QUERY="delete from Student where sno=?";
String UPDATE_SNAME_QUERY="update Student set sname=? where sno=?";
String UPDATE_SADD_QUERY="update Student set sadd=? where sno=?";
}
