package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_toggleChatAdmins
  extends TLObject
{
  public static int constructor = -326379039;
  public int chat_id;
  public boolean enabled;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Updates.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.chat_id;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.enabled;
    paramAbstractSerializedData.writeBool(bool);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_toggleChatAdmins.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */