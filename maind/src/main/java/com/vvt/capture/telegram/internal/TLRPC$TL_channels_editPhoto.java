package com.vvt.capture.telegram.internal;

public class TLRPC$TL_channels_editPhoto
  extends TLObject
{
  public static int constructor = -248621111;
  public TLRPC.InputChannel channel;
  public TLRPC.InputChatPhoto photo;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Updates.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.channel.serializeToStream(paramAbstractSerializedData);
    this.photo.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_channels_editPhoto.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */