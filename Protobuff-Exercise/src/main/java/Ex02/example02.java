package Ex02;

import java.util.ArrayList;
import java.util.List;

public class example02 {
    public static void runExample02() throws Exception {
        // Using .Builder for building the Tile
        List<Tile> tiles = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            tiles.add(createTile(i));
        }

        // Create a MapFloor
        MapFloor mapFloor = createFloor(1, tiles);

        // Create a GameWorld.Builder
        GameWorld.Builder gameWorldBuilder = GameWorld.newBuilder();
        gameWorldBuilder.addMapFloor(mapFloor);
        GameWorld gameWorld = gameWorldBuilder.build();

        // Debug print
        //System.out.println(mapFloor.getTiles(0));
        System.out.println(gameWorld);
    }
    public static Tile createTile(int groundId) throws Exception {
        Tile.Builder tileBuilder = Tile.newBuilder();
        tileBuilder.setGroundId(groundId);
        tileBuilder.setIsWalkable(false);
        for(int i = 0; i < 9; i++) {
            tileBuilder.addItem((int)(Math.random() * 5));
        }

        return tileBuilder.build();
    }

    public static MapFloor createFloor(int floorId, List<Tile> tiles) {
        MapFloor.Builder mapFloorBuilder = MapFloor.newBuilder();
        mapFloorBuilder.setFloorId(floorId); // Set the floor ID as needed
        mapFloorBuilder.addAllTile(tiles); // Add all tiles to the MapFloor

        return mapFloorBuilder.build();
    }
}
