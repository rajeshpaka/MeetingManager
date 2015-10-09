package com.raj.mm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.raj.mm.impl.ConfRoom;
import com.raj.mm.impl.RoomFinder;
import com.raj.mm.impl.RoomTable;

public class TestRoomManager
{
	public static void main(String[] args)
	{
		// LARGE - YES PROJECTOR - NO VIDO CONF
		ConfRoom cr1 = new ConfRoom("3.301");
		cr1.setChairs(20);
		cr1.setTable(RoomTable.LARGE);
		cr1.setProjector(true);
		cr1.setVideoConf(false);

		// SMALL - NO PROJECTOR - NO VIDO CONF
		ConfRoom cr2 = new ConfRoom("3.302");
		cr2.setChairs(4);
		cr2.setTable(RoomTable.SMALL);
		cr2.setProjector(false);
		cr2.setVideoConf(false);

		// SMALL - NO PROJECTOR - NO VIDO CONF
		ConfRoom cr3 = new ConfRoom("3.303");
		cr3.setChairs(4);
		cr3.setTable(RoomTable.SMALL);
		cr3.setProjector(true);
		cr3.setVideoConf(false);

		// LARGE - YES PROJECTOR - YES VIDO CONF
		ConfRoom cr4 = new ConfRoom("3.304");
		cr4.setChairs(20);
		cr4.setTable(RoomTable.LARGE);
		cr4.setProjector(true);
		cr4.setVideoConf(true);

		List<ConfRoom> confRooms = new ArrayList<ConfRoom>();
		confRooms.addAll(Arrays.asList(new ConfRoom[] { cr1, cr2, cr3, cr4 }));

		List<ConfRoom> confRoomWithProjectors = RoomFinder.getConfRooms(confRooms, RoomFinder.hasProjector());
		List<ConfRoom> confRoomWithVideoConf = RoomFinder.getConfRooms(confRooms, RoomFinder.hasVideoConf());
		List<ConfRoom> smallConfRoom = RoomFinder.getConfRooms(confRooms, RoomFinder.roomTable(RoomTable.SMALL));
		List<ConfRoom> smallConfRoomWithProjector = RoomFinder.getConfRooms(smallConfRoom, RoomFinder.hasProjector());
		
		System.out.println("Room with Projector : " + confRoomWithProjectors);
		System.out.println("Room with Video Conf : " + confRoomWithVideoConf);
		System.out.println("Small Room Table : " + smallConfRoom);
		System.out.println("Small Room Table With Projector: " + smallConfRoomWithProjector);

	}

}
