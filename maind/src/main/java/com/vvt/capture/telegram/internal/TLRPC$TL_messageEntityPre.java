package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageEntityPre
  extends TLRPC.MessageEntity
{
  public static int constructor = 1938967520;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.offset = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.length = i;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.language = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.offset;
    paramAbstractSerializedData.writeInt32(i);
    i = this.length;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.language;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageEntityPre.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */