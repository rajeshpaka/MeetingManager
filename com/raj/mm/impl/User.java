package com.raj.mm.impl;

public class User
{
	private String _name;
	private String _pmfkey;
	
	public String getName()
	{
		return _name;
	}
	public void setName(String name)
	{
		this._name = name;
	}
	public String getPmfkey()
	{
		return _pmfkey;
	}
	public void setPmfkey(String pmfkey)
	{
		this._pmfkey = pmfkey;
	}
	
	public User(String name_, String pmfkey_)
	{
		this._name = name_;
		this._pmfkey = pmfkey_;
	}
}
