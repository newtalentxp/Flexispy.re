package com.vvt.capture.telegram.internal;

public class TLRPC$TL_photos_uploadProfilePhoto
  extends TLObject
{
  public static int constructor = -720397176;
  public String caption;
  public TLRPC.InputPhotoCrop crop;
  public TLRPC.InputFile file;
  public TLRPC.InputGeoPoint geo_point;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_photos_photo.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.file.serializeToStream(paramAbstractSerializedData);
    String str = this.caption;
    paramAbstractSerializedData.writeString(str);
    this.geo_point.serializeToStream(paramAbstractSerializedData);
    this.crop.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_photos_uploadProfilePhoto.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */