package TigerIsland.UnitTests;

import TigerIsland.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameStateStartOfTurnTest {
    @Test
    public void testChildrenStart(){
        GameStateStartOfTurn testGamestate = GameStateStartOfTurn.createInitalGameState();

        GameStateWTile testGamestateTile = testGamestate.getChild(new Tile(Terrain.JUNGLE, Terrain.JUNGLE));

        ArrayList<GameStateBeforeBuildAction> tile_children = testGamestateTile.getChildren();

        GameStateBeforeBuildAction beforeBuildAction = tile_children.get(0);

        ArrayList<GameStateStartOfTurn> final_children = beforeBuildAction.getChildren();

        int num_children = final_children.size();

        assertEquals(6, num_children);

    }
}
