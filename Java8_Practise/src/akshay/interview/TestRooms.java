package akshay.interview;

import java.util.*;

public class TestRooms {
	public static boolean isRoomsVisitable(List<List<Integer>> rooms) {
	    Set<Integer> visitedRooms = new HashSet<>();
	    visitedRooms.add(0);
	    Stack<Integer> nextRoom = new Stack<>();
	    nextRoom.push(0);
	    while (!nextRoom.isEmpty()) {
	        int room = nextRoom.pop();
	        for (int key : rooms.get(room)) {
	            if (!visitedRooms.contains(key)) {
	            	visitedRooms.add(key);
	            	nextRoom.push(key);
	            }
	        }
	    }
	    return visitedRooms.size() == rooms.size();
	}
 
	public static void main(String[] args) {
	    List<List<Integer>> rooms = new ArrayList<>();
	    rooms.add(Arrays.asList(1));
	    rooms.add(Arrays.asList(2));
	    rooms.add(Arrays.asList(3));
	    rooms.add(Arrays.asList(0));
	    TestRooms test = new TestRooms();
	    boolean res=isRoomsVisitable(rooms);
	    System.out.println(res);
	}
 
    
}