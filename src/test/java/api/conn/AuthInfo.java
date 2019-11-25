package api.conn;

import org.json.JSONArray;
import org.json.JSONObject;

public class AuthInfo {

	private String domain;
	private String user;
	private String password;

	private String projectDomain;
	private String project;

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProjectDomain() {
		return projectDomain;
	}

	public void setProjectDomain(String projectDomain) {
		this.projectDomain = projectDomain;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String toJson() {

		JSONObject jObj = new JSONObject();

		JSONObject jDomain = new JSONObject();
		jDomain.put("name", domain);

		JSONObject jUser = new JSONObject();
		jUser.put("domain", jDomain);
		jUser.put("name", user);
		jUser.put("password", password);

		JSONObject jPassword = new JSONObject();
		jPassword.put("user", jUser);

		JSONArray jArrMethods = new JSONArray();
		jArrMethods.put("password");

		JSONObject jIdentity = new JSONObject();
		jIdentity.put("methods", jArrMethods);
		jIdentity.put("password", jPassword);

		JSONObject jAuth = new JSONObject();
		jAuth.put("identity", jIdentity);

		JSONObject jScopeProj = new JSONObject();
		jScopeProj.put("name", projectDomain);

		JSONObject jProject = new JSONObject();
		jProject.put("domain", jScopeProj);
		jProject.put("name", project);

		JSONObject jScope = new JSONObject();
		jScope.put("project", jProject);

		jAuth.put("scope", jScope);

		jObj.put("auth", jAuth);

		return jObj.toString();
	}
}
