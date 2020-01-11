package md50f62651422ea8046e3a851513eeeed93;


public class DeepLinkActivity
	extends com.microsoft.appcenter.distribute.DeepLinkActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Microsoft.AppCenter.Distribute.DeepLinkActivity, Microsoft.AppCenter.Distribute.Android.Bindings", DeepLinkActivity.class, __md_methods);
	}


	public DeepLinkActivity ()
	{
		super ();
		if (getClass () == DeepLinkActivity.class)
			mono.android.TypeManager.Activate ("Microsoft.AppCenter.Distribute.DeepLinkActivity, Microsoft.AppCenter.Distribute.Android.Bindings", "", this, new java.lang.Object[] {  });
	}

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
