package com.secl.metrica.utils;




public class ConnectionManager {
	
	/*@Value("${couch.url}") private String couchUrl;
	@Value("${couch.bucket}") private String couchBucket;
	@Value("${couch.password}") private String couchPassword;
	@Value("${couch.viewmode}") private String couchViewmode;
	
	private static CouchbaseClient client;
	
	@PostConstruct
	public void initIt() throws Exception {
		ArrayList<URI> nodes = new ArrayList<URI>();
		System.setProperty("viewmode", couchViewmode);
	    nodes.add(URI.create(couchUrl));
	    try 
	    {
	      client = new CouchbaseClient(nodes, couchBucket, couchPassword);
	    } 
	    catch (IOException e) 
	    {
	    	e.printStackTrace();
	    }
	}
	
	@PreDestroy
	public void cleanUp() throws Exception 
	{
		System.out.println("Spring Container is destroy! Customer clean up");
		client.shutdown();
	}
	
	public static CouchbaseClient getInstance() 
	{
	    return client;
	}

	public String getCouchUrl() {
		return couchUrl;
	}

	public void setCouchUrl(String couchUrl) {
		this.couchUrl = couchUrl;
	}

	public String getCouchBucket() {
		return couchBucket;
	}

	public void setCouchBucket(String couchBucket) {
		this.couchBucket = couchBucket;
	}

	public String getCouchPassword() {
		return couchPassword;
	}

	public void setCouchPassword(String couchPassword) {
		this.couchPassword = couchPassword;
	}

	public String getCouchViewmode() {
		return couchViewmode;
	}

	public void setCouchViewmode(String couchViewmode) {
		this.couchViewmode = couchViewmode;
	}*/
}
