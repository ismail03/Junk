package stc.com.echannels.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

public class JsonDateValueProcessor implements JsonValueProcessor
{
	private static final SimpleDateFormat formatter_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public JsonDateValueProcessor()
	{

	}

	public Object processArrayValue(Object value, JsonConfig jsonConfig)
	{
		return process(value, jsonConfig);
	}

	public Object processObjectValue(String key, Object value, JsonConfig jsonConfig)
	{
		return process(value, jsonConfig);
	}

	private Object process(Object value, JsonConfig jsonConfig)
	{
		if (value instanceof Date)
		{
			return formatter_date.format((Date) value);
		}
		else
		{
			return value == null ? null : value.toString();
		}
	}
}