package com.raj.mm.impl;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RoomFinder
{
	public static Predicate<ConfRoom> hasProjector()
	{
		return p -> p.hasProjector();
	}
	
	public static Predicate<ConfRoom> hasVideoConf()
	{
		return p -> p.isVideoConf();
	}
	
	public static Predicate<ConfRoom> roomTable(RoomTable roomTable_)
	{
		return p -> p.getTable().equals(roomTable_);
	}
	
	public static List<ConfRoom> getConfRooms(List<ConfRoom> confRooms_, Predicate<ConfRoom> predicate_)
	{
		return confRooms_.stream().filter(predicate_).collect(Collectors.<ConfRoom>toList());
	}
}
