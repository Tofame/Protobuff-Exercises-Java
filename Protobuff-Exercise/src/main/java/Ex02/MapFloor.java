// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GameMap.proto

package Ex02;

/**
 * Protobuf type {@code MapFloor}
 */
public final class MapFloor extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MapFloor)
        MapFloorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MapFloor.newBuilder() to construct.
  private MapFloor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MapFloor() {
    tile_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new MapFloor();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GameMap.internal_static_MapFloor_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GameMap.internal_static_MapFloor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MapFloor.class, MapFloor.Builder.class);
  }

  private int bitField0_;
  public static final int FLOORID_FIELD_NUMBER = 4;
  private int floorId_ = 0;
  /**
   * <code>optional int32 floorId = 4;</code>
   * @return Whether the floorId field is set.
   */
  @Override
  public boolean hasFloorId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 floorId = 4;</code>
   * @return The floorId.
   */
  @Override
  public int getFloorId() {
    return floorId_;
  }

  public static final int TILE_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private java.util.List<Tile> tile_;
  /**
   * <code>repeated .Tile tile = 5;</code>
   */
  @Override
  public java.util.List<Tile> getTileList() {
    return tile_;
  }
  /**
   * <code>repeated .Tile tile = 5;</code>
   */
  @Override
  public java.util.List<? extends TileOrBuilder>
      getTileOrBuilderList() {
    return tile_;
  }
  /**
   * <code>repeated .Tile tile = 5;</code>
   */
  @Override
  public int getTileCount() {
    return tile_.size();
  }
  /**
   * <code>repeated .Tile tile = 5;</code>
   */
  @Override
  public Tile getTile(int index) {
    return tile_.get(index);
  }
  /**
   * <code>repeated .Tile tile = 5;</code>
   */
  @Override
  public TileOrBuilder getTileOrBuilder(
      int index) {
    return tile_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(4, floorId_);
    }
    for (int i = 0; i < tile_.size(); i++) {
      output.writeMessage(5, tile_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, floorId_);
    }
    for (int i = 0; i < tile_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, tile_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof MapFloor)) {
      return super.equals(obj);
    }
    MapFloor other = (MapFloor) obj;

    if (hasFloorId() != other.hasFloorId()) return false;
    if (hasFloorId()) {
      if (getFloorId()
          != other.getFloorId()) return false;
    }
    if (!getTileList()
        .equals(other.getTileList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasFloorId()) {
      hash = (37 * hash) + FLOORID_FIELD_NUMBER;
      hash = (53 * hash) + getFloorId();
    }
    if (getTileCount() > 0) {
      hash = (37 * hash) + TILE_FIELD_NUMBER;
      hash = (53 * hash) + getTileList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static MapFloor parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MapFloor parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MapFloor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MapFloor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MapFloor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MapFloor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MapFloor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MapFloor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static MapFloor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static MapFloor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static MapFloor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MapFloor parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(MapFloor prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code MapFloor}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MapFloor)
          MapFloorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GameMap.internal_static_MapFloor_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GameMap.internal_static_MapFloor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MapFloor.class, MapFloor.Builder.class);
    }

    // Construct using GeneratedProto.MapFloor.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      floorId_ = 0;
      if (tileBuilder_ == null) {
        tile_ = java.util.Collections.emptyList();
      } else {
        tile_ = null;
        tileBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GameMap.internal_static_MapFloor_descriptor;
    }

    @Override
    public MapFloor getDefaultInstanceForType() {
      return MapFloor.getDefaultInstance();
    }

    @Override
    public MapFloor build() {
      MapFloor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public MapFloor buildPartial() {
      MapFloor result = new MapFloor(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(MapFloor result) {
      if (tileBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          tile_ = java.util.Collections.unmodifiableList(tile_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.tile_ = tile_;
      } else {
        result.tile_ = tileBuilder_.build();
      }
    }

    private void buildPartial0(MapFloor result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.floorId_ = floorId_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof MapFloor) {
        return mergeFrom((MapFloor)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MapFloor other) {
      if (other == MapFloor.getDefaultInstance()) return this;
      if (other.hasFloorId()) {
        setFloorId(other.getFloorId());
      }
      if (tileBuilder_ == null) {
        if (!other.tile_.isEmpty()) {
          if (tile_.isEmpty()) {
            tile_ = other.tile_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTileIsMutable();
            tile_.addAll(other.tile_);
          }
          onChanged();
        }
      } else {
        if (!other.tile_.isEmpty()) {
          if (tileBuilder_.isEmpty()) {
            tileBuilder_.dispose();
            tileBuilder_ = null;
            tile_ = other.tile_;
            bitField0_ = (bitField0_ & ~0x00000002);
            tileBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTileFieldBuilder() : null;
          } else {
            tileBuilder_.addAllMessages(other.tile_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 32: {
              floorId_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 32
            case 42: {
              Tile m =
                  input.readMessage(
                      Tile.parser(),
                      extensionRegistry);
              if (tileBuilder_ == null) {
                ensureTileIsMutable();
                tile_.add(m);
              } else {
                tileBuilder_.addMessage(m);
              }
              break;
            } // case 42
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int floorId_ ;
    /**
     * <code>optional int32 floorId = 4;</code>
     * @return Whether the floorId field is set.
     */
    @Override
    public boolean hasFloorId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 floorId = 4;</code>
     * @return The floorId.
     */
    @Override
    public int getFloorId() {
      return floorId_;
    }
    /**
     * <code>optional int32 floorId = 4;</code>
     * @param value The floorId to set.
     * @return This builder for chaining.
     */
    public Builder setFloorId(int value) {

      floorId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 floorId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFloorId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      floorId_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<Tile> tile_ =
      java.util.Collections.emptyList();
    private void ensureTileIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        tile_ = new java.util.ArrayList<Tile>(tile_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            Tile, Tile.Builder, TileOrBuilder> tileBuilder_;

    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public java.util.List<Tile> getTileList() {
      if (tileBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tile_);
      } else {
        return tileBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public int getTileCount() {
      if (tileBuilder_ == null) {
        return tile_.size();
      } else {
        return tileBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public Tile getTile(int index) {
      if (tileBuilder_ == null) {
        return tile_.get(index);
      } else {
        return tileBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public Builder setTile(
        int index, Tile value) {
      if (tileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTileIsMutable();
        tile_.set(index, value);
        onChanged();
      } else {
        tileBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public Builder setTile(
        int index, Tile.Builder builderForValue) {
      if (tileBuilder_ == null) {
        ensureTileIsMutable();
        tile_.set(index, builderForValue.build());
        onChanged();
      } else {
        tileBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public Builder addTile(Tile value) {
      if (tileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTileIsMutable();
        tile_.add(value);
        onChanged();
      } else {
        tileBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public Builder addTile(
        int index, Tile value) {
      if (tileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTileIsMutable();
        tile_.add(index, value);
        onChanged();
      } else {
        tileBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public Builder addTile(
        Tile.Builder builderForValue) {
      if (tileBuilder_ == null) {
        ensureTileIsMutable();
        tile_.add(builderForValue.build());
        onChanged();
      } else {
        tileBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public Builder addTile(
        int index, Tile.Builder builderForValue) {
      if (tileBuilder_ == null) {
        ensureTileIsMutable();
        tile_.add(index, builderForValue.build());
        onChanged();
      } else {
        tileBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public Builder addAllTile(
        Iterable<? extends Tile> values) {
      if (tileBuilder_ == null) {
        ensureTileIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tile_);
        onChanged();
      } else {
        tileBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public Builder clearTile() {
      if (tileBuilder_ == null) {
        tile_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        tileBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public Builder removeTile(int index) {
      if (tileBuilder_ == null) {
        ensureTileIsMutable();
        tile_.remove(index);
        onChanged();
      } else {
        tileBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public Tile.Builder getTileBuilder(
        int index) {
      return getTileFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public TileOrBuilder getTileOrBuilder(
        int index) {
      if (tileBuilder_ == null) {
        return tile_.get(index);  } else {
        return tileBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public java.util.List<? extends TileOrBuilder>
         getTileOrBuilderList() {
      if (tileBuilder_ != null) {
        return tileBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tile_);
      }
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public Tile.Builder addTileBuilder() {
      return getTileFieldBuilder().addBuilder(
          Tile.getDefaultInstance());
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public Tile.Builder addTileBuilder(
        int index) {
      return getTileFieldBuilder().addBuilder(
          index, Tile.getDefaultInstance());
    }
    /**
     * <code>repeated .Tile tile = 5;</code>
     */
    public java.util.List<Tile.Builder>
         getTileBuilderList() {
      return getTileFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
            Tile, Tile.Builder, TileOrBuilder>
        getTileFieldBuilder() {
      if (tileBuilder_ == null) {
        tileBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                Tile, Tile.Builder, TileOrBuilder>(
                tile_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        tile_ = null;
      }
      return tileBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:MapFloor)
  }

  // @@protoc_insertion_point(class_scope:MapFloor)
  private static final MapFloor DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MapFloor();
  }

  public static MapFloor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MapFloor>
      PARSER = new com.google.protobuf.AbstractParser<MapFloor>() {
    @Override
    public MapFloor parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MapFloor> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<MapFloor> getParserForType() {
    return PARSER;
  }

  @Override
  public MapFloor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

