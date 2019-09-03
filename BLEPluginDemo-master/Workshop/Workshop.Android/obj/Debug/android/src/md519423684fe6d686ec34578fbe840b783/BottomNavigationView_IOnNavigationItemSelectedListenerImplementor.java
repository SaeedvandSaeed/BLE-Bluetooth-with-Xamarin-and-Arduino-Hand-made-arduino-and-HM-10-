package md519423684fe6d686ec34578fbe840b783;


public class BottomNavigationView_IOnNavigationItemSelectedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md519423684fe6d686ec34578fbe840b783.BottomNavigationView_IOnNavigationItemSelectedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNavigationItemSelected:(Landroid/view/MenuItem;)Z:GetOnNavigationItemSelected_Landroid_view_MenuItem_Handler:Android.Support.Design.Widget.BottomNavigationView/IOnNavigationItemSelectedListenerInvoker, Xamarin.Android.Support.Design\n" +
			"";
		mono.android.Runtime.register ("Android.Support.Design.Widget.BottomNavigationView+IOnNavigationItemSelectedListenerImplementor, Xamarin.Android.Support.Design", BottomNavigationView_IOnNavigationItemSelectedListenerImplementor.class, __md_methods);
	}


	public BottomNavigationView_IOnNavigationItemSelectedListenerImplementor ()
	{
		super ();
		if (getClass () == BottomNavigationView_IOnNavigationItemSelectedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.Design.Widget.BottomNavigationView+IOnNavigationItemSelectedListenerImplementor, Xamarin.Android.Support.Design", "", this, new java.lang.Object[] {  });
	}


	public boolean onNavigationItemSelected (android.view.MenuItem p0)
	{
		return n_onNavigationItemSelected (p0);
	}

	private native boolean n_onNavigationItemSelected (android.view.MenuItem p0);

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
