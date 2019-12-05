package jiwoo.openstack.keystone.request.auth.tokens.v3_10.params;

import org.json.JSONObject;

public class Auth {

	public static JSONObject passwordAuthWithUnscope(String _domain, String _name, String _password) {

		Domain domain = new Domain();
		domain.setName(_domain);

		User user = new User();
		user.setDomain(domain);
		user.setName(_name);
		user.setPassword(_password);

		Password password = new Password();
		password.setUser(user);

		Methods methods = new Methods();
		methods.add("password");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setPassword(password);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

	public static JSONObject passwordAuthWithSystemScope(String _id, String _password, boolean _isAll) {

		User user = new User();
		user.setId(_id);
		user.setPassword(_password);

		Password password = new Password();
		password.setUser(user);

		Methods methods = new Methods();
		methods.add("password");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setPassword(password);

		System system = new System();
		system.setAll(_isAll);

		Scope scope = new Scope();
		scope.setSystem(system);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());
		jAuth.put("scope", scope.toJSONObject());

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

	public static JSONObject passwordAuthWithDomainIdScope(String _domainId, String _id, String _password) {

		User user = new User();
		user.setId(_id);
		user.setPassword(_password);

		Password password = new Password();
		password.setUser(user);

		Methods methods = new Methods();
		methods.add("password");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setPassword(password);

		Domain domain = new Domain();
		domain.setId(_domainId);

		Scope scope = new Scope();
		scope.setDomain(domain);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());
		jAuth.put("scope", scope.toJSONObject());

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

	public static JSONObject passwordAuthWithDomainNameScope(String _domainName, String _id, String _password) {

		User user = new User();
		user.setId(_id);
		user.setPassword(_password);

		Password password = new Password();
		password.setUser(user);

		Methods methods = new Methods();
		methods.add("password");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setPassword(password);

		Domain domain = new Domain();
		domain.setName(_domainName);

		Scope scope = new Scope();
		scope.setDomain(domain);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());
		jAuth.put("scope", scope.toJSONObject());

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

	public static JSONObject passwordAuthWithProjectIdScope(String _projectId, String _id, String _password) {

		User user = new User();
		user.setId(_id);
		user.setPassword(_password);

		Password password = new Password();
		password.setUser(user);

		Methods methods = new Methods();
		methods.add("password");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setPassword(password);

		Project project = new Project();
		project.setId(_projectId);

		Scope scope = new Scope();
		scope.setProject(project);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());
		jAuth.put("scope", scope.toJSONObject());

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

	public static JSONObject passwordAuthWithProjectNameScope(String _projectName, String _domainId, String _id,
			String _password) {

		User user = new User();
		user.setId(_id);
		user.setPassword(_password);

		Password password = new Password();
		password.setUser(user);

		Methods methods = new Methods();
		methods.add("password");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setPassword(password);

		Domain domain = new Domain();
		domain.setId(_domainId);

		Project project = new Project();
		project.setName(_projectName);
		project.setDomain(domain);

		Scope scope = new Scope();
		scope.setProject(project);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());
		jAuth.put("scope", scope.toJSONObject());

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

	public static JSONObject passwordAuthWithExplicitUnscope(String _id, String _password) {

		User user = new User();
		user.setId(_id);
		user.setPassword(_password);

		Password password = new Password();
		password.setUser(user);

		Methods methods = new Methods();
		methods.add("password");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setPassword(password);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());
		jAuth.put("scope", "unscoped");

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

	public static JSONObject tokenAuthWithUnscope(String _tokenId) {

		Token token = new Token();
		token.setId(_tokenId);

		Methods methods = new Methods();
		methods.add("token");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setToken(token);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

	public static JSONObject tokenAuthWithSystemScope(String _tokenId, boolean _isAll) {

		Token token = new Token();
		token.setId(_tokenId);

		Methods methods = new Methods();
		methods.add("token");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setToken(token);

		System system = new System();
		system.setAll(_isAll);

		Scope scope = new Scope();
		scope.setSystem(system);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());
		jAuth.put("scope", scope.toJSONObject());

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

	public static JSONObject tokenAuthWithDomainIdScope(String _tokenId, String _domainId) {

		Token token = new Token();
		token.setId(_tokenId);

		Methods methods = new Methods();
		methods.add("token");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setToken(token);

		Domain domain = new Domain();
		domain.setId(_domainId);

		Scope scope = new Scope();
		scope.setDomain(domain);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());
		jAuth.put("scope", scope.toJSONObject());

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

	public static JSONObject tokenAuthWithDomainNameScope(String _tokenId, String _domainName) {

		Token token = new Token();
		token.setId(_tokenId);

		Methods methods = new Methods();
		methods.add("token");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setToken(token);

		Domain domain = new Domain();
		domain.setName(_domainName);

		Scope scope = new Scope();
		scope.setDomain(domain);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());
		jAuth.put("scope", scope.toJSONObject());

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

	public static JSONObject tokenAuthWithProjectIdScope(String _tokenId, String _projectId) {

		Token token = new Token();
		token.setId(_tokenId);

		Methods methods = new Methods();
		methods.add("token");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setToken(token);

		Project project = new Project();
		project.setId(_projectId);

		Scope scope = new Scope();
		scope.setProject(project);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());
		jAuth.put("scope", scope.toJSONObject());

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

	public static JSONObject tokenAuthWithProjectNameScope(String _tokenId, String _projectId, String _domainId) {

		Token token = new Token();
		token.setId(_tokenId);

		Methods methods = new Methods();
		methods.add("token");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setToken(token);

		Domain domain = new Domain();
		domain.setId(_domainId);

		Project project = new Project();
		project.setId(_projectId);
		project.setDomain(domain);

		Scope scope = new Scope();
		scope.setProject(project);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());
		jAuth.put("scope", scope.toJSONObject());

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

	public static JSONObject tokenAuthWithExplicitUnscope(String _tokenId) {

		Token token = new Token();
		token.setId(_tokenId);

		Methods methods = new Methods();
		methods.add("token");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setToken(token);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());
		jAuth.put("scope", "unscoped");

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

	public static JSONObject applicationCridential(String id, String secret) {

		ApplicationCredential applicationCredential = new ApplicationCredential();
		applicationCredential.setId(id);
		applicationCredential.setSecret(secret);

		Methods methods = new Methods();
		methods.add("application_credential");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setApplicationCredential(applicationCredential);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

	public static JSONObject applicationCridential(String name, String id, String secret) {

		User user = new User();
		user.setId(id);

		ApplicationCredential applicationCredential = new ApplicationCredential();
		applicationCredential.setName(name);
		applicationCredential.setSecret(secret);
		applicationCredential.setUser(user);

		Methods methods = new Methods();
		methods.add("application_credential");

		Identity identity = new Identity();
		identity.setMethods(methods);
		identity.setApplicationCredential(applicationCredential);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", identity.toJSONObject());

		JSONObject jObj = new JSONObject();
		jObj.put("auth", jAuth);

		return jObj;

	}

}
