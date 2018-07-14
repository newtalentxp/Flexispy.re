package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessageActionTyping
  extends TLRPC.DecryptedMessageAction
{
  public static int constructor = -860719551;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.SendMessageAction localSendMessageAction = TLRPC.SendMessageAction.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.action = localSendMessageAction;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.action.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionTyping.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */