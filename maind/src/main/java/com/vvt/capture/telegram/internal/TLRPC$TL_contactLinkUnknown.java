package com.vvt.capture.telegram.internal;

public class TLRPC$TL_contactLinkUnknown
  extends TLRPC.ContactLink
{
  public static int constructor = 1599050311;
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_contactLinkUnknown.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */