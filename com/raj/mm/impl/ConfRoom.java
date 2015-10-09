package com.raj.mm.impl;

public class ConfRoom extends Room
{
	public ConfRoom(String name_)
	{
		super(name_);
	}
	public boolean hasProjector()
	{
		return _projector;
	}
	public void setProjector(boolean projector)
	{
		this._projector = projector;
	}
	public int getChairs()
	{
		return _chairs;
	}
	public void setChairs(int chairs)
	{
		this._chairs = chairs;
	}
	public boolean isVideoConf()
	{
		return _videoConf;
	}
	public void setVideoConf(boolean videoConf)
	{
		this._videoConf = videoConf;
	}
	public RoomTable getTable()
	{
		return _table;
	}
	public void setTable(RoomTable table)
	{
		this._table = table;
	}

	public String toString()
	{
		return super.getName();
	}
	
	private int _chairs;
	private boolean _videoConf;
	private RoomTable _table;
	private boolean _projector;
}
