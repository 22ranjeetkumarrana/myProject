package com.example.ranjeetkumarrana.myapplication.Mode;

public class User
{
    private String name,email,password,phone;

    public User()
    {

    }

    public User(String name, String email, String password, String phone)
    {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }
    //name
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    //email
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    //passworrd
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    //phone
    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
}
