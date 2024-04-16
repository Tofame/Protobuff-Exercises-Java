package Ex02;

import Ex01.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        //System.out.println(gameWorld);
        System.out.println(gameWorld.getMapFloor(0).getTileMapMap().get("420_1"));
        System.out.println("\n=============We have floor atm.");

        // Writing the gameWorld to a .bin file.
        FileOutputStream output = new FileOutputStream("gameWorld.bin");
        gameWorld.writeTo(output);
        output.close();

        // Reading from a .bin file
        GameWorld gameWorldImported = GameWorld.parseFrom(new FileInputStream("gameWorld.bin"));

        // Debug print
        //System.out.println(gameWorldImported);
        System.out.println(gameWorldImported.getMapFloor(0).getTileMapMap().get("420_1"));
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

        // Populate tile_map
        Map<String, Tile> tileMap = new HashMap<>();
        int helpCounter = 1;
        for (Tile tile : tiles) {
            // Assuming you have some unique key for each tile, let's say concatenating x and y coordinates
            String key = 420 + "_" + (helpCounter++);
            tileMap.put(key, tile);
        }
        mapFloorBuilder.putAllTileMap(tileMap); // Use putAllTileMap to populate the map

        return mapFloorBuilder.build();
    }
}
