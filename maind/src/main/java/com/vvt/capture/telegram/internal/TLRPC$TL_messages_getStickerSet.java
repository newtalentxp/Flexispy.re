package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_getStickerSet
  extends TLObject
{
  public static int constructor = 639215886;
  public TLRPC.InputStickerSet stickerset;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_messages_stickerSet.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.stickerset.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_getStickerSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */