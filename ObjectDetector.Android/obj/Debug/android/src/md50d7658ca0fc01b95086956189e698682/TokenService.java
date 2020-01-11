package md50d7658ca0fc01b95086956189e698682;


public class TokenService
	extends com.google.firebase.iid.FirebaseInstanceIdService
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTokenRefresh:()V:GetOnTokenRefreshHandler\n" +
			"";
		mono.android.Runtime.register ("Microsoft.AppCenter.Push.TokenService, Microsoft.AppCenter.Push", TokenService.class, __md_methods);
	}


	public TokenService ()
	{
		super ();
		if (getClass () == TokenService.class)
			mono.android.TypeManager.Activate ("Microsoft.AppCenter.Push.TokenService, Microsoft.AppCenter.Push", "", this, new java.lang.Object[] {  });
	}


	public void onTokenRefresh ()
	{
		n_onTokenRefresh ();
	}

	private native void n_onTokenRefresh ();

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
