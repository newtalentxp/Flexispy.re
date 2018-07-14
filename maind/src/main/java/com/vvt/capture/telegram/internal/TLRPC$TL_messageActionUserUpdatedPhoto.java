package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageActionUserUpdatedPhoto
  extends TLRPC.MessageAction
{
  public static int constructor = 1431655761;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.UserProfilePhoto localUserProfilePhoto = TLRPC.UserProfilePhoto.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.newUserPhoto = localUserProfilePhoto;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.newUserPhoto.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageActionUserUpdatedPhoto.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */