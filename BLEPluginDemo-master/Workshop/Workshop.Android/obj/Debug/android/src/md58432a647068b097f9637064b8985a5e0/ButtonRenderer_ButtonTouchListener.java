package md58432a647068b097f9637064b8985a5e0;


public class ButtonRenderer_ButtonTouchListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.views.View_IOnTouchListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTouch:(Landroid/view/View;Landroid/view/MotionEvent;)Z:GetOnTouch_Landroid_view_View_Landroid_view_MotionEvent_Handler:Android.Views.View/IOnTouchListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Forms.Platform.Android.AppCompat.ButtonRenderer+ButtonTouchListener, Xamarin.Forms.Platform.Android", ButtonRenderer_ButtonTouchListener.class, __md_methods);
	}


	public ButtonRenderer_ButtonTouchListener ()
	{
		super ();
		if (getClass () == ButtonRenderer_ButtonTouchListener.class)
			mono.android.TypeManager.Activate ("Xamarin.Forms.Platform.Android.AppCompat.ButtonRenderer+ButtonTouchListener, Xamarin.Forms.Platform.Android", "", this, new java.lang.Object[] {  });
	}


	public boolean onTouch (android.view.View p0, android.view.MotionEvent p1)
	{
		return n_onTouch (p0, p1);
	}

	private native boolean n_onTouch (android.view.View p0, android.view.MotionEvent p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
