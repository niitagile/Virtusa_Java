package com.virtusa.helloworld;
public class HelloWorldBean 
{
public String message;
//constructor of HelloWorldBean
public HelloWorldBean(String message)
{
this.message=message;
}
//generating getters and setters
public String getMessage()
{
return message;
}
public void setMessage(String message) 
{
this.message = message;
}
@Override
//generate toString
public String toString() 
{
return  message;
}
}