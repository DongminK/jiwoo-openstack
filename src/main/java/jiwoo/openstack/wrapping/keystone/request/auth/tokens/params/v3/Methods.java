package jiwoo.openstack.wrapping.keystone.request.auth.tokens.params.v3;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

import jiwoo.openstack.wrapping.keystone.request.JsonParams;

public class Methods extends JsonParams {

	private List<String> ltMethods = new ArrayList<String>();

	public void add(String method) {
		ltMethods.add(method);
	}

	public void remove(int idx) {
		ltMethods.remove(idx);
	}

	public void remove(String value) {
		ltMethods.remove(value);
	}

	public void clear() {
		ltMethods.clear();
	}

	public JSONArray toJSONArray() {
		JSONArray jArr = new JSONArray();

		for (String method : ltMethods) {
			jArr.put(method);
		}

		return jArr;
	}

}
