package md53d92f57aad98d8db5b698f5d857713db;


public class RecyclerView_IOnItemTouchListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md53d92f57aad98d8db5b698f5d857713db.RecyclerView_IOnItemTouchListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInterceptTouchEvent:(Landroid/support/v7/widget/RecyclerView;Landroid/view/MotionEvent;)Z:GetOnInterceptTouchEvent_Landroid_support_v7_widget_RecyclerView_Landroid_view_MotionEvent_Handler:Android.Support.V7.Widget.RecyclerView/IOnItemTouchListenerInvoker, Xamarin.Android.Support.v7.RecyclerView\n" +
			"n_onRequestDisallowInterceptTouchEvent:(Z)V:GetOnRequestDisallowInterceptTouchEvent_ZHandler:Android.Support.V7.Widget.RecyclerView/IOnItemTouchListenerInvoker, Xamarin.Android.Support.v7.RecyclerView\n" +
			"n_onTouchEvent:(Landroid/support/v7/widget/RecyclerView;Landroid/view/MotionEvent;)V:GetOnTouchEvent_Landroid_support_v7_widget_RecyclerView_Landroid_view_MotionEvent_Handler:Android.Support.V7.Widget.RecyclerView/IOnItemTouchListenerInvoker, Xamarin.Android.Support.v7.RecyclerView\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V7.Widget.RecyclerView+IOnItemTouchListenerImplementor, Xamarin.Android.Support.v7.RecyclerView", RecyclerView_IOnItemTouchListenerImplementor.class, __md_methods);
	}


	public RecyclerView_IOnItemTouchListenerImplementor ()
	{
		super ();
		if (getClass () == RecyclerView_IOnItemTouchListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V7.Widget.RecyclerView+IOnItemTouchListenerImplementor, Xamarin.Android.Support.v7.RecyclerView", "", this, new java.lang.Object[] {  });
	}


	public boolean onInterceptTouchEvent (android.support.v7.widget.RecyclerView p0, android.view.MotionEvent p1)
	{
		return n_onInterceptTouchEvent (p0, p1);
	}

	private native boolean n_onInterceptTouchEvent (android.support.v7.widget.RecyclerView p0, android.view.MotionEvent p1);


	public void onRequestDisallowInterceptTouchEvent (boolean p0)
	{
		n_onRequestDisallowInterceptTouchEvent (p0);
	}

	private native void n_onRequestDisallowInterceptTouchEvent (boolean p0);


	public void onTouchEvent (android.support.v7.widget.RecyclerView p0, android.view.MotionEvent p1)
	{
		n_onTouchEvent (p0, p1);
	}

	private native void n_onTouchEvent (android.support.v7.widget.RecyclerView p0, android.view.MotionEvent p1);

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
