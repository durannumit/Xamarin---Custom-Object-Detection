package md50f62651422ea8046e3a851513eeeed93;


public class DownloadManagerReceiver
	extends com.microsoft.appcenter.distribute.DownloadManagerReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Microsoft.AppCenter.Distribute.DownloadManagerReceiver, Microsoft.AppCenter.Distribute.Android.Bindings", DownloadManagerReceiver.class, __md_methods);
	}


	public DownloadManagerReceiver ()
	{
		super ();
		if (getClass () == DownloadManagerReceiver.class)
			mono.android.TypeManager.Activate ("Microsoft.AppCenter.Distribute.DownloadManagerReceiver, Microsoft.AppCenter.Distribute.Android.Bindings", "", this, new java.lang.Object[] {  });
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
