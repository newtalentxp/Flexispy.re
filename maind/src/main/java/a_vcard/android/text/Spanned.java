package a_vcard.android.text;

public abstract interface Spanned
  extends CharSequence
{
  public static final int SPAN_COMPOSING = 256;
  public static final int SPAN_EXCLUSIVE_EXCLUSIVE = 33;
  public static final int SPAN_EXCLUSIVE_INCLUSIVE = 34;
  public static final int SPAN_INCLUSIVE_EXCLUSIVE = 17;
  public static final int SPAN_INCLUSIVE_INCLUSIVE = 18;
  public static final int SPAN_INTERMEDIATE = 512;
  public static final int SPAN_MARK_MARK = 17;
  public static final int SPAN_MARK_POINT = 18;
  public static final int SPAN_PARAGRAPH = 51;
  public static final int SPAN_POINT_MARK = 33;
  public static final int SPAN_POINT_MARK_MASK = 51;
  public static final int SPAN_POINT_POINT = 34;
  public static final int SPAN_PRIORITY = 16711680;
  public static final int SPAN_PRIORITY_SHIFT = 16;
  public static final int SPAN_USER = -16777216;
  public static final int SPAN_USER_SHIFT = 24;
  
  public abstract int getSpanEnd(Object paramObject);
  
  public abstract int getSpanFlags(Object paramObject);
  
  public abstract int getSpanStart(Object paramObject);
  
  public abstract Object[] getSpans(int paramInt1, int paramInt2, Class paramClass);
  
  public abstract int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/text/Spanned.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */