package Ex02;

import java.util.ArrayList;
import java.util.List;

public class example02 {
    public static void runExample02() throws Exception {
        // Using .Builder for building the Tile
        List<Tile> tiles = new ArrayList<>();

        Tile.Builder tileBuilder = Tile.newBuilder();
        for(int i = 0; i < 5; i++) {
            tiles.add(createTile(tileBuilder, i));
        }

        // Create a MapFloor
        MapFloor.Builder mapFloorBuilder = MapFloor.newBuilder();
        mapFloorBuilder.setFloorId(1); // Set the floor ID as needed
        mapFloorBuilder.addAllTiles(tiles); // Add all tiles to the MapFloor

        // Build the MapFloor
        MapFloor mapFloor = mapFloorBuilder.build();

        // Debug print
        System.out.println(mapFloor.getTiles(0));
    }
    public static Tile createTile(Tile.Builder tileBuilder, int index) throws Exception {
        tileBuilder.setGroundId(index);
        tileBuilder.setIsWalkable(false);
        for(int i = 0; i < 9; i++) {
            tileBuilder.addItems((int)(Math.random() * 5));
        }

        return tileBuilder.build();
    }
}
