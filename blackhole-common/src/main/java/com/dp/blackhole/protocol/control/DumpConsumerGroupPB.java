// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DumpConsumerGroup.proto

package com.dp.blackhole.protocol.control;

public final class DumpConsumerGroupPB {
  private DumpConsumerGroupPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class DumpConsumerGroup extends
      com.google.protobuf.GeneratedMessage {
    // Use DumpConsumerGroup.newBuilder() to construct.
    private DumpConsumerGroup() {
      initFields();
    }
    private DumpConsumerGroup(boolean noInit) {}
    
    private static final DumpConsumerGroup defaultInstance;
    public static DumpConsumerGroup getDefaultInstance() {
      return defaultInstance;
    }
    
    public DumpConsumerGroup getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dp.blackhole.protocol.control.DumpConsumerGroupPB.internal_static_blackhole_DumpConsumerGroup_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dp.blackhole.protocol.control.DumpConsumerGroupPB.internal_static_blackhole_DumpConsumerGroup_fieldAccessorTable;
    }
    
    // required string groupId = 1;
    public static final int GROUPID_FIELD_NUMBER = 1;
    private boolean hasGroupId;
    private java.lang.String groupId_ = "";
    public boolean hasGroupId() { return hasGroupId; }
    public java.lang.String getGroupId() { return groupId_; }
    
    // required string topic = 2;
    public static final int TOPIC_FIELD_NUMBER = 2;
    private boolean hasTopic;
    private java.lang.String topic_ = "";
    public boolean hasTopic() { return hasTopic; }
    public java.lang.String getTopic() { return topic_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      if (!hasGroupId) return false;
      if (!hasTopic) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasGroupId()) {
        output.writeString(1, getGroupId());
      }
      if (hasTopic()) {
        output.writeString(2, getTopic());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasGroupId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getGroupId());
      }
      if (hasTopic()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getTopic());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup result;
      
      // Construct using com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup();
        return builder;
      }
      
      protected com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup.getDescriptor();
      }
      
      public com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup getDefaultInstanceForType() {
        return com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup) {
          return mergeFrom((com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup other) {
        if (other == com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup.getDefaultInstance()) return this;
        if (other.hasGroupId()) {
          setGroupId(other.getGroupId());
        }
        if (other.hasTopic()) {
          setTopic(other.getTopic());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setGroupId(input.readString());
              break;
            }
            case 18: {
              setTopic(input.readString());
              break;
            }
          }
        }
      }
      
      
      // required string groupId = 1;
      public boolean hasGroupId() {
        return result.hasGroupId();
      }
      public java.lang.String getGroupId() {
        return result.getGroupId();
      }
      public Builder setGroupId(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasGroupId = true;
        result.groupId_ = value;
        return this;
      }
      public Builder clearGroupId() {
        result.hasGroupId = false;
        result.groupId_ = getDefaultInstance().getGroupId();
        return this;
      }
      
      // required string topic = 2;
      public boolean hasTopic() {
        return result.hasTopic();
      }
      public java.lang.String getTopic() {
        return result.getTopic();
      }
      public Builder setTopic(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasTopic = true;
        result.topic_ = value;
        return this;
      }
      public Builder clearTopic() {
        result.hasTopic = false;
        result.topic_ = getDefaultInstance().getTopic();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:blackhole.DumpConsumerGroup)
    }
    
    static {
      defaultInstance = new DumpConsumerGroup(true);
      com.dp.blackhole.protocol.control.DumpConsumerGroupPB.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:blackhole.DumpConsumerGroup)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_DumpConsumerGroup_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_DumpConsumerGroup_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027DumpConsumerGroup.proto\022\tblackhole\"3\n\021" +
      "DumpConsumerGroup\022\017\n\007groupId\030\001 \002(\t\022\r\n\005to" +
      "pic\030\002 \002(\tB8\n!com.dp.blackhole.protocol.c" +
      "ontrolB\023DumpConsumerGroupPB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_blackhole_DumpConsumerGroup_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_blackhole_DumpConsumerGroup_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_DumpConsumerGroup_descriptor,
              new java.lang.String[] { "GroupId", "Topic", },
              com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup.class,
              com.dp.blackhole.protocol.control.DumpConsumerGroupPB.DumpConsumerGroup.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
