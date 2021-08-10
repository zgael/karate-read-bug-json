package examples;

import com.intuit.karate.JsonUtils;
import com.intuit.karate.graal.JsValue;
import org.graalvm.polyglot.Value;

public class Helper {

    public static void displayMap(Value toto) {
        JsValue jv = new JsValue(toto);
        String json = JsonUtils.toJson(jv.getValue());
        System.out.println(json);
    }

}
