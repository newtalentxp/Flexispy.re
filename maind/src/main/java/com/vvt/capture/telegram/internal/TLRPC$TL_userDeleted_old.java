package com.vvt.capture.telegram.internal;

public class TLRPC$TL_userDeleted_old
  extends TLRPC.TL_userDeleted_old2
{
  public static int constructor = -1298475060;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = i;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.first_name = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.last_name = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.first_name;
    paramAbstractSerializedData.writeString(str);
    str = this.last_name;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_userDeleted_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */