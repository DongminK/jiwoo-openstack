package jiwoo.openstack.keystone.request.auth.tokens.v3_10.params;

import org.json.JSONObject;

public class Auth {

	public static JSONObject passwordAuthWithUnscopeAuthorization(String _domain, String _name, String _password) {

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

	public static JSONObject passwordAuthWithScopeAuthorization(String _id, String _password, boolean _isAll) {

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

	public static JSONObject passwordAuthWithScopeAuthorization(String _domainId, String _id, String _password) {

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
}
