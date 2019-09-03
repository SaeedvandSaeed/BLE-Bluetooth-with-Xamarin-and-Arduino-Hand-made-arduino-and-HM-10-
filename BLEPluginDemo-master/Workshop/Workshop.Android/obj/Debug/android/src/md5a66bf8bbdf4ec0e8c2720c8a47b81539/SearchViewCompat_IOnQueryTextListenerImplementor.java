package md5a66bf8bbdf4ec0e8c2720c8a47b81539;


public class SearchViewCompat_IOnQueryTextListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md5a66bf8bbdf4ec0e8c2720c8a47b81539.SearchViewCompat_IOnQueryTextListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onQueryTextChange:(Ljava/lang/String;)Z:GetOnQueryTextChange_Ljava_lang_String_Handler:Android.Support.V4.Widget.SearchViewCompat/IOnQueryTextListenerInvoker, Xamarin.Android.Support.Compat\n" +
			"n_onQueryTextSubmit:(Ljava/lang/String;)Z:GetOnQueryTextSubmit_Ljava_lang_String_Handler:Android.Support.V4.Widget.SearchViewCompat/IOnQueryTextListenerInvoker, Xamarin.Android.Support.Compat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.Widget.SearchViewCompat+IOnQueryTextListenerImplementor, Xamarin.Android.Support.Compat", SearchViewCompat_IOnQueryTextListenerImplementor.class, __md_methods);
	}


	public SearchViewCompat_IOnQueryTextListenerImplementor ()
	{
		super ();
		if (getClass () == SearchViewCompat_IOnQueryTextListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.Widget.SearchViewCompat+IOnQueryTextListenerImplementor, Xamarin.Android.Support.Compat", "", this, new java.lang.Object[] {  });
	}


	public boolean onQueryTextChange (java.lang.String p0)
	{
		return n_onQueryTextChange (p0);
	}

	private native boolean n_onQueryTextChange (java.lang.String p0);


	public boolean onQueryTextSubmit (java.lang.String p0)
	{
		return n_onQueryTextSubmit (p0);
	}

	private native boolean n_onQueryTextSubmit (java.lang.String p0);

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
