package com.vvt.capture.telegram.internal;

public class TLRPC$TL_account_setAccountTTL
  extends TLObject
{
  public static int constructor = 608323678;
  public TLRPC.TL_accountDaysTTL ttl;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.ttl.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_account_setAccountTTL.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */