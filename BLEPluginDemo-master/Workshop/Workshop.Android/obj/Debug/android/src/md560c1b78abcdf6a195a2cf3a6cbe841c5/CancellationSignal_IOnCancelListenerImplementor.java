package md560c1b78abcdf6a195a2cf3a6cbe841c5;


public class CancellationSignal_IOnCancelListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md560c1b78abcdf6a195a2cf3a6cbe841c5.CancellationSignal_IOnCancelListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCancel:()V:GetOnCancelHandler:Android.Support.V4.OS.CancellationSignal/IOnCancelListenerInvoker, Xamarin.Android.Support.Compat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.OS.CancellationSignal+IOnCancelListenerImplementor, Xamarin.Android.Support.Compat", CancellationSignal_IOnCancelListenerImplementor.class, __md_methods);
	}


	public CancellationSignal_IOnCancelListenerImplementor ()
	{
		super ();
		if (getClass () == CancellationSignal_IOnCancelListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.OS.CancellationSignal+IOnCancelListenerImplementor, Xamarin.Android.Support.Compat", "", this, new java.lang.Object[] {  });
	}


	public void onCancel ()
	{
		n_onCancel ();
	}

	private native void n_onCancel ();

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
