package jiwoo.openstack.common;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParams {

	protected void set(JSONObject jObj, String name, Object value) {

		if (value != null) {
			if (value instanceof JSONObject) {
				JSONObject jValue = (JSONObject) value;
				if (!jValue.isEmpty())
					jObj.put(name, value);
			} else if (value instanceof JSONArray) {
				JSONArray jArrValue = (JSONArray) value;
				if (jArrValue.length() > 0)
					jObj.put(name, value);
			} else {
				jObj.put(name, value);
			}
		}
	}
}
