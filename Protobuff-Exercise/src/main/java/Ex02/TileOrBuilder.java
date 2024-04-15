// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GameMap.proto

package Ex02;

public interface TileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Tile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 groundId = 1;</code>
   * @return Whether the groundId field is set.
   */
  boolean hasGroundId();
  /**
   * <code>optional int32 groundId = 1;</code>
   * @return The groundId.
   */
  int getGroundId();

  /**
   * <code>optional bool isWalkable = 2;</code>
   * @return Whether the isWalkable field is set.
   */
  boolean hasIsWalkable();
  /**
   * <code>optional bool isWalkable = 2;</code>
   * @return The isWalkable.
   */
  boolean getIsWalkable();

  /**
   * <code>repeated int32 items = 3;</code>
   * @return A list containing the items.
   */
  java.util.List<Integer> getItemsList();
  /**
   * <code>repeated int32 items = 3;</code>
   * @return The count of items.
   */
  int getItemsCount();
  /**
   * <code>repeated int32 items = 3;</code>
   * @param index The index of the element to return.
   * @return The items at the given index.
   */
  int getItems(int index);
}