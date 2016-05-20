package threes;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class SaveManagerTests {

	ISaveManager saveManagerMock;
	ThreesController threes;
	
	@Before
	public void setUp() throws Exception {		
		saveManagerMock = niceMock(ISaveManager.class);
		threes = new ThreesController();
		threes.setSaveManager(saveManagerMock);
		expect(saveManagerMock.setFolder("juegosGuardados")).andReturn((boolean) true);
		expect(saveManagerMock.setFolder(null)).andThrow(new IOException());
		
		ThreesBoard board = new ThreesBoard();
		Map<ThreesBoard,Integer> map = new HashMap <ThreesBoard,Integer>();
		map.put(board, 1);
		expect(saveManagerMock.loadFromFile("jueguito.ths")).andReturn((Map.Entry<ThreesBoard, Integer>) map.entrySet().iterator().next());
		expect(saveManagerMock.loadFromFile("nombreIncorrecto.ths")).andReturn(null);
		replay(saveManagerMock);
	}
	
	@Test
	public void saveGameTest1 (){
		boolean saveResult = threes.saveGame("juegosGuardados", "jueguito");
		assertTrue(!saveResult);
	}
	
	@Test
	public void saveGameTest2 (){
		boolean saveResult = threes.saveGame("juegosGuardados", "jueg.uito");
		assertTrue(!saveResult);
	}
	
	@Test
	public void saveGameTest3 (){
		boolean saveResult = threes.saveGame("nombreErroneo", "jueguito");
		assertTrue(!saveResult);
	}
	
	@Test
	public void saveGameTest4 () throws IOException{
		boolean saveResult = threes.saveGame(null, "jueguito");
		assertTrue(!saveResult);
	}
	
	@Test
	public void loadGameTest1 (){
		boolean loadResult = threes.loadGame("juegosGuardados", "jueguito");
		assertTrue(!loadResult);
	}

	@Test
	public void loadGameTest2 (){
		boolean loadResult = threes.loadGame("juegosGuardados", "jueguito.ths");
		assertTrue(!loadResult);
	}
	
	@Test
	public void loadGameTest3 (){
		boolean loadResult = threes.loadGame("nombreErroneo", "jueguito.ths");
		assertTrue(!loadResult);
	}
	
	@Test
	public void loadGameTest4 (){
		boolean loadResult = threes.loadGame("juegosGuardados", "nombreIncorrecto.ths");
		assertTrue(!loadResult);
	}
	
	@Test
	public void loadGameTest5 (){
		boolean loadResult = threes.loadGame(null, "nombreIncorrecto.ths");
		assertTrue(!loadResult);
	}
}
