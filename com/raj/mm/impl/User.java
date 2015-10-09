package com.raj.mm.impl;

public class User
{
	private String _name;
	private String _uniqueKey;
	
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
		return _uniqueKey;
	}
	public void setPmfkey(String pmfkey)
	{
		this._uniqueKey = pmfkey;
	}
	
	public User(String name_, String pmfkey_)
	{
		this._name = name_;
		this._uniqueKey = pmfkey_;
	}
}
