package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_getStickers
  extends TLObject
{
  public static int constructor = -1373446075;
  public String emoticon;
  public String hash;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.messages_Stickers.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.emoticon;
    paramAbstractSerializedData.writeString(str);
    str = this.hash;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_getStickers.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */