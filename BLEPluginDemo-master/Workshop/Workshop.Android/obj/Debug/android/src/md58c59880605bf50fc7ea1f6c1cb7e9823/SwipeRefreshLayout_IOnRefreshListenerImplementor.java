package md58c59880605bf50fc7ea1f6c1cb7e9823;


public class SwipeRefreshLayout_IOnRefreshListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md58c59880605bf50fc7ea1f6c1cb7e9823.SwipeRefreshLayout_IOnRefreshListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRefresh:()V:GetOnRefreshHandler:Android.Support.V4.Widget.SwipeRefreshLayout/IOnRefreshListenerInvoker, Xamarin.Android.Support.Core.UI\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.Widget.SwipeRefreshLayout+IOnRefreshListenerImplementor, Xamarin.Android.Support.Core.UI", SwipeRefreshLayout_IOnRefreshListenerImplementor.class, __md_methods);
	}


	public SwipeRefreshLayout_IOnRefreshListenerImplementor ()
	{
		super ();
		if (getClass () == SwipeRefreshLayout_IOnRefreshListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.Widget.SwipeRefreshLayout+IOnRefreshListenerImplementor, Xamarin.Android.Support.Core.UI", "", this, new java.lang.Object[] {  });
	}


	public void onRefresh ()
	{
		n_onRefresh ();
	}

	private native void n_onRefresh ();

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
