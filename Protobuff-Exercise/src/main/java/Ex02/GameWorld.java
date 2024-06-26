// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GameMap.proto

package Ex02;

/**
 * Protobuf type {@code GameWorld}
 */
public final class GameWorld extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GameWorld)
        GameWorldOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GameWorld.newBuilder() to construct.
  private GameWorld(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameWorld() {
    mapFloor_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new GameWorld();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GameMap.internal_static_GameWorld_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GameMap.internal_static_GameWorld_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GameWorld.class, GameWorld.Builder.class);
  }

  public static final int MAPFLOOR_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<MapFloor> mapFloor_;
  /**
   * <code>repeated .MapFloor mapFloor = 1;</code>
   */
  @Override
  public java.util.List<MapFloor> getMapFloorList() {
    return mapFloor_;
  }
  /**
   * <code>repeated .MapFloor mapFloor = 1;</code>
   */
  @Override
  public java.util.List<? extends MapFloorOrBuilder>
      getMapFloorOrBuilderList() {
    return mapFloor_;
  }
  /**
   * <code>repeated .MapFloor mapFloor = 1;</code>
   */
  @Override
  public int getMapFloorCount() {
    return mapFloor_.size();
  }
  /**
   * <code>repeated .MapFloor mapFloor = 1;</code>
   */
  @Override
  public MapFloor getMapFloor(int index) {
    return mapFloor_.get(index);
  }
  /**
   * <code>repeated .MapFloor mapFloor = 1;</code>
   */
  @Override
  public MapFloorOrBuilder getMapFloorOrBuilder(
      int index) {
    return mapFloor_.get(index);
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
    for (int i = 0; i < mapFloor_.size(); i++) {
      output.writeMessage(1, mapFloor_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mapFloor_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, mapFloor_.get(i));
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
    if (!(obj instanceof GameWorld)) {
      return super.equals(obj);
    }
    GameWorld other = (GameWorld) obj;

    if (!getMapFloorList()
        .equals(other.getMapFloorList())) return false;
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
    if (getMapFloorCount() > 0) {
      hash = (37 * hash) + MAPFLOOR_FIELD_NUMBER;
      hash = (53 * hash) + getMapFloorList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GameWorld parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GameWorld parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GameWorld parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GameWorld parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GameWorld parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GameWorld parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GameWorld parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GameWorld parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static GameWorld parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static GameWorld parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GameWorld parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GameWorld parseFrom(
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
  public static Builder newBuilder(GameWorld prototype) {
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
   * Protobuf type {@code GameWorld}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GameWorld)
          GameWorldOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GameMap.internal_static_GameWorld_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GameMap.internal_static_GameWorld_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GameWorld.class, GameWorld.Builder.class);
    }

    // Construct using GeneratedEx02Proto.GameWorld.newBuilder()
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
      if (mapFloorBuilder_ == null) {
        mapFloor_ = java.util.Collections.emptyList();
      } else {
        mapFloor_ = null;
        mapFloorBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GameMap.internal_static_GameWorld_descriptor;
    }

    @Override
    public GameWorld getDefaultInstanceForType() {
      return GameWorld.getDefaultInstance();
    }

    @Override
    public GameWorld build() {
      GameWorld result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public GameWorld buildPartial() {
      GameWorld result = new GameWorld(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(GameWorld result) {
      if (mapFloorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mapFloor_ = java.util.Collections.unmodifiableList(mapFloor_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mapFloor_ = mapFloor_;
      } else {
        result.mapFloor_ = mapFloorBuilder_.build();
      }
    }

    private void buildPartial0(GameWorld result) {
      int from_bitField0_ = bitField0_;
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof GameWorld) {
        return mergeFrom((GameWorld)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GameWorld other) {
      if (other == GameWorld.getDefaultInstance()) return this;
      if (mapFloorBuilder_ == null) {
        if (!other.mapFloor_.isEmpty()) {
          if (mapFloor_.isEmpty()) {
            mapFloor_ = other.mapFloor_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMapFloorIsMutable();
            mapFloor_.addAll(other.mapFloor_);
          }
          onChanged();
        }
      } else {
        if (!other.mapFloor_.isEmpty()) {
          if (mapFloorBuilder_.isEmpty()) {
            mapFloorBuilder_.dispose();
            mapFloorBuilder_ = null;
            mapFloor_ = other.mapFloor_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mapFloorBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMapFloorFieldBuilder() : null;
          } else {
            mapFloorBuilder_.addAllMessages(other.mapFloor_);
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
            case 10: {
              MapFloor m =
                  input.readMessage(
                      MapFloor.parser(),
                      extensionRegistry);
              if (mapFloorBuilder_ == null) {
                ensureMapFloorIsMutable();
                mapFloor_.add(m);
              } else {
                mapFloorBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<MapFloor> mapFloor_ =
      java.util.Collections.emptyList();
    private void ensureMapFloorIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mapFloor_ = new java.util.ArrayList<MapFloor>(mapFloor_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            MapFloor, MapFloor.Builder, MapFloorOrBuilder> mapFloorBuilder_;

    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public java.util.List<MapFloor> getMapFloorList() {
      if (mapFloorBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mapFloor_);
      } else {
        return mapFloorBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public int getMapFloorCount() {
      if (mapFloorBuilder_ == null) {
        return mapFloor_.size();
      } else {
        return mapFloorBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public MapFloor getMapFloor(int index) {
      if (mapFloorBuilder_ == null) {
        return mapFloor_.get(index);
      } else {
        return mapFloorBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public Builder setMapFloor(
        int index, MapFloor value) {
      if (mapFloorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMapFloorIsMutable();
        mapFloor_.set(index, value);
        onChanged();
      } else {
        mapFloorBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public Builder setMapFloor(
        int index, MapFloor.Builder builderForValue) {
      if (mapFloorBuilder_ == null) {
        ensureMapFloorIsMutable();
        mapFloor_.set(index, builderForValue.build());
        onChanged();
      } else {
        mapFloorBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public Builder addMapFloor(MapFloor value) {
      if (mapFloorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMapFloorIsMutable();
        mapFloor_.add(value);
        onChanged();
      } else {
        mapFloorBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public Builder addMapFloor(
        int index, MapFloor value) {
      if (mapFloorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMapFloorIsMutable();
        mapFloor_.add(index, value);
        onChanged();
      } else {
        mapFloorBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public Builder addMapFloor(
        MapFloor.Builder builderForValue) {
      if (mapFloorBuilder_ == null) {
        ensureMapFloorIsMutable();
        mapFloor_.add(builderForValue.build());
        onChanged();
      } else {
        mapFloorBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public Builder addMapFloor(
        int index, MapFloor.Builder builderForValue) {
      if (mapFloorBuilder_ == null) {
        ensureMapFloorIsMutable();
        mapFloor_.add(index, builderForValue.build());
        onChanged();
      } else {
        mapFloorBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public Builder addAllMapFloor(
        Iterable<? extends MapFloor> values) {
      if (mapFloorBuilder_ == null) {
        ensureMapFloorIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mapFloor_);
        onChanged();
      } else {
        mapFloorBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public Builder clearMapFloor() {
      if (mapFloorBuilder_ == null) {
        mapFloor_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mapFloorBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public Builder removeMapFloor(int index) {
      if (mapFloorBuilder_ == null) {
        ensureMapFloorIsMutable();
        mapFloor_.remove(index);
        onChanged();
      } else {
        mapFloorBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public MapFloor.Builder getMapFloorBuilder(
        int index) {
      return getMapFloorFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public MapFloorOrBuilder getMapFloorOrBuilder(
        int index) {
      if (mapFloorBuilder_ == null) {
        return mapFloor_.get(index);  } else {
        return mapFloorBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public java.util.List<? extends MapFloorOrBuilder>
         getMapFloorOrBuilderList() {
      if (mapFloorBuilder_ != null) {
        return mapFloorBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mapFloor_);
      }
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public MapFloor.Builder addMapFloorBuilder() {
      return getMapFloorFieldBuilder().addBuilder(
          MapFloor.getDefaultInstance());
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public MapFloor.Builder addMapFloorBuilder(
        int index) {
      return getMapFloorFieldBuilder().addBuilder(
          index, MapFloor.getDefaultInstance());
    }
    /**
     * <code>repeated .MapFloor mapFloor = 1;</code>
     */
    public java.util.List<MapFloor.Builder>
         getMapFloorBuilderList() {
      return getMapFloorFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
            MapFloor, MapFloor.Builder, MapFloorOrBuilder>
        getMapFloorFieldBuilder() {
      if (mapFloorBuilder_ == null) {
        mapFloorBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                MapFloor, MapFloor.Builder, MapFloorOrBuilder>(
                mapFloor_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mapFloor_ = null;
      }
      return mapFloorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GameWorld)
  }

  // @@protoc_insertion_point(class_scope:GameWorld)
  private static final GameWorld DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GameWorld();
  }

  public static GameWorld getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameWorld>
      PARSER = new com.google.protobuf.AbstractParser<GameWorld>() {
    @Override
    public GameWorld parsePartialFrom(
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

  public static com.google.protobuf.Parser<GameWorld> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GameWorld> getParserForType() {
    return PARSER;
  }

  @Override
  public GameWorld getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

