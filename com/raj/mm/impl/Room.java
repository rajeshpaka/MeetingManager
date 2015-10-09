package com.raj.mm.impl;

public class Room
{
	private String _name;
	private int _sqrft;
	
	public Room(String name_)
	{
		this._name = name_;
	}
	
	public Room(String name_,  int sqrft_)
	{
		this._name = name_;
		this._sqrft = sqrft_;
	}
	
	public void setSQFT(int sqrft_)
	{
		this._sqrft = sqrft_;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public int getSQRFT()
	{
		return _sqrft;
	}
}
