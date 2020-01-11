package md50d7658ca0fc01b95086956189e698682;


public class PushReceiver
	extends com.microsoft.appcenter.push.PushReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Microsoft.AppCenter.Push.PushReceiver, Microsoft.AppCenter.Push", PushReceiver.class, __md_methods);
	}


	public PushReceiver ()
	{
		super ();
		if (getClass () == PushReceiver.class)
			mono.android.TypeManager.Activate ("Microsoft.AppCenter.Push.PushReceiver, Microsoft.AppCenter.Push", "", this, new java.lang.Object[] {  });
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
